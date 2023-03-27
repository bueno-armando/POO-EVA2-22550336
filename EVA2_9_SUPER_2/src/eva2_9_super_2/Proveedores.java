package eva2_9_super_2;

/**
 *
 * @author Armando Bueno
 */

// Proveedores is-a (es-un) Persona
public class Proveedores extends Persona {
    private String rfc;
    
    public Proveedores(){
        super();
        this.rfc = "N.A";
    }
    
    public Proveedores(String nombre, String apellido, int edad, String rfc){
        super(nombre, apellido, edad);
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("RFC: "+this.rfc);
    }
    
}
