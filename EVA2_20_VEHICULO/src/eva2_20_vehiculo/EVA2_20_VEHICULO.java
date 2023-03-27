package eva2_20_vehiculo;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_20_VEHICULO {

    public static void main(String[] args) {
        Automovil bocho = new Automovil("VolksWagen");
        Bicicleta bici = new Bicicleta("Harley Davidson");
        
        System.out.println("----- MANEJANDO BOCHITO ------");
        for(int i=0 ; i<=200 ; i++){
            bocho.Acelerar();
            bocho.imprimirVel();
        }
        bocho.Detener();
        bocho.imprimirVel();
        
        System.out.println("----- MANEJANDO BICICLETA ------");
        for(int i=0 ; i<=100 ; i++){
            bici.Acelerar();
            bici.imprimirVel();
        }
        bici.Detener();
        bici.imprimirVel();
    }
    
}
