package org.smart.jdbc.tool.util;

import java.util.List;

import org.smart.jdbc.tool.object.ColumnDefined;
import org.smart.jdbc.tool.object.TableDefined;

/**
 * @since 2014-4-12 上午10:41:48
 * @author walden
 */
public interface IMetaData {
    
    /**
     * 根据表名从jdbc获得列定义类
     * @param tableName
     * @return
     * @author walden
     */
    public List<ColumnDefined> getColumnDefinedsByTableName(String tableName);
    
    /**
     * 根据表名从jdbc获得该表的主键名字
     * @param tableName
     * @return
     * @author walden
     */
    public List<String> getPrimaryKeysByTableName(String tableName);
    
    /**
     * 从jdbc获得表定义类
     * @return
     * @author walden
     */
    public List<TableDefined> getTableDefineds();
    
}
