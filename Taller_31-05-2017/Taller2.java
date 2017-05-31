package taller2;
import java.util.Scanner;
/*
*Autor: Andres Roman
*/
public class Taller2 {
    public static void main(String[] args) {
        // Variable para entrada por teclado
        Scanner datos = new Scanner(System.in);
        // Declaracion de variables
        int i=0, n=0, menor=100000;
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
            if(lista[i]<menor){
                menor=lista[i];            
            }
        }
        
        System.out.println("El menor es: "+menor);
    }
    
}
