package eva2_9_super_2;

/**
 *
 * @author Armando Bueno
 */

//Docente is-a (es-un) Persona
public class Docentes extends Persona {
    private String plaza;
    
    public Docentes(){
        super();
        plaza = "N.A";
    }
    
    public Docentes(String nombre, String apellido, int edad, String plaza){
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Plaza: "+this.plaza);
    }
    
}
