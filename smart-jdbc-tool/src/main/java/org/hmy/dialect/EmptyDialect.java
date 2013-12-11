package org.hmy.dialect;

public class EmptyDialect implements Dialect {
    
    public String getLimitString(String query, boolean hasOffset) {
        return null;
    }
    
    public String getLimitString(String query, int offset, int limit) {
        return null;
    }
    
    public String getColumnMetaDateSqlByTableName(String tableName) {
        return null;
    }
    
    public String getTableMetaDateSql(String tablePattern) {
        return null;
    }
    
}
