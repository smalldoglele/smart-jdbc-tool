package org.hmy.bean;

import java.util.ArrayList;
import java.util.List;

public class EntityBean {
    
    private String beanName;
    
    private String tableName;
    
    /* 表注释 */
    private Comment tableComment = new Comment();
    
    private List<String> imports = new ArrayList<String>();
    
    private List<Field> fields = new ArrayList<Field>();
    
    private String createDate;/* 创建时间 yyyy-MM-dd HH:mm:ss.SSS */
    
    public String getBeanName() {
        return beanName;
    }
    
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
    
    public String getTableName() {
        return tableName;
    }
    
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    public List<String> getImports() {
        return imports;
    }
    
    public void setImports(List<String> imports) {
        this.imports = imports;
    }
    
    public List<Field> getFields() {
        return fields;
    }
    
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
    
    public String getCreateDate() {
        return createDate;
    }
    
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    
    public Comment getTableComment() {
        return tableComment;
    }
    
    public void setTableComment(Comment tableComment) {
        this.tableComment = tableComment;
    }
    
}
