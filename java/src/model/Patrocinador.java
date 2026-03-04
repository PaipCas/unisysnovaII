package models;

public class Patrocinador {
    
    private int sponsorId;
    private String sponsorName;
    private String sponsorType;
    private String email;
    private String phone;

    public Patrocinador() {
     }

    public Patrocinador(int sponsorId, String sponsorName, String sponsorType, String email, String phone) {
        this.sponsorId = sponsorId;
        this.sponsorName = sponsorName;
        this.sponsorType = sponsorType;
        this.email = email;
        this.phone = phone;
    }

    public int getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(int sponsorId) {
        this.sponsorId = sponsorId;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public String getSponsorType() {
        return sponsorType;
    }

    public void setSponsorType(String sponsorType) {
        this.sponsorType = sponsorType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

     
}
