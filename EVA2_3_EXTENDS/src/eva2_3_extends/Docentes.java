package eva2_3_extends;

/**
 *
 * @author Armando Bueno
 */

//Docente is-a (es-un) Persona
public class Docentes extends Persona {
    private String plaza;

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    
}
