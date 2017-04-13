package ejercicio3;
import java.util.Scanner;
/**
 * Autor: Andres Roman Bustos
 * Fecha: 12/04/17
 **/
public class Ejercicio3 {
    /**
     * Taller  
     * Ejercicio 3
     * Programa que imprima la media de alturas
     **/
    public static void main(String[] args) {
        // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);        
        
        // Creacion de variables
        double alt1=0, alt2=0, alt3=0, alt4=0, alt5=0;
        double media=0;
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese la altura de la persona 1: \n");
        alt1=datos.nextDouble();
        System.out.print("Ingrese la altura de la persona 2: \n");
        alt2=datos.nextDouble();
        System.out.print("Ingrese la altura de la persona 3: \n");
        alt3=datos.nextDouble();
        System.out.print("Ingrese la altura de la persona 4: \n");
        alt4=datos.nextDouble();
        System.out.print("Ingrese la altura de la persona 5: \n");
        alt5=datos.nextDouble();        
        
        // Realiza las operaciones
        media=(alt1+alt2+alt3+alt4+alt5)/5;
        
        // Salida en pantalla
        System.out.print("La altura media es: "+media+"\n");
                
    }
    
}
