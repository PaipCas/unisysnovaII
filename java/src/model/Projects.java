package model;

import java.time.LocalDate;

public class Projects {
	private int projectId;
	private String name;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;
	private String status;
	private int categoryId;

	public Projects() {
	}

	public Projects(int projectId, String name, String description, LocalDate startDate, LocalDate endDate, String status,
			int categoryId) {
		setProjectId(projectId);
		setName(name);
		setDescription(description);
		setStartDate(startDate);
		setEndDate(endDate);
		setStatus(status);
		setCategoryId(categoryId);
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		if (projectId <= 0) {
			System.out.println("Id del proyecto inválido");
			return;
		} else {
			this.projectId = projectId;
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

	public String getDescription() {
		return description == null ? "" : description;
	}

	public void setDescription(String description) {
		if (description != null && description.length() > 500) {
			System.out.println("El nombre es demasiado largo");
			return;
		} else {
			this.description = description;
		}
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		if (startDate == null) {
			System.out.println("Fecha de inicio obligatoria");
			return;
		} else {
			this.startDate = startDate;
		}
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		if (endDate != null & this.startDate != null && endDate.isBefore(this.startDate)) {
			System.out.println("La fecha de fin no puede ser menor que la de inicio");
			return;
		}
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if (!status.equals("Finalizado") && !status.equals("En ejecución") && !status.equals("Planificado")) {
			System.out.println("Estado inválido");
			return;
		} else {
			this.status = status;
		}
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		if (categoryId <= 0) {
			System.out.println("Categoría inválida");
			return;
		} else {
			this.categoryId = categoryId;
		}
	}
}