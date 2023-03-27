package eva2_17_interfaz;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_17_INTERFAZ {

    public static void main(String[] args) {
        //MostrarDatos datos = new MostrarDatos();
        //^ NO se pueden instanciar las interfaces
        Persona perso = new Persona("Julian Casas", 38);
        perso.imprimirDatos();
        
        Computadora miPC = new Computadora("AMD Ryzen", 16, 14500.80, "PC Escritorio");
        miPC.imprimirDatos();

    }
    
}
