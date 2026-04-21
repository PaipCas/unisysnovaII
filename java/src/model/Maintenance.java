package model;

import java.time.LocalDate;

public class Maintenance extends BaseEntity {
    private String technician;
    private LocalDate maintenanceDate;
    private String descriptionMaint;
    private double cost;
    private int resourceId;

    public Maintenance() {
    }

    public Maintenance(int id, String technician, LocalDate maintenanceDate, String descriptionMaint, double cost,
            int resourceId) {
        super(id);
        this.technician = technician;
        this.maintenanceDate = maintenanceDate;
        this.descriptionMaint = descriptionMaint;
        this.cost = cost;
        this.resourceId = resourceId;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public LocalDate getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(LocalDate maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public String getDescriptionMaint() {
        return descriptionMaint;
    }

    public void setDescriptionMaint(String descriptionMaint) {
        this.descriptionMaint = descriptionMaint;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    
}



