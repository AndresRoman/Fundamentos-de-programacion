package ejercicio1;
import java.util.Scanner;
/**
 * Autor: Andrés Román Bustos
 * Fecha: 12/04/17
 **/
public class Ejercicio1 {
    /**
     * Taller  
     * Ejercicio 1
     * Programa que imprima el costo de un terreno
     **/
    public static void main(String[] args) {
        // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);        
        
        // Creacion de variables
        double anchura=0, longitud=0, costo=0;
        double total=0;
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese la anchura del terreno: \n");
        anchura=datos.nextDouble();
        System.out.print("Ingrese la longitud del terreno: \n");
        longitud=datos.nextDouble();
        System.out.print("Ingrese el valor por metro cuadrado: \n");
        costo=datos.nextDouble();
        
        // Realiza las operaciones
        total=(anchura*longitud)*costo;
        
        // Salida en pantalla
        System.out.print("El costo total es: "+total+"\n");
                
    }
    
}
