package model;

import java.time.LocalDate;

public class Projects extends BaseName implements DateRange, Stateable {
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;
	private String status;
	private int categoryId;

	public Projects() {
	}

	public Projects(int id, String name, String description, LocalDate startDate, LocalDate endDate, String status,
			int categoryId) {
		super(id, name);
		setDescription(description);
		setStartDate(startDate);
		setEndDate(endDate);
		setStatus(status);
		setCategoryId(categoryId);
	}

	public String getDescription() {
		return description == null ? "" : description;
	}

	public void setDescription(String description) {
		if (description != null && description.length() > 500) {
			throw new IllegalArgumentException("La descripción es demasiado larga");
		}

		this.description = description;
	}

	@Override
	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		if (startDate == null) {
			throw new IllegalArgumentException("Fecha de inicio obligatoria");
		}

		this.startDate = startDate;
	}

	@Override
	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		if (endDate != null && this.startDate != null && endDate.isBefore(this.startDate)) {
			throw new IllegalArgumentException("La fecha de fin no puede ser menor que la de inicio");
		}

		this.endDate = endDate;
	}

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public void setStatus(String status) {
		if (!status.equals("Finalizado") && !status.equals("En ejecucion") && !status.equals("Planificado")) {
			throw new IllegalArgumentException("Estado inválido");
		}

		this.status = status;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		if (categoryId <= 0) {
			throw new IllegalArgumentException("Categoría inválida");
		}

		this.categoryId = categoryId;
	}
}