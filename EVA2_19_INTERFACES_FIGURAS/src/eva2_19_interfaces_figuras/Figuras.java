package eva2_19_interfaces_figuras;

/**
 *
 * @author Armando Bueno
 */

//Las interfaces NO se pueden instanciar
//Son como un contrato: estoy obligado a implementar
//solo metdos abstractos y constantes
public interface Figuras {
    public abstract double calcularArea();
    //public abstract es automático
    double calcularPerim();
}
