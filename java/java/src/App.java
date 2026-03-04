import model.Projects;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static ArrayList<Projects> projectList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int option;

        do {
            System.out.println("\n===== MENÚ DE PROYECTOS =====");
            System.out.println("1. Crear proyecto");
            System.out.println("2. Listar proyectos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    createProject();
                    break;
                case 2:
                    listProjects();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (option != 3);
    }

    private static void createProject() {

        System.out.println("\n--- Crear Nuevo Proyecto ---");

        System.out.print("ID del proyecto: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nombre: ");
        String name = scanner.nextLine();

        System.out.print("Descripción: ");
        String description = scanner.nextLine();

        System.out.print("Fecha inicio: ");
        String startDate = scanner.nextLine();

        System.out.print("Fecha fin: ");
        String endDate = scanner.nextLine();

        System.out.print("Estado: ");
        String status = scanner.nextLine();

        System.out.print("ID Categoría: ");
        int categoryId = scanner.nextInt();
        scanner.nextLine();

        Projects project = new Projects(id, name, description, startDate, endDate, status, categoryId);

        projectList.add(project);

        System.out.println("Proyecto creado correctamente.");
    }

    private static void listProjects() {

        System.out.println("\n--- Lista de Proyectos ---");

        if (projectList.isEmpty()) {
            System.out.println("No hay proyectos registrados.");
            return;
        }

        for (Projects p : projectList) {
            System.out.println("-----------------------------");
            System.out.println("ID: " + p.getProjectId());
            System.out.println("Nombre: " + p.getName());
            System.out.println("Descripción: " + p.getDescription());
            System.out.println("Fecha Inicio: " + p.getStartDate());
            System.out.println("Fecha Fin: " + p.getEndDate());
            System.out.println("Estado: " + p.getStatus());
            System.out.println("Categoría ID: " + p.getCategoryId());
        }
    }
}
