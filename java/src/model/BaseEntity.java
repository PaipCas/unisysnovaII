package model;

public abstract class BaseEntity {
	protected int id;

	public BaseEntity() {
	}

	public BaseEntity(int id) {
		setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id <= 0) {
			throw new IllegalArgumentException("Id inválido");
		}
		
		this.id = id;
	}
}
