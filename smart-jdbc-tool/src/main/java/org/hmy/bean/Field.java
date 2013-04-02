package org.hmy.bean;

public class Field {
	private String name;
	private String type;
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
