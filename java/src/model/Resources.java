public class Recurso {

    private String resourceId;
    private String name;
    private String category;
    private String location;
    private int dateAcquisition; 
    private String status; 

    
    public Recurso(String resourceId, String location, String status, int dateAcquisition, String name, String category) {
        this.resourceId = resourceId;
        this.location = location;
        this.status = status;
        this.dateAcquisition = dateAcquisition;
        this.name = name;
        this.category = category;
    }

    
    public String getResourceId() { return resourceId; }
    public void setResourceId(String resourceId) { this.resourceId = resourceId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getDateAcquisition() { return dateAcquisition; }
    public void setDateAcquisition(int dateAcquisition) { this.dateAcquisition = dateAcquisition; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

   
    public boolean estaDisponible() {
        return status.equalsIgnoreCase("Disponible");
    }

    
    public boolean prestar() {
        if (estaDisponible()) {
            this.status = "Prestado";
            return true;
        }
        return false;
    }

    
    public boolean devolver() {
        if (status.equalsIgnoreCase("Prestado")) {
            this.status = "Disponible";
            return true;
        }
        return false;
    }

    
    public String mostrarInfo() {
        return "ID: " + resourceId +
               " | Nombre: " + name +
               " | Categoría: " + category +
               " | Ubicación: " + location +
               " | Fecha adquisición: " + dateAcquisition +
               " | Estado: " + status;
    }
}
