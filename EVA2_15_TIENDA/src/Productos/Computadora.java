package Productos;
import SuperClases.Electronica;
/**
 *
 * @author Armando Bueno
 */

//final => YA NO SE PUEDE HEREDAR DE COMPUTADORA
public final class Computadora extends Electronica {
    private double tamaño;
    private int memoria;
    private String procesador;
    private int discoDuro;
    
    @Override
    public double precioVenta(int cant){
        //10 unidades --> el precio es del 80%
       if(cant < 10) return precio * cant;
       return precio * cant * 0.8;
       //se puede ver en la subclase ya que se usó
       //protected en la superclase
    }

    public Computadora() {
        super();
        this.tamaño = -1;
        this.memoria = -1;
        this.procesador = "N.A";
        this.discoDuro = -1;
    }

    public Computadora(double tamaño, int memoria, String procesador, int discoDuro, String fabricante, String modelo, int garantia, double precio, String nombre, String unidad) {
        super(fabricante, modelo, garantia, precio, nombre, unidad);
        this.tamaño = tamaño;
        this.memoria = memoria;
        this.procesador = procesador;
        this.discoDuro = discoDuro;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }
    
    @Override
    public String toString(){
        return "----- DATOS COMPUTADORA -----\n"+
                "Precio "+getPrecio()+
                "\nNombre: "+getNombre()+
                "\nUnidad: "+getUnidad()+
                "\nFabricante: "+getFabricante()+
                "\nModelo: "+getModelo()+
                "\nGarantia: "+getGarantia()+
                "\nTamaño: "+tamaño+
                "\nMemoria: "+memoria+
                "\nProcesador: "+procesador+
                "\nDisco Duro: "+discoDuro;
    }
}

