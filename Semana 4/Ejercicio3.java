package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {    
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int i=1, j, total=1, n, k;        
        n=6;
        j=n;
        while(i<=n){
           if(j%2!=0){
               k=1;
               while(k<=j){
                   j=j*k;
                   k++;
               }
            }
            total=total*(i+j);
            // contador
            i++;
            j--;            
            
        }
        System.out.println("El total es: "+total);
    }
    
}
