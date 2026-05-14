package com.unisysnova.projects.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseName extends BaseEntity {
	@Column(nullable = false, length = 30)
	protected String name;

	public BaseName() {
	}

	public BaseName(String name) {
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
