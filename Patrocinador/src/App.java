import models.Patrocinador;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Patrocinador");

        Patrocinador p = new Patrocinador (
            2, 
            "+cámaras", 
            "Teconology",
            "contacto@mascamaras.com",
            "322533214");

            System.out.println("ID: " + p.getSponsorId());
            System.out.println("Name: " + p.getSponsorName());
            System.out.println("Type: " + p.getSponsorType());
            System.out.println("Email: " + p.getEmail());
            System.out.println("Phone: " + p.getPhone());

    
    
    
        if (p.getEmail() != null && p.getEmail().contains("@")) {
            System.out.println("Email válido");
        } else {
            System.out.println("Email inválido");
        }

        
        if (p.getPhone() != null && p.getPhone().length() == 10) {
            System.out.println("Teléfono válido");
        } else {
            System.out.println("Teléfono inválido");
        }
    }
}
