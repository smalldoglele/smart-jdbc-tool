package org.smart.jdbc.tool.object;

public class Field {
    
    private String name;
    
    private String type;
    
    /* 列的注释 */
    private Comment comment = new Comment();
    
    private String idAnnotaction;
    
    private String annotaction;
    
    private String setterMethodName;
    
    private String getterMethodName;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public Comment getComment() {
        return comment;
    }
    
    public void setComment(Comment comment) {
        this.comment = comment;
    }
    
    public String getIdAnnotaction() {
        return idAnnotaction;
    }
    
    public void setIdAnnotaction(String idAnnotaction) {
        this.idAnnotaction = idAnnotaction;
    }
    
    public String getAnnotaction() {
        return annotaction;
    }
    
    public void setAnnotaction(String annotaction) {
        this.annotaction = annotaction;
    }
    
    public String getSetterMethodName() {
        return setterMethodName;
    }
    
    public void setSetterMethodName(String setterMethodName) {
        this.setterMethodName = setterMethodName;
    }
    
    public String getGetterMethodName() {
        return getterMethodName;
    }
    
    public void setGetterMethodName(String getterMethodName) {
        this.getterMethodName = getterMethodName;
    }
}
