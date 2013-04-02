package org.hmy.util;

import java.util.Map;

import org.apache.commons.lang.BooleanUtils;

public class Constant {
	public static String JDBC_DIRVER = null;
	public static String JDBC_URL = null;
	public static String JDBC_USER = null;
	public static String JDBC_PASSWROD = null;
	public static Map<String, String> TYPE_MAPPINT = null;
	public static String TABLE_PREFIX = null;
	public static String TABLE_FILTER = null;
	public static String BEAN_PATH = null;
	public static String BEAN_PACKAGE = null;
	public static boolean USE_ANNOTATION = false;
	public static boolean USE_CONSTRUCTOR = false;
	public static String ANNOTATION_PACKAGE = null;
	public static boolean KEEPP_REFIX = false;
	public static String COLUMN_ANNOTATION = null;
	public static String ID_ANNOTATION = null;

	static {
		JDBC_DIRVER = PropsUtil.getValue("jdbc", "driver");
		JDBC_URL = PropsUtil.getValue("jdbc", "url");
		JDBC_USER = PropsUtil.getValue("jdbc", "user");
		JDBC_PASSWROD = PropsUtil.getValue("jdbc", "password");
		TYPE_MAPPINT = PropsUtil.getSection("typeMapping");
		TABLE_PREFIX = PropsUtil.getValue("tablePrefix");
		TABLE_FILTER = PropsUtil.getValue("tableFilter");
		BEAN_PATH = PropsUtil.getValue("outBeanPath");
		BEAN_PACKAGE = PropsUtil.getValue("outBeanPackage");
		USE_ANNOTATION = BooleanUtils.toBoolean(PropsUtil.getValue("useAnnotation"));
		USE_CONSTRUCTOR = BooleanUtils.toBoolean(PropsUtil.getValue("useConstructor"));
		ANNOTATION_PACKAGE = PropsUtil.getValue("outAnnotationPackage");
		KEEPP_REFIX = BooleanUtils.toBoolean(PropsUtil.getValue("keepPrefix"));
		COLUMN_ANNOTATION = PropsUtil.getValue("columnAnnotation");
		ID_ANNOTATION = PropsUtil.getValue("idAnnotation");
	}
}