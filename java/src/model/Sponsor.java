package model;

public class Sponsor {

    private String name;
    private String type;
    private String email;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        if (name != null && name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
    }

    public void setType(String type) {
        if (type != null && !type.isEmpty()) {
            this.type = type;
        } else {
            System.out.println("Invalid type");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email");
        }
    }

    public void show() {
        System.out.println("Sponsor: " + name + " - " + type + " - " + email);
    }
}
