package org.hmy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.hmy.bean.ColumnDefined;
import org.hmy.bean.EntityBean;
import org.hmy.bean.Field;
import org.hmy.util.Constant;

public class EntityBeanBuilder implements Builder<EntityBean> {

	private String tableName;
	private List<String> primaryKeys = new ArrayList<String>();
	private List<ColumnDefined> columnDefineds = new ArrayList<ColumnDefined>();

	public EntityBean builder() {
		EntityBean entity = new EntityBean();
		entity.setTableName(tableName);
		entity.setBeanName(createBeanNameByTableName());
		List<Field> fields = new ArrayList<Field>();
		List<String> imports = new ArrayList<String>();
		createFieldsAndImports(fields, imports);
		entity.setFields(fields);
		entity.setImports(imports);
		return entity;
	}

	/**
	 * 生成这个表的所有字段类和import的数据;
	 * 
	 * @param fields
	 * @param imports
	 */
	private void createFieldsAndImports(List<Field> fields, List<String> imports) {
		boolean nonIdAnnotation = true;
		boolean nonColumnAnnotation = true;
		imports.add(Constant.ANNOTATION_PACKAGE + ".Entity");
		imports.add(Constant.ANNOTATION_PACKAGE + ".Table");
		for (ColumnDefined column : columnDefineds) {
			Field field = new Field();
			String columnName = column.getColumnName();
			String columnType = column.getColumnType();
			String recolumnName = rebuildColumnName(columnName);
			field.setName(createFieldNameByColumnName(columnName));
			field.setType(createFieldTypeByColumnType(columnType, imports));
			field.setSetterMethodName("set" + recolumnName);
			field.setGetterMethodName("get" + recolumnName);
			if (primaryKeys.contains(columnName)) {
				field.setAnnotaction(Constant.ID_ANNOTATION + "\n\t" + String.format(Constant.COLUMN_ANNOTATION, columnName));
				if (nonIdAnnotation) {
					imports.add(Constant.ANNOTATION_PACKAGE + ".Id");
					nonIdAnnotation = false;
				}
			} else if (Constant.USE_ANNOTATION) {
				field.setAnnotaction(String.format(Constant.COLUMN_ANNOTATION, columnName));
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
		String value = typeMapping.get(lowerDataType);
		if (value != null) {
			fieldType = value.replaceAll(".+\\.", "");
			if (!value.startsWith("java.lang.") && !imports.contains(value)) {
				imports.add(value);
			}
		} else {
			System.out.println("配置文件中没有维护" + lowerDataType + "对应的java类型!");
		}
		return fieldType;
	}

	/**
	 * 根据列名获得类的字段名
	 * 
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
	 * 
	 * @return
	 */
	public String createBeanNameByTableName() {
		String beanName = "";
		String[] names = tableName.split("_");
		int startIndex = Constant.KEEPP_REFIX ? 0 : 1;
		for (int i = startIndex; i < names.length; i++) {
			beanName += StringUtils.capitalize(names[i]);
		}
		return beanName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
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
