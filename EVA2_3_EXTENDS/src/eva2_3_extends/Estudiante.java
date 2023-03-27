package eva2_3_extends;

/**
 *
 * @author Armando Bueno
 */

//Clase derivada extends Clase Base
//Subclase extenda superclase
//Hijo extends padre

//Estudiante is-a (es-un) Persona
public class Estudiante extends Persona {
    //PERSONA ES LA CLASE BASE
    //ESTUDIANTE ES LA CLASE DERIVADA

    private String noControl;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
}
