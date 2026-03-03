package models;

public class Person {

  private int projectId;
  private String name;
  private String lastName;
  private String email;
  private String phone;
  private String systemRole;

  public Person ()  {}

  public Person(int projectId, String name, String lastName, String email, String phone, String systemRole) {
    this.projectId = projectId;
    this.name = name;
    this.lastName = lastName;
    this.email = email;
    this.phone = phone;
    this.systemRole = systemRole;
  }

  public int getProjectId() {
    return projectId;
  }

  public void setProjectId(int projectId) {
    this.projectId = projectId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
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

  public String getSystemRole() {
    return systemRole;
  }

  public void setSystemRole(String systemRole) {
    this.systemRole = systemRole;
  }
  
    
}
