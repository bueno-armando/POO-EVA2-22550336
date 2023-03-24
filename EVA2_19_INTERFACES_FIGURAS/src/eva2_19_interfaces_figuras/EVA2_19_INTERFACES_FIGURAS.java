package eva2_19_interfaces_figuras;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_19_INTERFACES_FIGURAS {

    public static void main(String[] args) {
        /*Figuras figu = new Figuras();
        MostrarDatos mostrar = new MostrarDatos();
        NO SE PUEDEN INSTANCIAR INTERFACES NI CLASES*/
        Triangulo myTriangle = new Triangulo(20, 20);
        Circulo myCircle = new Circulo(20);
        
        myTriangle.imprimirDatos();
        myCircle.imprimirDatos();
    }
    //si solo se tienen métdos (no atributos) abstractos
    //es conveniente usar una interfaz en vez de una clase
}
