package com.unisysnova.projects.model;

public interface Stateable {
	String getStatus();

	void setStatus(String status);

	default boolean isFinished() {
		return "finalizado".equalsIgnoreCase(getStatus());
	}
}
