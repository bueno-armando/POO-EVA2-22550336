package eva2_2_herencia;

/**
 *
 * @author Armando Bueno
 */
public class Estudiante {
    private String name;
    private String secondName;
    private int age;
    private String controlNum;
    
    //constructors

    public Estudiante() {
    }

    public Estudiante(String name, String secondName, int age, String controlNum) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.controlNum = controlNum;
    }
    
    
    
    //getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getControlNum() {
        return controlNum;
    }
    public void setControlNum(String controlNum) {
        this.controlNum = controlNum;
    }
    
}
