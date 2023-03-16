package eva2_10_override;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_10_OVERRIDE {
    
    public static void main(String[] args) {
        Persona person = new Persona();
        Persona person2 = new Persona("Julio Jaquez", 48);
        //toString se llama automaticamente, en este caso el que hicimos con override
        System.out.println(person);
        System.out.println(person2);
    }
    
}


class Persona{
    private String name = "N.A";
    private int age = -1;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Persona() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override //etiqueta solamente para nosotros
    public String toString(){
        //super.toString(); no se usa porque queremos reemplazar todo
        String ans = "DATOS DE LA PERSONA: \nNombre: "+name+"\nEdad: "+age;
        return ans;
    }
    
    
}