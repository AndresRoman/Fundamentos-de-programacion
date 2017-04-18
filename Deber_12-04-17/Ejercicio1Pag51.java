package ejercicio1.pag51;
import java.util.Scanner;
/**
 * Autor: Andrés Román Bustos
 * Fecha: 12/04/17
 **/
public class Ejercicio1Pag51 {
    /**
     * Deber  
     * Ejercicio 1
     **/
    public static void main(String[] args) {
       
        // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        int cant=0;
        double costom, costof, total=0; 
        
        // Asignacion de variables
        costom=3.5;
        costof=10700;        
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese el numero de unidades a producir: \n");
       cant=datos.nextInt();
               
        // Realiza las operaciones
        total=costom*cant+costof;
        
        // Salida en pantalla
        System.out.print("El costo total es: "+total+"\n");
        
    }
    
}
