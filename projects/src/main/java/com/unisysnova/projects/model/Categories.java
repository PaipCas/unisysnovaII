package com.unisysnova.projects.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class Categories extends BaseEntity {
	@Column(nullable = false, length = 30, unique = true)
	private String name;

	public Categories() {
	}

	public Categories(String name) {
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
