package eva2_3_extends;

/**
 *
 * @author Armando Bueno
 */

// Proveedores is-a (es-un) Persona
public class Proveedores extends Persona {
    private String rfc;

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
}
