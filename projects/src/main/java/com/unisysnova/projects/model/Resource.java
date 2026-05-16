package com.unisysnova.projects.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Resource extends BaseName implements DateRange, Stateable {
    
    @Column(nullable = true, length = 200)
    private String description; 

    @Column(nullable = false)
    private LocalDate startDate; 

    @Column(nullable = false)
    private LocalDate endDate; 

    @Column(nullable = false, length = 50)
    private String status;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Categories category;
     
    public Resource() {
    }


    public Resource(String description, LocalDate startDate, LocalDate endDate, String status, Categories category) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.category = category;
    }

    public Resource(String name, String description, LocalDate startDate, LocalDate endDate, String status,
        Categories category) {
        super(name);
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.category = category;
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
        if (!status.equals("Finalizado") && !status.equals("En uso") && !status.equals("Planificado")) {
            throw new IllegalArgumentException("Estado inválido");
        }
        this.status = status;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
         if (category == null) {
            throw new IllegalArgumentException("La categoría es obligatoria");
        }
        this.category = category;
    }

    

}