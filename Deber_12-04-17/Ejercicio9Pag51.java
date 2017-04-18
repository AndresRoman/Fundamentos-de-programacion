package ejercicio9pag51;
import java.util.Scanner;
/**
 * Autor: Andres Roman Bustos
 * Fecha: 12/04/17
 **/
public class Ejercicio9Pag51 {
    /**
     * Deber  
     * Ejercicio 9
     **/
    public static void main(String[] args) {
        // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        double costo=0, utilidad, impuesto, precio=0;
        double utilidadtotal=0, impuestototal=0;
        String articulo;
        
        // Asignacion de variables
        utilidad=1.5;
        impuesto=0.15;
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese el nombre del articulo: \n");
        articulo=datos.next();
        System.out.print("Ingrese el costo del articulo: \n");
        costo=datos.nextDouble();
               
        // Realiza las operaciones
        utilidadtotal=costo*utilidad;
        impuestototal=costo*impuesto;
        precio=costo+utilidadtotal+impuestototal;
        
        // Salida en pantalla
        System.out.print("El articulo "+articulo+" tiene una utilidad de "+utilidadtotal+",\n");
        System.out.print("un impuesto de "+impuestototal+" y un precio de venta de "+precio+"\n");
    }
    
}