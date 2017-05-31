package taller4;
import java.util.Scanner;
/*
* Autor: Andres Roman 
*/
public class Taller4 {
    public static void main(String[] args) {
        // Variable para entrada por teclado
        Scanner datos = new Scanner(System.in);
        // Declaracion de variables
        int i=0, n=0, j=1, unidad=0, decena=0, suma=0, mod=0, total=0, resta=0, val10=0;
        int[] lista, res;
        lista = new int[11];
        res = new int [11];
        
        // Proceso
        for(i=1;i<=10;i++){
            System.out.println("Ingrese el numero "+i);
            lista[i]=datos.nextInt();
            
        }
        for(i=1;i<=10;i++){
            if(i%2!=0){
                res[j]=lista[i]*2;
                j++;
            }else{
                res[j]=lista[i];
                j++;
            }
            if(i==10){
                val10=lista[10];
            }
        }
        for(i=1;i<=9;i++){
            if(res[i]>=10){
                unidad=res[i]%10;
                decena=res[i]/10;
                res[i]=decena+unidad;
            }               
        }
        for(i=1;i<=9;i++){
            suma=suma+res[i];             
        }
        System.out.println("La suma de los digitos: "+suma);        
        mod=suma%10;
        total=suma+10-mod;        
        System.out.println("Inmediato superior: "+total); 
        resta=total-suma;
        System.out.println("Digito a comparar: "+resta);
        
        if(resta==val10){
            System.out.println("Su cedula es correcta");
        } else {
            System.out.println("Su cedula es incorrecta");
        }
        
    }
    
}
