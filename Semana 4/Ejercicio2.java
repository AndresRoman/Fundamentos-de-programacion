package ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {    
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int i=1, j, total=1, n;
        
        System.out.println("Ingrese el limite de numeros:");
        n=datos.nextInt();
        j=n;
        while(i<=n){
            total=total*((j+i)/2);
            
            // contador
            i++;
            j--;            
            
        }
        System.out.println("El total es: "+total);
    }
    
}
