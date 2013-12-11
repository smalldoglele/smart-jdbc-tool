package org.hmy.dialect;

public class MySQLDialect implements Dialect {
    
    public String getLimitString(String query, int offset, int limit) {
        return new StringBuffer(query.length() + 20).append(query).append(String.format(" limit %s offset %s", limit, offset)).toString();
    }
    
    public String getColumnMetaDateSqlByTableName(String tableName) {
        return null;
    }
    
    public String getTableMetaDateSql(String tablePattern) {
        return null;
    }
    
}
