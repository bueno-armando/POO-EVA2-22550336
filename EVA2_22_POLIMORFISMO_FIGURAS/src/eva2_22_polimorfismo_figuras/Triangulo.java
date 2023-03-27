package eva2_22_polimorfismo_figuras;

/**
 *
 * @author Armando Bueno
 */
public class Triangulo implements Figuras, MostrarDatos{
    private double base;
    private double alt;

    public Triangulo(double base, double alt) {
        this.base = base;
        this.alt = alt;
    }

    public Triangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    @Override
    public double calcularArea() {
        return base * alt * 0.5;
    }

    @Override
    public double calcularPerim() {
        //se asume que es un triangulo rectangulo
        return base + alt + Math.hypot(base, alt);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("---- DATOS TRIÁNGULO -----");
        System.out.println("Base: "+base);
        System.out.println("Altura: "+alt);
        System.out.println("Área: "+calcularArea());
        System.out.println("Perímetro: "+calcularPerim());
    }
}
