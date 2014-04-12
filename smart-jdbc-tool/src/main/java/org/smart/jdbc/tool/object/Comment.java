package org.smart.jdbc.tool.object;

/**
 * 注释
 * @since 2013年9月2日 下午6:01:47
 * @author walden
 */
public class Comment {
    
    /* 第一个空白符前的部分做表名或者是列名 */
    private String label;
    
    /* 第一个空白符后的部分做注释内容 */
    private String content;
    
    public String getLabel() {
        return label;
    }
    
    public void setLabel(String label) {
        this.label = label;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
}
