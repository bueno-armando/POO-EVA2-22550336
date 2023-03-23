package SuperClases;

/**
 *
 * @author Armando Bueno
 */
public abstract class Electronica extends Producto {
    private String fabricante = "N.A";
    private String modelo = "N.A";
    private int garantia = 0; //dias

    public Electronica() {
    }

    public Electronica(String fabricante, String modelo, int garantia, double precio, String nombre, String unidad) {
        super(precio, nombre, unidad);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.garantia = garantia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
}
