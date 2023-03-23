package eva2_15_tienda;
import Productos.*;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_15_TIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora myPC = new Computadora();
        Playera myShirt = new Playera();
        
        //CONFIGURAR DATOS COMPUTADORA
        myPC.setPrecio(12500);
        myPC.setNombre("Laptop");
        myPC.setUnidad("Pz");
        myPC.setFabricante("Lenovo");
        myPC.setModelo("Ideapad 330");
        myPC.setGarantia(30); //dias
        myPC.setTamaño(14); //pulgadas
        myPC.setMemoria(8);
        myPC.setProcesador("AMD A4");
        myPC.setDiscoDuro(512);
        
        //CONFIGURAR DATOS PLAYERA
        myShirt.setPrecio(300);
        myShirt.setNombre("Playera Polo Caballero");
        myShirt.setUnidad("Pz");
        myShirt.setMarca("Gildan");
        myShirt.setColor("Negro");
        myShirt.setTalla(30);
        myShirt.setTipo("Playera");
        
        //imprimir datos mediante toString()
        System.out.println(myPC);
        System.out.println(myShirt);
        
    }
    
}
