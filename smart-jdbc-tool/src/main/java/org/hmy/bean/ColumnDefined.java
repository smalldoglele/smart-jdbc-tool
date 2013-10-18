package org.hmy.bean;

public class ColumnDefined {
    
    /* 列序号 */
    private String columnNumber;
    
    /* 列名称 */
    private String columnName;
    
    /* 列类型 */
    private String columnType;
    
    /* 列长度 */
    private Integer length;
    
    /* 列整数位 */
    private Integer precision;
    
    /* 列小数点位 */
    private Integer scale;
    
    /* 是否为空 0/1 */
    private Integer isnullable;
    
    /* 是否是自增列 0/1 */
    private Integer isidentity;
    
    /* 默认值 */
    private String defaultValue;
    
    /* 列注释 */
    private String columnComment;
    
    public String getColumnName() {
        return columnName;
    }
    
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
    
    public String getColumnType() {
        return columnType;
    }
    
    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }
    
    public String getColumnNumber() {
        return columnNumber;
    }
    
    public void setColumnNumber(String columnNumber) {
        this.columnNumber = columnNumber;
    }
    
    public Integer getLength() {
        return length;
    }
    
    public void setLength(Integer length) {
        this.length = length;
    }
    
    public Integer getPrecision() {
        return precision;
    }
    
    public void setPrecision(Integer precision) {
        this.precision = precision;
    }
    
    public Integer getScale() {
        return scale;
    }
    
    public void setScale(Integer scale) {
        this.scale = scale;
    }
    
    public Integer getIsnullable() {
        return isnullable;
    }
    
    public void setIsnullable(Integer isnullable) {
        this.isnullable = isnullable;
    }
    
    public Integer getIsidentity() {
        return isidentity;
    }
    
    public void setIsidentity(Integer isidentity) {
        this.isidentity = isidentity;
    }
    
    public String getDefaultValue() {
        return defaultValue;
    }
    
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    public String getColumnComment() {
        return columnComment;
    }
    
    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }
}
