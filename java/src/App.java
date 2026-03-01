import model.Projects;

public class App {
    public static void main(String[] args) throws Exception {
        Projects project = new Projects(1, "Proyecto de gente pendeja", "Explicacion", "01/01/2012", "23/12/2025", "Activo", 3);

        System.out.println(project.getName());
        
        project.setName("Mentiris");
        
        System.out.println(project.getName());
    }
}
