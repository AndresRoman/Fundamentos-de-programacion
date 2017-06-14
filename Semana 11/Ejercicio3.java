package ejercicio3;
import java.util.Scanner;
/**
 * Autor: Andres Roman
 * Fecha: 14/06/2017
 */
public class Ejercicio3 {
    static double iva=0.12;
    
    public static void main(String[] args) {
        // Variable para la entrada de datos
        Scanner datos = new Scanner(System.in);
        // Creacion de variables
        double ciclo=0, matT=0, matL=0, beca=0;
        double resultado=0, total=0, total2=0;
        // Datos de entrada
        System.out.println("Ingrese el ciclo");
        ciclo=datos.nextDouble();
        System.out.println("Ingrese el numero de materias troncales");
        matT=datos.nextDouble();
        System.out.println("Ingrese el numero de materias de libre");
        matL=datos.nextDouble();
        System.out.println("1. Beca por meritos");
        System.out.println("2. Beca familiar");
        System.out.println("0. Sin beca");
        beca=datos.nextDouble();
        // Llamado a la funcion
        resultado=costociclo(ciclo)+costomaterias(matT,matL);
        total=(calculoiva(resultado,iva));
        total2=total-(total*beca(beca));
        System.out.println("El subtotal es: "+resultado); 
        System.out.println("El calculo con IVA: "+total);
        System.out.println("El total con descuento de beca: "+total2);
    }
    public static double costociclo(double op){        
        if (op==1){
            return 700;
        }
        if (op==3){
            return 720;
        }
        if (op==5){
            return 740;
        }
        if (op==7){
            return 760;
        }
        if (op==9){
            return 780;
        }
        return 0;
    }
    public static double costomaterias(double mat1, double mat2){
        double total=0;
        total=(mat1*4*35)+(mat2*3*35);
        return total;
    }
    public static double beca(double op){
        if (op==1){
            return 0.15;
        }
        if (op==2){
            return 0.08;
        }
        return 0;
    }
    public static double calculoiva(double subtotal, double iva){
        double total=0;
        total=subtotal+(subtotal*iva);
        return total;
    }
}