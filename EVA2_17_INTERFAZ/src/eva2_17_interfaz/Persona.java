package eva2_17_interfaz;

/**
 *
 * @author Armando Bueno
 */
public class Persona implements MostrarDatos {
    //está obligada a implementar mostrarDatos
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("\n----- DATOS PERSONA -----");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    
    
}
