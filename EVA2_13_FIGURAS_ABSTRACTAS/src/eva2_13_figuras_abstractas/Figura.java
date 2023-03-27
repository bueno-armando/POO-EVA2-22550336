package eva2_13_figuras_abstractas;

/**
 *
 * @author Armando Bueno
 */

//abstract NO nos impide heredar
public abstract class Figura {
    //solo necesitamos el nombre del método
    public abstract  double calcArea();
    public  abstract double calcPerim();
    //el método también debe ser ABSTRACTO
}
