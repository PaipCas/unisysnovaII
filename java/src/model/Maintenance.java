package model;

public class Maintenance {

    private String technResponsable;
    private int idMaintenance;
    private String MaintenanceDate;
    private String descriptionMaint;
    private double cost;
    private int idResourceFk;

    public Maintenance(String technResponsable, int idMaintenance, String maintenanceDate, String descriptionMaint,
            double cost, int idResourceFk) {
        this.technResponsable = technResponsable;
        this.idMaintenance = idMaintenance;
        MaintenanceDate = maintenanceDate;
        this.descriptionMaint = descriptionMaint;
        this.cost = cost;
        this.idResourceFk = idResourceFk;
    }

    public Maintenance() {
    }

    public String getTechnResponsable() {
        return technResponsable;
    }

    public void setTechnResponsable(String technResponsable) {
        this.technResponsable = technResponsable;
    }

    public int getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(int idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public String getMaintenanceDate() {
        return MaintenanceDate;
    }

    public void setMaintenanceDate(String maintenanceDate) {
        MaintenanceDate = maintenanceDate;
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

    public int getIdResourceFk() {
        return idResourceFk;
    }

    public void setIdResourceFk(int idResourceFk) {
        this.idResourceFk = idResourceFk;
    }

    
    

    
}


