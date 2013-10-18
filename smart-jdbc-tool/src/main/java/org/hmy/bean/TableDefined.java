/**
 * 
 */
package org.hmy.bean;

/**
 * 数据表定义对象
 * @since 2013-8-17 下午8:02:12
 * @author walden
 */
public class TableDefined {
    
    /* 表名 */
    private String tableName;
    
    /* 表注释 */
    private String tableComment;
    
    public String getTableName() {
        return tableName;
    }
    
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    public String getTableComment() {
        return tableComment;
    }
    
    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }
    
}
