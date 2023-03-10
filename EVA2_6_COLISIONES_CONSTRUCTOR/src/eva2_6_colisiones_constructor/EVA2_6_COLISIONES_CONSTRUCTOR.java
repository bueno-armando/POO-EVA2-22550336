package eva2_6_colisiones_constructor;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_6_COLISIONES_CONSTRUCTOR {

    public static void main(String[] args) {
        System.out.println("ANIMAL");
        Animal animal = new Animal();
        animal.comer();
        animal.respirar();
        System.out.println("MAMIFERO");
        Mamifero mamifero = new Mamifero(); //el constructor también se hereda
        
    }
    
}
