package eva2_20_vehiculo;

/**
 *
 * @author mrnice
 */
public abstract class Vehiculo implements ControlVelocidad{
    protected double velocidad;
    protected String marca;

    public Vehiculo(String marca) {
        velocidad = 0;
        this.marca = marca;
    }

    public Vehiculo() {
        velocidad = 0;
        marca = "N.A";
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public void Detener() {
        System.out.println("Vehículo Detenido");
        velocidad = 0;
    }

    @Override
    public void imprimirVel() {
        System.out.println("Velocidad: "+velocidad+" km/h");
    }
    
}
