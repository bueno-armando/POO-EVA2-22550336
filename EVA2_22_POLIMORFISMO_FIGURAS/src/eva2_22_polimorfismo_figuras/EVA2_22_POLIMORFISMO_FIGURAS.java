package eva2_22_polimorfismo_figuras;
import java.util.Scanner;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_22_POLIMORFISMO_FIGURAS {

    public static void main(String[] args) {
        /*Circulo circle = new Circulo(5);
        circle.imprimirDatos();
        Figuras figu = circle; //reduciendo de figura a circulo
        System.out.println("Area: "+figu.calcularArea());
        // los datos (que se pueden) se heredan
        // figu sigue siendo circulo visto de otra manera
        // (reduciendole atributos/metodos)
        
        //int[] a, b, c TODOS SON ARREGLOS
        Circulo[] circArr = new Circulo[10]; //ninguno ha sido creado
        //NullPoinerException => no se ha creado el objeto
        
        for(int i=0 ; i<circArr.length ; i++){
            circArr[i] = new Circulo(i);
            circArr[i].calcularArea();
            circArr[i].imprimirDatos();
            //creando objeto en index i
        }*/
        
        Figuras[] figArr;
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas figuras quieres capturar? => ");
        int n = sc.nextInt();
        figArr = new Figuras[n];
        for(int i=0 ; i<n ; i++){
            System.out.print("Figuras:\n1.Circulo\n2. Triangulo\n=> ");
            int pick = sc.nextInt();
            if(pick == 1){
                Circulo auxCirc = new Circulo();
                System.out.print("Radio => ");
                auxCirc.setRadio(sc.nextDouble());
                figArr[i] = auxCirc;
            }
            else {
                Triangulo auxTriang = new Triangulo();
                System.out.print("Base => ");
                auxTriang.setBase(sc.nextDouble());
                System.out.print("Altura => ");
                auxTriang.setAlt(sc.nextDouble());
                figArr[i] = auxTriang;

            }
        }
        
        for(int i=0 ; i<figArr.length ; i++){
            System.out.println("******");
            if(figArr[i] instanceof Circulo){
                System.out.println("Figura "+(i+1)+": CIRCULO");
                Circulo auxCirc =(Circulo)figArr[i]; //CASTING
                //regresando de "Figura" a Circulo/Triangulo
                auxCirc.imprimirDatos();
            }
            else{
                System.out.println("Figura "+(i+1)+": TRIANGULO");
                Triangulo auxTriang = (Triangulo)figArr[i]; //CASTING
                auxTriang.imprimirDatos();
                
            }
        }
        
    }
    
}
