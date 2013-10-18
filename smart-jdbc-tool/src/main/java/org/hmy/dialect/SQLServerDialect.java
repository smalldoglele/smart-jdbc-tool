package org.hmy.dialect;

public class SQLServerDialect implements Dialect {
    
    static int getAfterSelectInsertPoint(String sql) {
        int selectIndex = sql.toLowerCase().indexOf("select");
        final int selectDistinctIndex = sql.toLowerCase().indexOf("select distinct");
        return selectIndex + (selectDistinctIndex == selectIndex ? 15 : 6);
    }
    
    public String getLimitString(String sql, int offset, int limit) {
        StringBuffer pagingSelect = null;
        if (offset == 0) {
            pagingSelect = new StringBuffer(sql.length() + 8).append(sql).insert(getAfterSelectInsertPoint(sql), " top " + limit);
        } else {
            int startOfSelect = sql.toLowerCase().indexOf("select");
            int orderByIndex = sql.toLowerCase().indexOf("order by");
            String selectString = hasDistinct(sql) ? "select distinct " : "select ";
            pagingSelect = new StringBuffer(sql.length() + 100).append(sql.substring(0, startOfSelect)).append("select * from ( ").append(selectString).append(getRowNumber(sql));
            pagingSelect.append(sql.substring(getAfterSelectInsertPoint(sql), orderByIndex));
            
            pagingSelect.append(" ) as row_ where rownum_ >").append(offset).append(" and rownum_ <=").append(offset + limit);
        }
        return pagingSelect.toString();
    }
    
    private static boolean hasDistinct(String sql) {
        return sql.toLowerCase().indexOf("select distinct") >= 0;
    }
    
    private String getRowNumber(String sql) {
        StringBuffer rownumber = new StringBuffer(50).append("row_number() over(");
        int orderByIndex = sql.toLowerCase().indexOf("order by");
        if (orderByIndex > 0) {
            rownumber.append(sql.substring(orderByIndex));
        } else {
            throw new UnsupportedOperationException("分页的SQL语句必须要有order by语句!");
        }
        rownumber.append(") as rownum_,");
        return rownumber.toString();
    }
    
    public String getColumnMetaDateSqlByTableName(String tableName) {
        StringBuffer sql = new StringBuffer("select sc.colorder as columnNumber,sc.[name] as columnName,st.[name] as columnType,");
        sql.append("isnull(cmt.text,'') defaultValue,case when columnproperty(sc.id,sc.[name],'IsIdentity')=1 then 1 else 0 end as isidentity,");
        sql.append("sc.length as length,columnproperty(sc.id,sc.[name],'PRECISION') as precision,isnull(columnproperty(sc.id,sc.[name],'SCALE'),0) as scale,");
        sql.append("isnull(ep1.[value],'') as columnComment,case when sc.isnullable=1 then 1 else 0 end as isnullable");
        sql.append(" from syscolumns sc left join systypes st on sc.xusertype=st.xusertype");
        sql.append(" inner join sysobjects so on sc.id=so.id and so.xtype in ('U','V') and so.[name]<>'dtproperties'");
        sql.append(" left join syscomments cmt on sc.cdefault=cmt.id");
        sql.append(" left join sys.extended_properties ep1 on sc.id=ep1.major_id and sc.colid=ep1.minor_id");
        sql.append(" left join sys.extended_properties ep2 on so.id=ep2.major_id and ep2.minor_id=0");
        sql.append(" where so.[name]='" + tableName + "' order by sc.id,sc.colorder");
        return sql.toString();
    }
    
    public String getTableMetaDateSql(String tablePattern) {
        StringBuffer sql = new StringBuffer("select s.name as tableName,ep.[value] as tableComment from sysobjects s left join sys.extended_properties ep");
        sql.append(" on s.id=ep.major_id and ep.minor_id=0 where s.xtype in ('U','V') and s.name like '" + tablePattern + "' order by s.name");
        return sql.toString();
    }
    
}
