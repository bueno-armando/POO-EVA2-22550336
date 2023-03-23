package eva2_17_interfaz;

/**
 *
 * @author Armando Bueno
 */
public class Producto implements MostrarDatos {
    private double precio = -1;
    private String nombre = "N.A";

    public Producto() {
    }

    public Producto(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
    }
    
}
