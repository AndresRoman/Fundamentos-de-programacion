
package javaapplication2;
import java.util.Scanner;
public class JavaApplication2 {

    /*
    * Autor: Andres Roman
    * Fecha: 10/05/2017    
    */
    public static void main(String[] args) {
        // Variable para pedir por teclado
        Scanner datos = new Scanner(System.in);
        // Creacion de variables
        int n, a=0, i=1, res=0, x=0;
        
        // Datos de entrada
        System.out.println("Ingrese un numero");
        n=datos.nextInt();
        
        // Ciclo do...while
        do{
            n++;
        }while(n%10 != 0);
        
        do{
            
            System.out.println(+n);
            n=n-10;
            
        }while(n>=10);
        
        
    }
    
}
