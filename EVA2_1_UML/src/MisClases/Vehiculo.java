package MisClases;

/**
 *
 * @author Armando Bueno
 */
public class Vehiculo {
    private String brand, model;
    private short year;
    
    //get
    String getBrand(){
        return brand;
    }
    String model(){
        return model;
    }
    Short year(){
        return year;
    }
    //set
    void setBrand(String x){
        brand = x;
    }
    void Model(String x){
        model = x;
    }
    void setYear(short x){
        year = x;
    }
    //imprimirDatos
    void imprimirDatos(){
        System.out.println("Marca: "+brand);
        System.out.println("Modelo: "+model);
        System.out.println("Año "+year);
    }
}
