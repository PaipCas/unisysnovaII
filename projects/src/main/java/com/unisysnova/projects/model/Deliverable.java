package com.unisysnova.projects.model;

import java.time.LocalDate;

public class Deliverable extends BaseEntity {
    private String name;
    private LocalDate date;
    private String urlFile;
    private String description;
    private String typeDeliv;
    private int projectId;

    public Deliverable() {
    }

    public Deliverable(String name, LocalDate date, String urlFile, String description, String typeDeliv,
            int projectId) {
        this.name = name;
        this.date = date;
        this.urlFile = urlFile;
        this.description = description;
        this.typeDeliv = typeDeliv;
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getUrlFile() {
        return urlFile;
    }

    public void setUrlFile(String urlFile) {
        this.urlFile = urlFile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeDeliv() {
        return typeDeliv;
    }

    public void setTypeDeliv(String typeDeliv) {
        this.typeDeliv = typeDeliv;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

}
