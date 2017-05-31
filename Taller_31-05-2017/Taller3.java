package taller3;
import java.util.Scanner;
/*
*Autor: Andres Roman
*/
public class Taller3 {
    public static void main(String[] args) {
        // Variable para entrada por teclado
        Scanner datos = new Scanner(System.in);
        // Declaracion de variables
        int i=0, n=0, j=0, rep=0;
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
            for(j=1;j<=n;j++){
                if(lista[j]==lista[i]){
                    rep=rep+1;
                }
            }
            System.out.println("El numero "+lista[i]+" se repite "+rep+" veces");
            rep=0;
        }
        
        
    }
    
}

