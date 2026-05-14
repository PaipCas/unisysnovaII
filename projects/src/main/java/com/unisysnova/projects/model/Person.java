package com.unisysnova.projects.model;

public class Person {

    private String name;
    private String lastName;
    private String email;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
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

    public void setLastName(String lastName) {
        if (lastName != null && lastName.length() >= 3) {
            this.lastName = lastName;
        } else {
            System.out.println("Invalid last name");
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
        System.out.println("Person: " + name + " " + lastName + " - " + email);
    }
}