package ejercicio11pag51;
import java.util.Scanner;
/**
 * Autor: Andres Roman Bustos
 * Fecha: 12/04/17
 **/
public class Ejercicio11Pag51 {
    /**
     * Deber  
     * Ejercicio 11
     * @param args
     **/
    public static void main(String[] args) {
        // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        double dolares=0,cambio=0, pesos=0;
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese la cantidad de dolares: \n");
        dolares=datos.nextDouble();
        System.out.print("Ingrese el tipo de cambio: \n");
        cambio=datos.nextDouble();
               
        // Realiza las operaciones
        pesos=dolares*cambio;
        
        // Salida en pantalla
        System.out.print(+dolares+" dolares equivale a: "+pesos+" pesos \n");
        
    }
    
}
