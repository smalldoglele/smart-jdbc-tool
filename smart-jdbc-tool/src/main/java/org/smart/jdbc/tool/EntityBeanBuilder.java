package org.smart.jdbc.tool;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.smart.jdbc.tool.object.ColumnDefined;
import org.smart.jdbc.tool.object.Comment;
import org.smart.jdbc.tool.object.EntityBean;
import org.smart.jdbc.tool.object.Field;
import org.smart.jdbc.tool.object.TableDefined;
import org.smart.jdbc.tool.util.Constant;

public class EntityBeanBuilder implements Builder<EntityBean> {
    
    /* 注释分割的正则表达式 */
    private final String COMMENT_LABEL_CONTENT_PATTERN = "(.+?)\\s+(.|\\s)*$";
    
    private final String JAVA_LANG = "java.lang";
    
    private TableDefined tableDefined;
    
    private List<String> primaryKeys = new ArrayList<String>();
    
    private List<ColumnDefined> columnDefineds = new ArrayList<ColumnDefined>();
    
    /**
     * 将表定义，主键列表和列定义作为参数传入
     * @param table
     * @param primaryKeys2
     * @param columnDefineds2
     * @author walden
     */
    public EntityBeanBuilder(TableDefined tableDefined, List<String> primaryKeys, List<ColumnDefined> columnDefineds) {
        this.tableDefined = tableDefined;
        this.primaryKeys = primaryKeys;
        this.columnDefineds = columnDefineds;
    }
    
    public EntityBean builder() {
        EntityBean entity = new EntityBean();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        
        String beanName = createBeanNameByTableName();
        
        entity.setTableName(tableDefined.getTableName());
        Comment tableComment = entity.getTableComment();
        tableComment.setLabel(getLabelFromComment(tableDefined.getTableComment()));
        tableComment.setContent(formatTableComment(getContentFromComment(tableDefined.getTableComment())));
        
        entity.setBeanName(beanName);
        
        List<Field> fields = new ArrayList<Field>();
        List<String> imports = new ArrayList<String>();
        createFieldsAndImports(fields, imports, entity);
        entity.setFields(fields);
        entity.setImports(imports);
        entity.setCreateDate(sdf.format(new Date()));
        entity.setPojoFileName(beanName);
        entity.setDaoFileName(beanName + "Dao");
        
        return entity;
    }
    
    /**
     * 获得第一个空白符前的内容 表名或者列名
     * @param comment
     * @return
     * @author walden
     */
    private String getLabelFromComment(String comment) {
        return comment != null && !"".equals(comment.trim()) ? comment.replaceAll(COMMENT_LABEL_CONTENT_PATTERN, "$1") : "";
    }
    
    /**
     * 获得第一个空白符前的内容 表注释或者列注释
     * @param columnComent
     * @return
     * @author walden
     */
    private String getContentFromComment(String comment) {
        return comment != null && !"".equals(comment.trim()) ? comment.replaceFirst(getLabelFromComment(comment), "") : "";
    }
    
    /**
     * 处理从数据库中取出来的表注释信息
     * @param tableComment
     * @return
     * @author walden
     */
    private String formatTableComment(String tableComment) {
        String result = "";
        if (tableComment != null) {
            // 将多个空行换成替换成一个空行
            result = tableComment.replaceAll("\r\n\\s*\r\n", "\r\n\r\n");
            // 移除所有空行 暂时不需要
            // result = result.replaceAll("\r\n\\s*\r\n", "\r\n");
            result = result.replaceAll("\r\n", "\r\n * ");
        }
        return result;
    }
    
    /**
     * 处理从数据库中取出来的表注释信息
     * @param tableComment
     * @return
     * @author walden
     */
    private String formatColumnComment(String tableComment) {
        String result = "";
        if (tableComment != null) {
            // 将多个空行换成替换成一个空行
            result = tableComment.replaceAll("\r\n\\s*\r\n", "\r\n\r\n");
            // 移除所有空行 暂时不需要
            // result = result.replaceAll("\r\n\\s*\r\n", "\r\n");
            result = result.replaceAll("\r\n", "\r\n\t * ");
        }
        return result;
    }
    
