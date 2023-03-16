package eva2_11_override_figuras;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_11_OVERRIDE_FIGURAS {

    public static void main(String[] args) {
        //circulos
        Circulo circle = new Circulo();
        circle.setRatio(2.5);
        System.out.println("CÍRCULO SIN ARGUMENTOS:");
        System.out.println("Área: "+circle.calcArea());
        System.out.println("Perímetro: "+circle.calcPerim());
        Circulo circle2 = new Circulo(3.5);
        System.out.println("CÍRCULO CON ARGUMENTOS");
        System.out.println("Área: "+circle2.calcArea());
        System.out.println("Perímetro: "+circle2.calcPerim());
        
        //triangulos
        Triangulo triangle = new Triangulo();
        triangle.setBase(3.7);
        triangle.setHeight(4.8);
        System.out.println("\nTRIÁNGULO SIN ARGUMENTOS");
        System.out.println("Área: "+triangle.calcArea());
        System.out.println("Perímetro: "+triangle.calcPerim());
        System.out.println("TRIÁNGULO CON ARGUMENTOS");
        Triangulo triangle2 = new Triangulo(5.9, 7.1);
        System.out.println("Área: "+triangle2.calcArea());
        System.out.println("Perímtro: "+triangle2.calcPerim());
    }
    
   
}
