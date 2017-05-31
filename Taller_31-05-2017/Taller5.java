package taller5;
import java.util.Scanner;
/*
*Autor: Andres Roman
*/
public class Taller5 {
    public static void main(String[] args) {
        // Variable para entrada por teclado
        Scanner datos = new Scanner(System.in);
        // Declaracion de variables
        int i=0, n=0;
        int[] A;
        A = new int[1000];
        int[] B;
        B = new int[1000];
        int[] suma;
        suma = new int[1000];
        int[] resta;
        resta = new int[1000];
        int[] mult;
        mult = new int[1000];
        // Entrada de datos
        System.out.println("Ingrese el limite de los arreglos");
        n=datos.nextInt();
        System.out.println("Arreglo A");
        for(i=1;i<=n;i++){
            System.out.println("Ingrese el elemento "+i);
            A[i]=datos.nextInt();            
        }
        System.out.println("Arreglo B");
        for(i=1;i<=n;i++){
            System.out.println("Ingrese el elemento "+i);
            B[i]=datos.nextInt();            
        }
        // Proceso
        for(i=1;i<=n;i++){
            suma[i]=A[i]+B[i];
            resta[i]=A[i]-B[i];
            mult[i]=A[i]*B[i];            
        }
        // Salida de datos
        System.out.println("Arreglo A: ");
        for(i=1;i<=n;i++){
            System.out.print(" "+A[i]);
        }
        System.out.println();
        System.out.println("Arreglo B: ");
        for(i=1;i<=n;i++){
            System.out.print(" "+B[i]);
        }
        System.out.println();
        System.out.println("La suma es: ");
        for(i=1;i<=n;i++){
            System.out.print(" "+suma[i]);
        }
        System.out.println();
        System.out.println("La resta es: ");
        for(i=1;i<=n;i++){
            System.out.print(" "+resta[i]);
        }
        System.out.println();
        System.out.println("La multiplicacion es: ");
        for(i=1;i<=n;i++){
            System.out.print(" "+mult[i]);
        }
        System.out.println();
    }
    
}


