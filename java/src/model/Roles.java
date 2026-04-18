package model;

public class Roles {
	private int projectRoleId;
	private String name;

	public Roles() {
	}

	public Roles(int projectRoleId, String name) {
		setProjectRoleId(projectRoleId);
		setName(name);
	}

	public int getProjectRoleId() {
		return projectRoleId;
	}

	public void setProjectRoleId(int projectRoleId) {
		if (projectRoleId <= 0) {
			System.out.println("Id de la categoría inválido");
			return;
		} else {
			this.projectRoleId = projectRoleId;
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
