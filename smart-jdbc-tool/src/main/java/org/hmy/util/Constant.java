package org.hmy.util;

import java.util.Map;

import org.apache.commons.lang.BooleanUtils;

public class Constant {
    
    public static String JDBC_DRIVER = null;
    
    public static String JDBC_URL = null;
    
    public static String JDBC_USER = null;
    
    public static String JDBC_PASSWROD = null;
    
    public static String JDBC_DIALECT = null;
    
    public static Map<String, String> TYPE_MAPPINT = null;
    
    public static String TABLE_PREFIX = null;
    
    public static String TABLE_FILTER = null;
    
    public static String SRC_PATH = null;
    
    public static String BEAN_PACKAGE = null;
    
    public static String DAO_PACKAGE = null;
    
    public static boolean USE_ANNOTATION = false;
    
    public static boolean USE_CONSTRUCTOR = false;
    
    public static String ANNOTATION_PACKAGE = null;
    
    public static boolean KEEPP_REFIX = false;
    
    public static String COLUMN_ANNOTATION = null;
    
    public static String ID_ANNOTATION = null;
    
    public static boolean SAFE_MODE = false;
    
    static {
        JDBC_DRIVER = PropsUtil.getValue("jdbc", "driver");
        JDBC_URL = PropsUtil.getValue("jdbc", "url");
        JDBC_USER = PropsUtil.getValue("jdbc", "user");
        JDBC_PASSWROD = PropsUtil.getValue("jdbc", "password");
        JDBC_DIALECT = PropsUtil.getValue("jdbc", "dialect");
        TYPE_MAPPINT = PropsUtil.getSection("typeMapping");
        TABLE_PREFIX = PropsUtil.getValue("tablePrefix");
        TABLE_FILTER = PropsUtil.getValue("tableFilter");
        SRC_PATH = PropsUtil.getValue("srcPath");
        BEAN_PACKAGE = PropsUtil.getValue("beanPackage");
        DAO_PACKAGE = PropsUtil.getValue("daoPackage");
        USE_ANNOTATION = BooleanUtils.toBoolean(PropsUtil.getValue("useAnnotation"));
        USE_CONSTRUCTOR = BooleanUtils.toBoolean(PropsUtil.getValue("useConstructor"));
        ANNOTATION_PACKAGE = PropsUtil.getValue("annotationPackage");
        KEEPP_REFIX = BooleanUtils.toBoolean(PropsUtil.getValue("keepPrefix"));
        COLUMN_ANNOTATION = PropsUtil.getValue("columnAnnotation");
        ID_ANNOTATION = PropsUtil.getValue("idAnnotation");
        SAFE_MODE = BooleanUtils.toBoolean(PropsUtil.getValue("safemode"));
    }
}
