public class App {
    public static void main(String[] args) throws Exception {
        
        Recurso microscopio = new Recurso("1", "Laboratorio de Ciencias", "Disponible", 2023, "Microscopio Óptico", "Académico");
        Recurso guitarra = new Recurso("2", "Sala de Música", "Prestado", 2022, "Guitarra Acústica", "Cultural");

        System.out.println("Estado inicial:");
        System.out.println(microscopio.mostrarInfo());
        System.out.println(guitarra.mostrarInfo());

        System.out.println("\nIntentando prestar el microscopio...");
        if (microscopio.prestar()) {
            System.out.println("Microscopio prestado correctamente.");
        }

        System.out.println("\nIntentando devolver la guitarra...");
        if (guitarra.devolver()) {
            System.out.println("Guitarra devuelta correctamente.");
        }

        System.out.println("\nEstado final:");
        System.out.println(microscopio.mostrarInfo());
        System.out.println(guitarra.mostrarInfo());
    }
}

    

