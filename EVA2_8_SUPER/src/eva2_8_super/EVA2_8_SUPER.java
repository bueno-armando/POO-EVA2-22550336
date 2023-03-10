package eva2_8_super;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_8_SUPER {

    public static void main(String[] args) {
        //super --> apuntador a la superclase
        Animal animal = new Animal("Rigoberto",13.14);
        Mamifero mamifero = new Mamifero("Black", "Julio", 41.);
        Canes perro = new Canes();
    }

}

class Animal{
    private String name;
    private double weight;
    
    public Animal(){
        System.out.println("IT'S ALIVE!");
    }
    
    //
    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
        System.out.println("IT'S ALIVE (constructor 2)");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void respirar(){
        System.out.println("Currently Breathing");
    }
    
  }

 class Mamifero extends Animal{
    private String hairColor;
    
    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    
    
    public Mamifero(){
        super(); //llamada al constructor default
        //lo primero a llamar en un constructor es llamar
        //al constructor de la superclase
        System.out.println("IT'S A MAMMAL");
    }

    public Mamifero(String hairColor, String name, double weight) {
        super(name, weight);
        System.out.println("IT'S A MAMMAL CONSTRUCTOR 2");
        this.hairColor = hairColor;
    }
  }

class Canes extends Mamifero{
    public Canes(){
        super(); //llamando al constructor de mamifero
        System.out.println("IT'S A K9");
    }
}
