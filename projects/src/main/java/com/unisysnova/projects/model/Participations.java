package com.unisysnova.projects.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Participations extends BaseEntity {
	@ManyToOne
	@JoinColumn(name = "projectId")
	private Projects projects;

	@ManyToOne
	@JoinColumn(name = "personId")
	private Person person;

	@ManyToOne
	@JoinColumn(name = "projectRoleId")
	private Roles roles;

	public Participations() {
	}
}