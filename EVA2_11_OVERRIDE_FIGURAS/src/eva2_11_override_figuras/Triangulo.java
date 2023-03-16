package eva2_11_override_figuras;

/**
 *
 * @author Armando Bueno
 */
public class Triangulo extends Figura {
    private double base, height;

    public Triangulo(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double calcArea(){
        return base*height;
    }
    
    @Override
    public double calcPerim(){
        //ASUMIENDO QUE ES UN TRIANGULO ISOCELES
        double hipo = Math.sqrt((base/2)*(base/2)+height*height);
        return hipo*2+base;
    }
}
