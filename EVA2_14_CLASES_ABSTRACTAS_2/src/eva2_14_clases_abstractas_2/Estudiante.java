package eva2_14_clases_abstractas_2;

/**
 *
 * @author Armando Bueno
 */
public class Estudiante extends Persona {
    //Se implemento el método abstracto de la superclase
    private String noControl;

    public Estudiante(String nombre, int edad, String noControl) {
        super(nombre, edad);
        this.noControl = noControl;
    }

    public Estudiante() {
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Número de Control: "+noControl);
    }
    
}
