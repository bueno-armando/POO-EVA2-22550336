package eva2_23_polimorfismo_vehiculos;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_23_POLIMORFISMO_VEHICULOS {

    public static void main(String[] args) {
        //modelo año marca vel
        Automovil auto = new Automovil("Innovator", 2018, "Tesla", 0);
        //tipo, rodada, marca, vel
        Bicicleta bici = new Bicicleta("Montaña", "XXX", "Harley Davidson", 0);
        
        cambiarVelocidad(bici, 50);
        cambiarVelocidad(auto, 20);
        //revisar superclase object
    }
    
    //NO se está instanciando cambiarVelocidad
    public static void cambiarVelocidad(DatosVehiculo vehi, int vel){
    //se está pasando de bici/auto a datos vehiculo
    vehi.acelerar(vel);
    vehi.tablero();
}
}



interface DatosVehiculo{
    public abstract void acelerar(int cambio);  //modificar la velocidad
    void tablero(); //imprimir datos
    //public abstract viene por default
}

class Vehiculo{
    private String marca;
    protected int velocidad;

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public Vehiculo() {
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    //Velocidad no debe llevar get, se
    //modifica con acelerar
}

class Automovil extends Vehiculo implements DatosVehiculo{
    private String modelo;
    private int año;

    public Automovil(String modelo, int año, String marca, int velocidad) {
        super(marca, velocidad);
        this.modelo = modelo;
        this.año = año;
    }
    
    public Automovil(){
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    @Override
    public void acelerar(int cambio) {
        //aceptar solo velocidades positivas o 0
        cambio += velocidad;
        if(cambio >= 0) velocidad = cambio;
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad del automóvil: "+velocidad);
    }
}

class Bicicleta extends Vehiculo implements DatosVehiculo{
    private String tipo;
    private String rodada;

    public Bicicleta(String tipo, String rodada, String marca, int velocidad) {
        super(marca, velocidad);
        this.tipo = tipo;
        this.rodada = rodada;
    }

    public Bicicleta() {
        super();
        tipo = "N.A";
        rodada = "N.A";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    @Override
    public void acelerar(int cambio) {
        //aceptar solo velocidades positivas o 0
        cambio += velocidad;
        if(cambio >= 0) velocidad = cambio;
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad de la bicicleta: "+velocidad);
    }
}
