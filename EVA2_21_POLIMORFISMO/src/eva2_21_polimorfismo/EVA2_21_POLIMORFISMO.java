package eva2_21_polimorfismo;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_21_POLIMORFISMO {

    public static void main(String[] args) {
        Estudiante estu = new Estudiante("Juan", "Pérez", 24, "91024");
        Docentes docente = new Docentes("Julio", "Jacinto", 22, "PL124897");
        // PUEDO TRATAR A LOS OBJETOS DE LAS SUBCLASES COMO
        //OBJETOS DE LA SUPERCLASE. AL REVÉS NO SE PUEDE
        //ESTOY ASIGNANDO UN OBJETO DE TIPO ESTUDIANTE A UNA
        //VARIABLE DE TIPO PERSONA
        Persona perso = estu;
        //ESTOY GENERALIZANDO (SIMPLIFICANDO)
        Persona perso2 = docente; //se puede de superclase a sublcase
        // QUITAMOS/ocultamos para aplicar POLIMORFISMO. (al revés no)
        // No se puede convertir una persona en Estudiante
        Persona perso3 = new Persona();
        //Estudiante estu2 = perso3; no se puede de sublcase a superclase
    }
    
}
