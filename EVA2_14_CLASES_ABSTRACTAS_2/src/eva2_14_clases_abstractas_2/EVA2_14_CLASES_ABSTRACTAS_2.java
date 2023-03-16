package eva2_14_clases_abstractas_2;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_14_CLASES_ABSTRACTAS_2 {

    public static void main(String[] args) {
        Estudiante stud = new Estudiante();
        stud.setNombre("Julio Casas");
        stud.setEdad(20);
        stud.setNoControl("2324324");
        System.out.println("ESTUDIANTE SIN ARGUMETNOS:");
        stud.imprimirDatos();
        
        Estudiante stud2 = new Estudiante("Augusto Jurado", 19, "2398080");
        System.out.println("\nESTUDIANTE CON ARGUMENTOS");
        stud2.imprimirDatos();
    }
    
}
