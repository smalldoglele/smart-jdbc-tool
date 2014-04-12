package org.smart.jdbc.tool.util;

import java.io.IOException;
import java.util.Map;

import org.ini4j.Ini;

/**
 * 配置工具类
 * 
 * @author walden
 */
public class PropsUtil {

	private static Ini ini = new Ini();
	static {
		try {
			ini.load(PropsUtil.class.getResource("/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据段和键值获得配置值
	 * 
	 * @param sectionName
	 * @param optionName
	 * @return
	 */
	public static String getValue(String sectionName, String optionName) {
		return ini.get(sectionName, optionName);
	}

	/**
	 * 根据段名称获得段的所有值
	 * 
	 * @param sectionName
	 * @return
	 */
	public static Map<String, String> getSection(String sectionName) {
		return ini.get(sectionName);
	}

	/**
	 * 获得全局的属性配置
	 * 
	 * @param optionName
	 * @return
	 */
	public static String getValue(String optionName) {
		return ini.get("global", optionName);
	}
}
