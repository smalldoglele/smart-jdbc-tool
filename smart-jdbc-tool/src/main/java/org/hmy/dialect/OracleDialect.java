package org.hmy.dialect;

public class OracleDialect implements Dialect {
    
    public String getLimitString(String sql, int offset, int limit) {
        sql = sql.trim();
        boolean hasOffset = offset > 0;
        boolean isForUpdate = false;
        if (sql.toLowerCase().endsWith(" for update")) {
            sql = sql.substring(0, sql.length() - 11);
            isForUpdate = true;
        }
        
        StringBuffer pagingSelect = new StringBuffer(sql.length() + 100);
        if (hasOffset) {
            pagingSelect.append("select * from ( select row_.*, rownum rownum_ from ( ");
        } else {
            pagingSelect.append("select * from ( ");
        }
        pagingSelect.append(sql);
        if (hasOffset) {
            pagingSelect.append(" ) row_ where rownum <= " + (offset + limit) + ") where rownum_ > " + offset);
        } else {
            pagingSelect.append(" ) where rownum <= " + limit);
        }
        
        if (isForUpdate) {
            pagingSelect.append(" for update");
        }
        
        return pagingSelect.toString();
    }
    
    public String getColumnMetaDateSqlByTableName(String tableName) {
        return null;
    }
    
    public String getTableMetaDateSql(String tablePattern) {
        return null;
    }
    
}
