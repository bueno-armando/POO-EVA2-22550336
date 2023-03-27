package Productos;
import SuperClases.*;

/**
 *
 * @author Armando Bueno
 */
public final class Playera extends Ropa{
   private int talla = -1;
   private String tipo = "N.A";   
   
   @Override
   public double precioVenta(int cant){
       if(cant > 5) return getPrecio() * .5;
       return getPrecio() * cant;
   }
   

    public Playera() {
    }

    public Playera(String marca, String color, double precio, String nombre, String unidad) {
        super(marca, color, precio, nombre, unidad);
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return "\n----- DATOS PLAYERA -----"+
                "\nPrecio: "+precio+
                "\nNombre: "+getNombre()+
                "\nUnidad: "+getUnidad()+
                "\nMarca: "+getMarca()+
                "\nColor: "+getColor()+
                "\nTalla: "+talla+
                "\nTipo: "+tipo;
    }
}
