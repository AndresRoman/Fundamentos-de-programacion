package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Variable para entrada por teclado
        Scanner datos = new Scanner(System.in);
        // Declaracion de variables
        int i=0, n=0, j=0, fact=1;
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
            if(lista[i]%2!=0){
                System.out.println("lista ["+i+"] = "+lista[i]+" es impar");
                if(lista[i]<=5){
                    j=lista[i];
                    while(j!=0){
                        fact=fact*j;
                        j--;
                    }
                    
                    System.out.println("lista ["+i+"] = "+lista[i]+" su factorial es: "+fact);
                }
                fact=1;
            }                      
        }    
        
    }
    
}
