package model;

import java.time.LocalDate;

public class Deliverable {
    private String name;
    private LocalDate date;
    private String urlFile;
    private int idDeliverable;
    private String description;
    private String typeDeliv;


    public Deliverable(String name, LocalDate date, String urlFile, int idDeliverable, String description,
            String typeDeliv) {
        this.name = name;
        this.date = date;
        this.urlFile = urlFile;
        this.idDeliverable = idDeliverable;
        this.description = description;
        this.typeDeliv = typeDeliv;
    }


    public Deliverable() {
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


    public int getIdDeliverable() {
        return idDeliverable;
    }


    public void setIdDeliverable(int idDeliverable) {
        this.idDeliverable = idDeliverable;
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

    
    
    
}
