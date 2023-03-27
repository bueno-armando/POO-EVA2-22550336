package MisClases;

/**
 *
 * @author Armando Bueno
 */
public class Persona {
   private String ID, name;
   private byte age;
   
   //get
   String getID(){
       return ID;
   }
   String getName(){
       return name;
   }
   Byte getAge(){
       return age;
   }
   //set
   void setID(String x){
       ID = x;
   }
   void setName(String x){
       name = x;
   }
   void setAge(byte x){
       age = x;
   }
   //imprimirDatos
   void imprimirDatos(){
       System.out.println("ID: "+ID);
       System.out.println("Nombre: "+name);
       System.out.println("Edad: "+age);
   }
}
