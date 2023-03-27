package SuperClases;

/**
 *
 * @author Armando Bueno
 */
public abstract class Producto {
    protected double precio = -1;
    protected String nombre = "N.A";
    protected String unidad = "N.A";
    
    public abstract double precioVenta(int cant);

    public Producto() {
    }

    public Producto(double precio, String nombre, String unidad) {
        this.precio = precio;
        this.nombre = nombre;
        this.unidad = unidad;
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

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}
