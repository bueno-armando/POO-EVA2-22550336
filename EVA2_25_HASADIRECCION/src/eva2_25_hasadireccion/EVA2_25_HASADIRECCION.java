package eva2_25_hasadireccion;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_25_HASADIRECCION {
    public static void main(String[] args) {
        Persona persona = new Persona();
        //Direccion dir = new Direccion("Industrias",1101,"Complejo Industrial Chihuahua",
          //                            "31135", "Chihuahua", "Chihuahua");
        persona.setNombre("Armando");
        persona.setApellido("Alambres");
        persona.setEdad(22);
        //para asignar la dirección primero debemos crearla
        //persona.setPersonalDir(dir);
        
        persona.imprimirDatos();
    }
    
}

class Direccion{
    private String calle;
    private int num;
    private String colonia;
    private String codPostal;
    private String ciudad;
    private String estado;

    public Direccion() {
        this.calle = "N.A";
        this.num = -1;
        this.colonia = "N.A";
        this.codPostal = "N.A";
        this.ciudad = "N.A";
        this.estado = "N.A";
    }

    public Direccion(String calle, int num, String colonia, String codPostal, String ciudad, String estado) {
        this.calle = calle;
        this.num = num;
        this.colonia = colonia;
        this.codPostal = codPostal;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void imprimirDatos(){
        System.out.println("--- DIRECCIÓN ---");
        System.out.println(calle+" #"+num+", "+colonia+"\nC.P. "+codPostal+", "+ciudad+", "+estado);
    }
}

//una persona no extiende una direccion
//las relaciones de herencia tienen que ser coherentes
class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    //HAS A (tiene una) dirección
    private Direccion personalDir; //se trata como un atribtuo más

    public Persona() {
        this.nombre = "N.A";
        this.apellido = "N.A";
        this.edad = -1;
        //hacer que la dirección no exista
        this.personalDir = null;
    }

    public Persona(String nombre, String apellido, int edad, Direccion personalDir) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.personalDir = personalDir;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getPersonalDir() {
        return personalDir;
    }

    public void setPersonalDir(Direccion personalDir) {
        this.personalDir = personalDir;
    }
    
    public void imprimirDatos(){
        System.out.println("--- PERSONA ---");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        if(personalDir != null) personalDir.imprimirDatos();
        else System.out.println("(Sin dirección registrada)");
        //CUANDO LAS CLASES TENGAN OBJETOS DENTRO DE ELLAS
        //asegurarse que tengan datos por default
        //o verificar que no sean null
    }
}

class Sucursal{
    private String nombreSuc;
    private Direccion direccion;
    
}