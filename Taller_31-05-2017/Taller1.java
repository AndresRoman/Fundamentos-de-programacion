package taller1;
import java.util.Scanner;
/*
*Autor: Andres Roman
*/
public class Taller1 {
    public static void main(String[] args) {
        // Variable para entrada por teclado
        Scanner datos = new Scanner(System.in);
        // Declaracion de variables
        int i=0, n=0, mayor=0;
        double prom=0, sum=0;
        int[] lista;
        lista = new int[1000];
        // Entrada de datos
        System.out.println("Ingrese el limite del arreglo");
        n=datos.nextInt();
        // Proceso
        for(i=1;i<=n;i++){
            System.out.println("Ingrese el elemento "+i);
            lista[i]=datos.nextInt();            
        }
        for(i=1;i<=n;i++){
            sum=sum+lista[i]; 
            if(lista[i]>mayor){
                mayor=lista[i];
            
            }
        }    
        prom=sum/n;
        System.out.println("La suma es: "+sum);
        System.out.println("El promedio es: "+prom);
        System.out.println("El mayor es: "+mayor);
    }
    
}