    /**
     * 生成这个表的所有字段类和import的数据;
     * @param fields
     * @param imports
     */
    private void createFieldsAndImports(List<Field> fields, List<String> imports, EntityBean entiy) {
        boolean nonIdAnnotation = true;
        boolean nonColumnAnnotation = true;
        imports.add(Constant.ANNOTATION_PACKAGE + ".Entity");
        imports.add(Constant.ANNOTATION_PACKAGE + ".Table");
        for (ColumnDefined column : columnDefineds) {
            Field field = new Field();
            String columnName = column.getColumnName();
            String columnType = column.getColumnType();
            String columnComent = column.getColumnComment();
            String recolumnName = rebuildColumnName(columnName);
            field.setName(createFieldNameByColumnName(columnName));
            field.setType(createFieldTypeByColumnType(columnType, imports));
            Comment comment = field.getComment();
            comment.setLabel(getLabelFromComment(columnComent));
            comment.setContent(formatColumnComment(getContentFromComment(columnComent)));
            field.setSetterMethodName("set" + recolumnName);
            field.setGetterMethodName("get" + recolumnName);
            String columnAnnotion = String.format(Constant.COLUMN_ANNOTATION, columnName);
            if (primaryKeys.size() == 0) {// 如果没有主键
                entiy.setIdJavaType("NonId");// 使用smart-jdbc的org.smart.jdbc.object.NonId类来标志没有主键的DAO;
            } else if (primaryKeys.contains(columnName)) {
                field.setIdAnnotaction(Constant.ID_ANNOTATION);
                field.setAnnotaction(columnAnnotion);
                field.setType(createFieldTypeByColumnType(columnType, imports));
                entiy.setIdJavaType(field.getType());// 生成javaType
                if (nonIdAnnotation) {
                    imports.add(Constant.ANNOTATION_PACKAGE + ".Id");
                    nonIdAnnotation = false;
                }
            } else if (Constant.USE_ANNOTATION) {
                field.setAnnotaction(columnAnnotion);
                if (nonColumnAnnotation) {
                    imports.add(Constant.ANNOTATION_PACKAGE + ".Column");
                    nonColumnAnnotation = false;
                }
            }
            fields.add(field);
        }
        Collections.sort(imports, new Comparator<String>() {
            
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        
    }
    
    private String createFieldTypeByColumnType(String columnType, List<String> imports) {
        String fieldType = "";
        Map<String, String> typeMapping = Constant.TYPE_MAPPINT;
        String lowerDataType = columnType.toLowerCase();
        if (lowerDataType.contains("unsigned")) {// update by walden mysql 中的column type有会面的unsigned
            lowerDataType = lowerDataType.replace("unsigned", "").trim();
        }
        String value = typeMapping.get(lowerDataType);
        if (value != null) {
            fieldType = value.replaceAll(".+\\.", "");
            if (!value.startsWith(JAVA_LANG) && !imports.contains(value)) {
                imports.add(value);
            }
        } else {
            System.out.println("配置文件[typeMapping]中没有维护" + lowerDataType + "对应的javaType类型!");
        }
        return fieldType;
    }
    
    /**
     * 根据列名获得类的字段名
     * @param columnName
     * @return
     */
    private String createFieldNameByColumnName(String columnName) {
        return StringUtils.uncapitalize(rebuildColumnName(columnName));
    }
    
    private String rebuildColumnName(String columnName) {
        String fieldName = "";
        for (String str : columnName.split("_")) {
            fieldName += StringUtils.capitalize(str);
        }
        return fieldName;
    }
    
    /**
     * 根据表获得类名
     * @return
     */
    public String createBeanNameByTableName() {
        String beanName = "";
        String tableName = tableDefined.getTableName();
        if (tableName.indexOf("_") > -1) {
            String[] names = tableDefined.getTableName().split("_");
            int startIndex = Constant.KEEP_REFIX ? 0 : 1;
            for (int i = startIndex; i < names.length; i++) {
                beanName += StringUtils.capitalize(names[i]);
            }
        } else {
            beanName = StringUtils.capitalize(tableName);
        }
        return beanName;
    }
    
    public TableDefined getTableDefined() {
        return tableDefined;
    }
    
    public void setTableDefined(TableDefined tableDefined) {
        this.tableDefined = tableDefined;
    }
    
    public List<String> getPrimaryKeys() {
        return primaryKeys;
    }
    
    public void setPrimaryKeys(List<String> primaryKeys) {
        this.primaryKeys = primaryKeys;
    }
    
    public List<ColumnDefined> getColumnDefineds() {
        return columnDefineds;
    }
    
    public void setColumnDefineds(List<ColumnDefined> columnDefineds) {
        this.columnDefineds = columnDefineds;
    }
    
}
