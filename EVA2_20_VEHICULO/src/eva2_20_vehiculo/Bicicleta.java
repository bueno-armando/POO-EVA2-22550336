package eva2_20_vehiculo;

/**
 *
 * @author Armando Bueno
 */
public final class Bicicleta extends Vehiculo{

    public Bicicleta(String marca) {
        super(marca);
    }

    public Bicicleta() {
    }
    
    @Override
    public void Acelerar(){
        velocidad++;
        if(velocidad > 100){
            velocidad = 100;
            System.out.println("Velocidad Máxima alcanzada");
        }
    }
}
