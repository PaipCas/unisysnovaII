package model;

public class Categories {
	private int categoryId;
	private String name;
	
	public Categories() {
	}

	public Categories(int categoryId, String name) {
		setCategoryId(categoryId);
		setName(name);
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		if (categoryId <= 0) {
			System.out.println("Id de la categoría inválido");
			return;
		} else {
			this.categoryId = categoryId;
		}
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
