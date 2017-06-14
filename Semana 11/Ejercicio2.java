package ejercicio2;
import java.util.Scanner;
/**
 * Autor: Andres Roman
 * Fecha: 14/06/2017
 */
public class Ejercicio2 {
    static double iva=0.12;
    
    public static void main(String[] args) {
        // Variable para la entrada de datos
        Scanner datos = new Scanner(System.in);
        // Creacion de variables
        double tipo=0, descuento=0, subt=0, resultado=0;
        // Datos de entrada
        System.out.println("Ingrese el tipo de empresa:");
        System.out.println("1. Publica");
        System.out.println("2. Privada");
        System.out.println("3. Persona Natural");
        tipo=datos.nextInt();
        System.out.println("Ingrese el subtotal:");
        subt=datos.nextDouble();
        // Llamado a la funcion
        descuento=tipoempresa(tipo)*100;
        System.out.println("El descuento es: "+descuento+"%");
        resultado=calculoiva(subt,iva)-(calculoiva(subt,iva)*tipoempresa(tipo));
        System.out.println("El calculo con IVA y descuento es: "+resultado);  
    }
    public static double tipoempresa(double op){
        double desc1=0.06, desc2=0.02, desc3=0.08;
        if (op==1){
            return desc1;
        }
        if (op==2){
            return desc2;
        }
        if (op==3){
            return desc3;
        }
        return 0;
    }
    public static double calculoiva(double subtotal, double iva){
        double total=0;
        total=subtotal+(subtotal*iva);
        return total;
    }
}
