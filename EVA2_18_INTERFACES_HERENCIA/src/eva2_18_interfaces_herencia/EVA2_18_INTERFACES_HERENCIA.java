package eva2_18_interfaces_herencia;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_18_INTERFACES_HERENCIA {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

interface intA{
    public abstract void A();
}

interface intB{
    void B(); //public abstract es implicito
}

interface intC{
    public abstract void C();
}


class Prueba implements intC, intA, intB{

    @Override
    public void C() {
    }

    @Override
    public void A(){
        
    }

    @Override
    public void B() {
    }
}