package org.hmy.bean;

import java.util.ArrayList;
import java.util.List;

public class EntityBean {
	private String beanName;
	private String tableName;
	private List<String> imports = new ArrayList<String>();
	private List<Field> fields = new ArrayList<Field>();

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

}
