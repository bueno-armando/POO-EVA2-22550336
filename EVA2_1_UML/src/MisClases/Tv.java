package MisClases;

/**
 *
 * @author Armando Bueno
 */
public class Tv {
    private short channel;
    private byte vol;
    private boolean powerOn;
    
    //get
    short getChannel(){
        return channel;
    }
    byte getVol(){
        return vol;
    }
    boolean getPowerOn(){
        return powerOn;
    }
    //Set
    void setChannel(short x){
        channel = x;
    }
    void setVol(byte x){
        vol = x;
    }
    void setPowerOn(boolean x){
        powerOn = x;
    }
    //imprimirDatos
    void imprimirDatos(){
        System.out.println("Canal: "+channel);
        System.out.println("Volumen: "+vol);
        System.out.println("Encendida: "+powerOn);
    }
}
