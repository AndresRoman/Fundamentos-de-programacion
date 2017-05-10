
package taller1;

import java.util.Scanner;
public class Taller1 {

    /*
    * Autor: Andres Roman
    * Fecha: 10/05/2017    
    */
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);        
        // Creacion de variables
        int val1,val2,val3,val4,val5,val6,val7,val8,val9,val10;        
        int res1,res2,res3,res4,res5,res6,res7,res8,res9;
        int suma;
        int decena, unidad, mod, total, resta;        
        // Datos de entrada
        System.out.println("ingrese los 10 digitos de su cedula");
        val1=op.nextInt();        
        val2=op.nextInt();        
        val3=op.nextInt();       
        val4=op.nextInt();        
        val5=op.nextInt();        
        val6=op.nextInt();        
        val7=op.nextInt();       
        val8=op.nextInt();        
        val9=op.nextInt();        
        val10=op.nextInt();        
        // Proceso
        res1=val1*2;
        res2=val2*1;
        res3=val3*2;
        res4=val4*1;
        res5=val5*2;
        res6=val6*1;
        res7=val7*2;
        res8=val8*1;
        res9=val9*2;        
        // Condicion
        if(res1>=10){
            unidad=res1%10;
            decena=res1/10;
            res1=decena+unidad;
        }
        if(res3>=10){
            unidad=res3%10;
            decena=res3/10;
            res3=decena+unidad;
        }
        if(res5>=10){
            unidad=res5%10;
            decena=res5/10;
            res5=decena+unidad;
        }
        if(res7>=10){
            unidad=res7%10;
            decena=res7/10;
            res1=decena+unidad;
        }
        if(res9>=10){
            unidad=res9%10;
            decena=res9/10;
            res9=decena+unidad;
        }        
        suma=res1+res2+res3+res4+res5+res6+res7+res8+res9;
        System.out.println("La suma de los digitos: "+suma); 
        mod=suma%10;
        total=suma+10-mod;
        System.out.println("Inmediato superior: "+total);    
        do{
            resta=total-suma;
            System.out.println("Digito a comparar: "+resta);
            System.out.println("Ultimo digito: "+val10);
            System.out.println("Su cedula es correcta");
        }while(resta>val10);               
        
    }
    
}
