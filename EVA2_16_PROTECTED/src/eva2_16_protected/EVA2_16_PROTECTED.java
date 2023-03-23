package eva2_16_protected;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_16_PROTECTED {
    public static void main(String[] args) {
        SubClase objSub = new SubClase();
        objSub.imprimirDato();
    }
    
}

class SuperClase{
    protected int dato = 101;

}

class SubClase extends SuperClase{
    public void imprimirDato(){
        System.out.println("El valor del dato protegido es: "+dato);
    }
}
