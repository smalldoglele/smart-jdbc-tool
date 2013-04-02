package org.hmy;

import java.util.List;

import org.hmy.util.JdbcUtil;

public class SmartJdbcToolkit {
	public static void main(String[] args) {
		JdbcUtil jdbcUtitl = new JdbcUtil();
		List<String> tableNames = jdbcUtitl.getTableNames();
		for (String tableName : tableNames) {
			EntityBeanBuilder builder = new EntityBeanBuilder();
			builder.setTableName(tableName);
			builder.setPrimaryKeys(jdbcUtitl.getPrimaryKeysByTableName(tableName));
			builder.setColumnDefineds(jdbcUtitl.getColumnsByTableName(tableName));
			EntityBeanRender render = new EntityBeanRender();
			render.render(builder.builder());
		}
		System.out.println("共生成" + tableNames.size() + "个POJO实体类!");
	}
}
