package ejercicio1;
import java.util.Scanner;
/**
 * Autor: Andres Roman
 * Fecha: 14/06/2017
 */
public class Ejercicio1 {
    static double iva=0.12;
    
    public static void main(String[] args) {
        // Variable para la entrada de datos
        Scanner datos = new Scanner(System.in);
        // Creacion de variables
        double resultado=0, subt=0;
        // Datos de entrada
        System.out.println("Ingrese el subtotal");
        subt=datos.nextDouble();
        // Llamado a la funcion
        resultado=calculoiva(subt,iva);
        System.out.println("El calculo con IVA es: "+resultado);
        
    }
    
    public static double calculoiva(double subtotal, double iva){
        double total=0;
        total=subtotal+(subtotal*iva);
        return total;
    }
}
