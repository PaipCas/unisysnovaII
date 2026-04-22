package model;

import java.time.LocalDate;

public class Resources extends BaseEntity implements Stateable {
    
    private String location;
    private LocalDate dateAcquisition;
    private String status;
    private String nameResource;
    private String categoryResource;

    

    public Resources(int id, String location, LocalDate dateAcquisition, String status, String nameResource,
            String categoryResource) {
        super(id);
        this.location = location;
        this.dateAcquisition = dateAcquisition;
        this.status = status;
        this.nameResource = nameResource;
        this.categoryResource = categoryResource;
    }

    public Resources() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDateAcquisition() {
        return dateAcquisition;
    }

    public void setDateAcquisition(LocalDate dateAcquisition) {
        this.dateAcquisition = dateAcquisition;
    }
    
    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public String getNameResource() {
        return nameResource;
    }

    public void setNameResource(String nameResource) {
        this.nameResource = nameResource;
    }

    public String getCategoryResource() {
        return categoryResource;
    }

    public void setCategoryResource(String categoryResource) {
        this.categoryResource = categoryResource;
    }

    
}
