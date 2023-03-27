package eva2_6_colisiones_constructor;

/**
 *
 * @author Armando Bueno
 */
public class Mamifero extends Animal {
    public Mamifero(){ //Se ejecuta primero el const de animal
                        //Y luego el de mamifero
        System.out.println("Y soy un mamifero!");
    }//es recomendado incorporar el constructor de animal explicitamente
    
    public void parir(){
        System.out.println("No nacemos de huevo");
    }
    public void pelo(){
        System.out.println("Tenemos pelo!");
    }
}
