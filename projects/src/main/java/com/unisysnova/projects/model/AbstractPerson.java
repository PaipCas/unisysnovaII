package com.unisysnova.projects.model;

public abstract class AbstractPerson extends BaseName {
	protected String email;
	protected String phone;

	public AbstractPerson() {
	}

	public AbstractPerson(String name, String email, String phone) {
		super(name);
		this.email = email;
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
