package org.hmy;

import java.util.List;

import org.hmy.bean.TableDefined;
import org.hmy.util.JdbcUtil;

public class SmartJdbcToolkit {
    
    public static void main(String[] args) {
        JdbcUtil jdbcUtitl = new JdbcUtil();
        List<TableDefined> tableDefineds = jdbcUtitl.getTableDefineds();
        for (TableDefined table : tableDefineds) {
            String tableName = table.getTableName();
            EntityBeanBuilder builder = new EntityBeanBuilder();
            builder.setTableDefined(table);
            builder.setPrimaryKeys(jdbcUtitl.getPrimaryKeysByTableName(tableName));
            builder.setColumnDefineds(jdbcUtitl.getColumnsByTableName(tableName));
            EntityBeanRender render = new EntityBeanRender();
            render.render(builder.builder());
        }
        System.out.println("共生成" + tableDefineds.size() + "个POJO实体类!");
    }
}
