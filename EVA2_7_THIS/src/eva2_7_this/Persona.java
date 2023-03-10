package eva2_7_this;

/**
 *
 * @author Armando Bueno
 */
public class Persona {
    private String nombre;

    public Persona(String nombre) { //PRIORIDAD
        this.nombre = nombre; //this.nombre es el atributo de la clase
                              //nombre es el parámetro del método
    }

    public String getNombre() {
        return nombre;
    }

    //tiene prioridad la variable pasada por arg
    public void setNombre(String nombre) {
        this.nombre = nombre; //"nombre" verde es el de la clase
                              //"nombre" naranja es el pasado (PRIORIDAD)
                              //la colisión se resuleve con THIS
    }
    
    void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
    }
}
