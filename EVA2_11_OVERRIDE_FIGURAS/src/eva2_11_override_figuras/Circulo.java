package eva2_11_override_figuras;

/**
 *
 * @author jaime
 */
public class Circulo extends Figura {
    private double ratio;

    public Circulo() {
    }

    public Circulo(double ratio) {
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }
    
    @Override
    public double calcArea(){
        return Math.PI*ratio*ratio;
    }
    
    @Override
    public double calcPerim(){
        return Math.PI*ratio*2;
    }
    
}
