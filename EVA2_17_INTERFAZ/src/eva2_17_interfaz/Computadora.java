package eva2_17_interfaz;

/**
 *
 * @author Armando Beno
 */
public class Computadora extends Producto {
    public String procesador = "N.A";
    public int memoria = -1;

    public Computadora() {
    }

    public Computadora(String procesador, int memoria, double precio, String nombre) {
        super(precio, nombre);
        this.procesador = procesador;
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("----- DATOS COMPUTADORA -----");
        super.imprimirDatos(); //añadiendole funcionalidad
        System.out.println("Procesador: "+procesador);
        System.out.println("Memoria: "+memoria);
    }
}
