package com.unisysnova.projects.model;

import java.time.LocalDate;

public class Loan extends BaseEntity implements Stateable, DateRange{
    private String status;
    private int personId;
    private int resourceId;
	private LocalDate deliverytDate;
	private LocalDate bookDate;

    public Loan(String status, int personId, int resourceId, LocalDate deliverytDate,
            LocalDate bookDate) {
        this.status = status;
        this.personId = personId;
        this.resourceId = resourceId;
        this.deliverytDate = deliverytDate;
        this.bookDate = bookDate;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public LocalDate getEndDate() {
        return deliverytDate;
    }

    @Override
    public LocalDate getStartDate() {
        return bookDate;
    }

    public void setBookDate(LocalDate bookDate) {
        this.bookDate = bookDate;
    }
    
}
