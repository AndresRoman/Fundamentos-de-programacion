package ejercicio5pag51;
import java.util.Scanner;
/**
 * Autor: Andres Roman Bustos
 * Fecha: 12/04/17
 **/
public class Ejercicio5Pag51 {
     /**
     * Deber  
     * Ejercicio 5
     **/
    public static void main(String[] args) {
        // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        int seg=0, vel, total=0;
                
        // Asignacion de variables
        vel=300000;        
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese los segundos: \n");
        seg=datos.nextInt();
               
        // Realiza las operaciones
        total=seg*vel;
        
        // Salida en pantalla
        System.out.print("El recorrido total es: "+total+" kilometros \n");
    }
    
}
