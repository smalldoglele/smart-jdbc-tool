package org.hmy.test.bean;

public class Foo {
	private String readwrite;
	private String readonly;

	public Foo() {
		user = new User();
	}

	public String getReadwrite() {
		return readwrite;
	}

	public void setReadwrite(String readwrite) {
		this.readwrite = readwrite;
	}

	public String getReadonly() {
		return readonly;
	}

	public void setReadonly(String readonly) {
		this.readonly = readonly;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private User user;
}
