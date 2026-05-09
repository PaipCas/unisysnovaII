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
			throw new IllegalArgumentException("El nombre no puede estar vacío");
		}
		
		if (name.trim().length() > 100) {
			throw new IllegalArgumentException("El nombre es demasiado largo");
		}

		this.name = name.trim();
	}
}
