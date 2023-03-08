package eva2_3_extends;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_3_EXTENDS {

    public static void main(String[] args) {
        Estudiante myStudent = new Estudiante();
        //lo resaltado en negritas es directamente de la clase
        //lo demás es por herencia
        
        //ESTUDIANTE
        myStudent.setNombre("Julio");
        myStudent.setApellido("Jano");
        myStudent.setEdad(19);
        myStudent.setNoControl("22550123");
        System.out.println("DATOS DEL ESTUDIANTE:");
        System.out.println("Nombre: "+myStudent.getNombre());
        System.out.println("Apellido: "+myStudent.getApellido());
        System.out.println("Edad: "+myStudent.getEdad());
        System.out.println("No. Control: "+myStudent.getNoControl());
        
        //PROVEEDORES
        Proveedores myProv = new Proveedores();
        myProv.setNombre("Juan");
        myProv.setApellido("Jano");
        myProv.setEdad(38);
        myProv.setRfc("340043");
        System.out.println("\nDATOS DEL PROVEEDOR:");
        System.out.println("Nombre: "+myProv.getNombre());
        System.out.println("Apellido: "+myProv.getApellido());
        System.out.println("Edad: "+myProv.getEdad());
        System.out.println("RFC: "+myProv.getRfc());
        
        //DOCENTE (completar)
        Docentes myDoce = new Docentes();
        myDoce.setNombre("Nathanael");
        myDoce.setApellido("Nuñez");
        myDoce.setEdad(39);
        myDoce.setPlaza("340045");
        System.out.println("\nDATOS DEL DOCENTE:");
        System.out.println("Nombre: "+myDoce.getNombre());
        System.out.println("Apellido: "+myDoce.getApellido());
        System.out.println("Edad: "+myDoce.getEdad());
        System.out.println("PLAZA: "+myDoce.getPlaza());
    }
    
}
