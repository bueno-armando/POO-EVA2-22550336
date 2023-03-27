package eva2_20_vehiculo;

/**
 *
 * @author Armando Bueno
 */
public final class Automovil extends Vehiculo {

    public Automovil(String marca) {
        super(marca);
    }

    public Automovil() {
    }
    

    @Override
    public void Acelerar() {
        velocidad++;
        if(velocidad > 200){
            velocidad = 200;
            System.out.println("Velocidad Máxima Alcanzada");
        }
    }

    
}
