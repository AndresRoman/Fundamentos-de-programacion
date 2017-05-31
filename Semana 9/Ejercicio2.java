package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Variable para entrada por teclado
        Scanner datos = new Scanner(System.in);
        // Declaracion de variables
        int i=0, n=0, j=1, k=1, sum1=0, sum2=0, lim=0;
        int[] lista;
        int[] lista2;
        int[] lista3;
        lista = new int[1000];
        lista2 = new int[1000];
        lista3 = new int[1000];
        // Entrada de datos
        System.out.println("Ingrese el limite del arreglo");
        n=datos.nextInt();
        lim=(n/2)+1;
        // Proceso
        for(i=1;i<=n;i++){
            System.out.println("Ingrese el elemento "+i);
            lista[i]=datos.nextInt();            
        }
        for(i=1;i<=n;i=i+2){
            lista2[j]=lista[i];
            sum1=sum1+lista[i];
            j++;                              
        }
        lista2[5]=sum1;
        for(i=0;i<=n;i=i+2){
            lista3[k]=lista[i];
            sum2=sum2+lista[i];
            k++;                              
        } 
        lista3[5]=sum2;
        for(j=1;j<=lim+1;j++){
            System.out.println("lista 2 ["+j+"] = "+lista2[j]);
                      
        }
        for(j=2;j<=lim+1;j++){
            System.out.println("lista 3 ["+j+"] = "+lista3[j]);
                      
        }
        
    }
    
}