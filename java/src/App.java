
import model.Categories;
import model.Participations;
import model.Projects;
import model.Roles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static Scanner scanner = new Scanner(System.in);
	private static List<Projects> projectList = new ArrayList<>();
	private static List<Categories> categoriesList = new ArrayList<>();
	private static List<Participations> participationsList = new ArrayList<>();
	private static List<Roles> rolesList = new ArrayList<>();
	private static int projectId = 0;
	private static int categoryId = 0;
	private static int participationId = 0;
	private static int roleId = 0;
	
	// Inicio, general
	public static void main(String[] args) throws Exception {
		generalMenu();
	}
	
	// Función que ejecuta el menú general
	private static void generalMenu() {
		int option;
		
		do {
			System.out.println("\n===== MENÚ UNISYSNOVA =====");
			System.out.println("1. Proyectos");
			System.out.println("2. Categorías");
			System.out.println("3. Participaciones");
			System.out.println("4. Roles");
			System.out.println("5. Personas");
			System.out.println("6. Préstamos");
			System.out.println("7. Recursos");
			System.out.println("8. Mantenimientos");
			System.out.println("9. Patrocinios");
			System.out.println("10. Patrocinadores");
			System.out.println("11. Entregables");
			System.out.println("12. Salir");
			System.out.print("Seleccione una opción: ");
			
			option = scanner.nextInt();
			scanner.nextLine();
			
			switch (option) {
				case 1:
				projectsMenu();
				break;
				case 2:
				categoriesMenu();
				break;
				case 3:
				participationsMenu();
				break;
				case 4:
				rolesMenu();
				break;
				case 12:
				System.out.println("Saliendo del sistema...");
				break;
				default:
				System.out.println("Opción inválida");
			}
			
		} while (option != 12);
	}
	
	// PROYECTOS
	// Función para ejecutar el menú de proyectos
	private static void projectsMenu() {
		int option;
		
		do {
			System.out.println("\n===== MENÚ DE PROYECTOS =====");
			System.out.println("1. Crear proyecto");
			System.out.println("2. Listar proyectos");
			System.out.println("3. Volver al menú general");
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
				generalMenu();
				break;
				default:
				System.out.println("Opción inválida");
			}
			
		} while (option != 3);
	}
	
	// Función para crear proyectos
	private static void createProject() {
		System.out.println("\n--- Crear Nuevo Proyecto ---");
		
		int id = projectId++;
		
		System.out.print("Nombre: ");
		String name = scanner.nextLine();
		
		System.out.print("Descripción: ");
		String description = scanner.nextLine();
		
		System.out.print("Fecha inicio (dd/mm/aaaa): ");
		LocalDate startDate = LocalDate.parse(scanner.nextLine(), formatter);
		
		System.out.print("Fecha fin (dd/mm/aaaa): ");
		LocalDate endDate = LocalDate.parse(scanner.nextLine(), formatter);
		
		System.out.print("Estado: ");
		String status = scanner.nextLine();
		
		System.out.print("ID Categoría: ");
		int categoryId = scanner.nextInt();
		scanner.nextLine();
		
		Projects project = new Projects(id, name, description, startDate, endDate, status, categoryId);
		
		projectList.add(project);
		
		System.out.println("Proyecto creado correctamente.");
	}
	
	// Función para listar proyectos
	private static void listProjects() {
		System.out.println("\n--- Lista de Proyectos ---");
		
		if (projectList.isEmpty()) {
			System.out.println("No hay proyectos registrados.");
			return;
		}
		
		for (Projects p : projectList) {
			System.out.println("-----------------------------");
			System.out.println("ID: " + p.getId());
			System.out.println("Nombre: " + p.getName());
			System.out.println("Descripción: " + p.getDescription());
			System.out.println("Fecha Inicio: " + p.getStartDate());
			System.out.println("Fecha Fin: " + p.getEndDate());
			System.out.println("Estado: " + p.getStatus());
			System.out.println("Categoría ID: " + p.getCategoryId());
		}
		
		// Proyectos Finalizados
		System.out.println("\n--- Proyectos finalizados ---");
		
		if (projectList.isEmpty()) {
			return;
		}
		
		for (Projects p : projectList) {
			if (p.isFinished()) {
				System.out.println("-----------------------------");
				System.out.println("Nombre: " + p.getName());
				System.out.println("Estado: " + p.getStatus());
			}
		}
	}
	
	// CATEGORÍAS
	// Función para ejecutar el menú de las categorías
	private static void categoriesMenu() {
		int option;
		
		do {
			System.out.println("\n===== MENÚ DE CATEGORÍAS =====");
			System.out.println("1. Crear categoría");
			System.out.println("2. Listar categorías");
			System.out.println("3. Volver al menú general");
			System.out.print("Seleccione una opción: ");
			
			option = scanner.nextInt();
			scanner.nextLine();
			
			switch (option) {
				case 1:
				createCategory();
				break;
				case 2:
				listCategories();
				break;
				case 3:
				generalMenu();
				break;
				default:
				System.out.println("Opción inválida");
			}
			
		} while (option != 3);
	}
	
	// Función para crear categorías
	private static void createCategory() {
		System.out.println("\n--- Crear Nueva Categoría ---");
		
		int id = categoryId++;
		
		System.out.print("Nombre: ");
		String name = scanner.nextLine();
		
		Categories category = new Categories(id, name);
		
		categoriesList.add(category);
		
		System.out.println("Categoría creada correctamente.");
	}
	
	// Función para listar categorías
	private static void listCategories() {
		System.out.println("\n--- Lista de Categorías ---");
		
		if (categoriesList.isEmpty()) {
			System.out.println("No hay categorías registradas.");
			return;
		}
		
		for (Categories c : categoriesList) {
			System.out.println("-----------------------------");
			System.out.println("ID: " + c.getId());
			System.out.println("Nombre: " + c.getName());
		}
	}
	
	// PARTICIPACIONES
	// Función para ejecutar el menú de las participaciones
	private static void participationsMenu() {
		int option;
		
		do {
			System.out.println("\n===== MENÚ DE PARTICIPACIONES =====");
			System.out.println("1. Crear participación");
			System.out.println("2. Listar participaciones");
			System.out.println("3. Volver al menú general");
			System.out.print("Seleccione una opción: ");
			
			option = scanner.nextInt();
			scanner.nextLine();
			
			switch (option) {
				case 1:
				createParticipation();
				break;
				case 2:
				listParticipations();
				break;
				case 3:
				generalMenu();
				break;
				default:
				System.out.println("Opción inválida");
			}
			
		} while (option != 3);
	}
	
	// Función para crear participaciones
	private static void createParticipation() {
		System.out.println("\n--- Crear Nueva Participación ---");
		
		int id = participationId++;
		
		System.out.print("Id proyecto: ");
		int projectId = scanner.nextInt();
		
		System.out.print("Id persona: ");
		int personId = scanner.nextInt();
		
		System.out.print("Id rol: ");
		int projectRoleId = scanner.nextInt();
		
		Participations participation = new Participations(id, projectId, personId, projectRoleId);
		
		participationsList.add(participation);
		
		System.out.println("Participación creada correctamente.");
	}
	
	// Función para listar participaciones
	private static void listParticipations() {
		System.out.println("\n--- Lista de Participaciones ---");
		
		if (participationsList.isEmpty()) {
			System.out.println("No hay participaciones registrados.");
			return;
		}
		
		for (Participations p : participationsList) {
			System.out.println("-----------------------------");
			System.out.println("ID: " + p.getId());
			System.out.println("Id proyecto: " + p.getProjectId());
			System.out.println("Id persona: " + p.getPersonId());
			System.out.println("Id rol: " + p.getProjectRoleId());
		}
	}
	
	// ROLES
	// Función para ejecutar el menú de los roles
	private static void rolesMenu() {
		int option;
		
		do {
			System.out.println("\n===== MENÚ DE ROLES =====");
			System.out.println("1. Crear rol");
			System.out.println("2. Listar roles");
			System.out.println("3. Volver al menú general");
			System.out.print("Seleccione una opción: ");
			
			option = scanner.nextInt();
			scanner.nextLine();
			
			switch (option) {
				case 1:
				createRole();
				break;
				case 2:
				listRoles();
				break;
				case 3:
				generalMenu();
				break;
				default:
				System.out.println("Opción inválida");
			}
			
		} while (option != 3);
	}
	
	// Función para crear roles
	private static void createRole() {
		System.out.println("\n--- Crear Nuevo Rol ---");
		
		int id = roleId++;
		
		System.out.print("Nombre: ");
		String name = scanner.nextLine();
		
		Roles role = new Roles(id, name);
		
		rolesList.add(role);
		
		System.out.println("Rol creado correctamente.");
	}
	
	// Función para listar participaciones
	private static void listRoles() {
		System.out.println("\n--- Lista de Roles ---");
		
		if (rolesList.isEmpty()) {
			System.out.println("No hay roles registrados.");
			return;
		}
		
		for (Roles r : rolesList) {
			System.out.println("-----------------------------");
			System.out.println("ID: " + r.getId());
			System.out.println("Nombre: " + r.getName());
		}
	}
}