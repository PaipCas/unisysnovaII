import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Person");

        Person p = new Person (
            1,
            "Fabio", 
            "Perez", 
            "fabioperez@gmail.com,", 
            "3021245421", 
            "Estudiante"
              );

            //   System.out.println(p.getName());
            //   System.out.println(p.getLastName());
            //   System.out.println(p.getEmail());
            //   System.out.println(p.getPhone());
            //   System.out.println(p.getSystemRole());

        System.out.println("Usuario: " + p.getName());
        System.out.println("Rol: " + p.getSystemRole());

              
        if (p.getSystemRole() != null && 
            p.getSystemRole().equalsIgnoreCase("Administrador")) {

            System.out.println("Ingreso permitido al sistema");

        } else {

            System.out.println("Acceso denegado");
        }
    
    }
}
