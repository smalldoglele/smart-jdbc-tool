package org.hmy.dialect;

public interface Dialect {
    
    /**
     * 在SQL上添加分页信息语句
     * @param query
     * @param offset
     * @param limit
     * @return
     * @author walden
     */
    public String getLimitString(String query, int offset, int limit);
    
    /**
     * 根据表名获得列的元数据信息
     * @param tableName
     * @return
     * @author walden
     */
    public String getColumnMetaDateSqlByTableName(String tableName);
    
    /**
     * 获得所有用户表的元数据信息
     * @param tablePattern eg:t_%就是获得所有匹配t_%的所有表
     * @return
     * @author walden
     */
    public String getTableMetaDateSql(String tablePattern);
    
}
