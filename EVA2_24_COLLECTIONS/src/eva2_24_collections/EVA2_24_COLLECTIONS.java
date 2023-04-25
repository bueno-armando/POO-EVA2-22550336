package eva2_24_collections;

import java.util.ArrayList;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_24_COLLECTIONS {

    public static void main(String[] args) {
        //sin especificar tipos se puede añadir cualquier objeto
        ArrayList objArr = new ArrayList();
        objArr.add(new Persona());
        objArr.add(new Perro());
        objArr.add(new Automovil());
        System.out.println(objArr);
        
        //especificando int
        ArrayList <Integer> intArr = new ArrayList();
        intArr.add(100);
        intArr.add(200);
        intArr.add(300);
        intArr.add(400);
        System.out.println(intArr);
    }
    
}

class Persona{
    
}

class Automovil{
    
}

class Perro{
    
}
