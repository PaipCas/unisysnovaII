package model;

public abstract class AbstractPerson extends BaseName {
	protected String email;
	protected String phone;

	public AbstractPerson() {
	}

	public AbstractPerson(int id, String name, String email, String phone) {
		super(id, name);
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
