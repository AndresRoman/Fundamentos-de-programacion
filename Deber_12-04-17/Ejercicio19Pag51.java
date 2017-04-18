package ejercicio19pag51;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.Scanner;
/**
 * Autor: Andres Roman Bustos
 * Fecha: 12/04/17
 **/
public class Ejercicio19Pag51 {
    /**
     * Deber  
     * Ejercicio 19
     **/
    public static void main(String[] args) {
        // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        double grados=0;
        double rad=0, seno=0, coseno=0;
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese el angulo en grados: \n");
        grados=datos.nextDouble();
                      
        // Realiza las operaciones
        rad=grados*3.14/180;
        seno=sin(rad);
        coseno=cos(rad);
        
        // Salida en pantalla
        System.out.print("La seno es: "+seno+"\n");
        System.out.print("La coseno es: "+coseno+"\n");
        
       
    }

   
    
}
