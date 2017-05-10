/*
* Numero Randomico par
*/
package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {

    /*
    * Autor: Andres Roman
    * Fecha: 10/05/2017    
    */
    public static void main(String[] args) {
        // Variable para pedir por teclado
        Scanner datos = new Scanner(System.in);
        // Creacion de variables
        int n, op=1, i=1, res=0, x=0;
               
        // Ciclo do...while
        do{
            
            System.out.println("Ingrese un numero");
            n=datos.nextInt();
        
            do{
                x=(int)(Math.random()* n);
                System.out.println("Numero: "+x);
            }while(x % 2 != 0);
            System.out.println("Numero seleccionado es: "+x);
            System.out.println("Ingrese 0 para terminar / 1 para continuar");
            op=datos.nextInt();
        }while(op!=0);
        
        
    }
    
}
