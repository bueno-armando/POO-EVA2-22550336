package eva2_7_this;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_7_THIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //imprimir(); no podemos usar cosas no estáticas en un
        //contexto estático
        //THIS tampoco se puede usar en contexto no estático
    }
    
    public void imprimir(){
        //aqui tambien es visible this
    }
}
