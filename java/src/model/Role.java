package model;

public class Role {
    private String rolName;
    private int idRol;

    public Role(String rolName, int idRol) {
        this.rolName = rolName;
        this.idRol = idRol;
    }

    public Role() {
    }

    public String getNombreRol() {
        return rolName;

    }
    
    public void setNombreRol(String nombreRol) {
        this.rolName = nombreRol;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    
    

}
