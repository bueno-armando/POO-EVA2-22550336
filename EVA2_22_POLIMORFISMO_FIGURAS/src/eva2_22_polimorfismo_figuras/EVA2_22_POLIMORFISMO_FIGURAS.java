package eva2_22_polimorfismo_figuras;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_22_POLIMORFISMO_FIGURAS {

    public static void main(String[] args) {
        Circulo circle = new Circulo(5);
        circle.imprimirDatos();
        Figuras figu = circle; //reduciendo de persona a circulo
        System.out.println("Area: "+figu.calcularArea());
        // los datos (que se pueden) se heredan
        // figu sigue siendo circulo visto de otra manera
        // (reduciendole atributos/metodos)
    }
    
}
