package eva2_9_super_2;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_9_SUPER_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante myStudent = new Estudiante("Juan", "Casas", 22, "109248012");
        myStudent.imprimirDatos(); //no se imprime el no control

        Docentes docente = new Docentes("Alfredo", "Armendariz", 45, "2104812");
        docente.imprimirDatos();
        
        Proveedores prove = new Proveedores("Alberto", "Benitez", 38, "AB124343");
        prove.imprimirDatos();
    }
    
}
