package ejercicio13pag51;
import java.util.Scanner;
/**
 * Autor: Andres Roman Bustos
 * Fecha: 12/04/17
 **/
public class Ejercicio13Pag51 {
    /**
     * Deber  
     * Ejercicio 13
     **/
    public static void main(String[] args) {
        // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        double radio=0,volumen=0, area=0;
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese el radio: \n");
        radio=datos.nextDouble();
                      
        // Realiza las operaciones
        volumen=(4*3.14*(radio*radio*radio))/3;
        area=3.14*(radio*radio);
        
        // Salida en pantalla
        System.out.print("El volumen es : "+volumen+"\n");
        System.out.print("El area es : "+area+"\n");
        
    }
    
}
