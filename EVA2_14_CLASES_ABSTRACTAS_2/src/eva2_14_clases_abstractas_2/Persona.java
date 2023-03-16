package eva2_14_clases_abstractas_2;

/**
 *
 * @author Armando Bueno
 */
public abstract class Persona {
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
    
    //LOS METODOS ABSTRACTOS PUEDEN COEXISTIR
    //CON MÉTODOS NORMALES
    public abstract void imprimirDatos();
    //la clase debe ser abstracta también
}
