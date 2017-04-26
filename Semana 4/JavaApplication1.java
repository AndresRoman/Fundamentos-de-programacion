package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int i=1, horas=0, n=0, sueldo=0, dias=20;
        String nombre;
        System.out.println("Ingrese el numero de empleados:");
        n=datos.nextInt();
        while(i<=n){
            //proceso
            System.out.println("Ingrese el nombre del empleado "+i);
            nombre=datos.next();
            System.out.println("Ingrese el total de horas al dia:");
            horas=datos.nextInt();
            
            sueldo=(15*horas)*dias;
            System.out.println("El sueldo de "+nombre+" es: "+sueldo);
            
            
            // contador
            i++;
            sueldo=0;
            
            
        }
        
    }
    
}
