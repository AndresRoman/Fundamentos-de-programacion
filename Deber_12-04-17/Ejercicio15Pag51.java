package ejercicio15pag51;
import java.util.Scanner;
/**
 * Autor: Andres Roman Bustos
 * Fecha: 12/04/17
 **/
public class Ejercicio15Pag51 {
    /**
     * Deber  
     * Ejercicio 15
     **/
    public static void main(String[] args) {
        // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        double dolares=0;
        double cambioy=0, cambiop=0, cambiol=0, cambiom=0;
        double yenes=0, pesetas=0, libras=0,marcos=0;
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese los dolares: \n");
        dolares=datos.nextDouble();
        System.out.print("Ingrese el tipo de cambio a yenes: \n");
        cambioy=datos.nextDouble();
        System.out.print("Ingrese el tipo de cambio a pesetas: \n");
        cambiop=datos.nextDouble();
        System.out.print("Ingrese el tipo de cambio a libras: \n");
        cambiol=datos.nextDouble();
        System.out.print("Ingrese el tipo de cambio a marcos: \n");
        cambiom=datos.nextDouble();
                      
        // Realiza las operaciones
        yenes=dolares*cambioy;
        pesetas=dolares*cambiop;
        libras=dolares*cambiol;
        marcos=dolares*cambiom;
        
        // Salida en pantalla
        System.out.print(+dolares+" dolares equivale a : \n");
        System.out.print(+yenes+" yenes \n");
        System.out.print(+pesetas+" pesetas \n");
        System.out.print(+libras+" libras \n");
        System.out.print(+marcos+" marcos \n");
    }
    
}
