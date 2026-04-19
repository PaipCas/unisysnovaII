package model;

public abstract class BaseName extends BaseEntity {
	protected String name;

	public BaseName() {
	}

	public BaseName(int id, String name) {
		super(id);
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			System.out.println("El nombre no puede estar vacío");
			return;
		} else if (name.length() > 100) {
			System.out.println("El nombre es demasiado largo");
			return;
		} else {
			this.name = name;
		}
	}
}
