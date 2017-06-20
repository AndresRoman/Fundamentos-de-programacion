package deber3;
import java.util.Scanner;
/**
 * Autor: Andres Roman
 * Fecha: 18/06/2017
 */
public class Deber3 {
    // Ingreso de variables estaticas
    private int[][] matriz;
    private Scanner datos;
    private int i=0, j=0;
    public static void main(String[] args) {
        // Creacion de funcion
        Deber3 ma=new Deber3();
        // Llamado a las funciones
        ma.llenarM();
        ma.presentarM();
        ma.sobreDS();
        ma.debajoDP();
        ma.debajoDS();
    }
    public void llenarM(){
        datos=new Scanner(System.in);
        int lim=0;
        System.out.println("Ingrese el tamaño de la matriz:"); 
        lim=datos.nextInt();
        matriz = new int[lim][lim];
        // Ingreso de la matriz      
        for(i=0;i<lim;i++){
            for(j=0;j<lim;j++){
                System.out.println("Ingrese el elemento ("+i+","+j+")");
                matriz[i][j]=datos.nextInt();
            }
        }
    }
    public void presentarM(){
        System.out.println("La matriz ingresada es:");
        // Presentacion de la matriz
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+"");             
            }
            System.out.println();
        }
    }
    public void sobreDS(){
        // Presentacion de elementos
        System.out.println("1.Elementos sobre la diagonal secundaria:");
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz.length;j++){
                if((i+j)<(matriz.length-1)){
                   System.out.print(matriz[i][j]+" "); 
                }                
            }            
        }
        System.out.println();
    }
    public void debajoDP(){
        // Presentacion de elementos
        System.out.println("2.Elementos debajo de la diagonal principal:");
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz.length;j++){
                if(i>j){
                   System.out.print(matriz[i][j]+" "); 
                }                
            }            
        }
        System.out.println();
    }
    public void debajoDS(){
        // Presentacion de elementos
        System.out.println("3.Elementos debajo de la diagonal secundaria:");
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz.length;j++){
                if((i+j)>=matriz.length){
                   System.out.print(matriz[i][j]+" "); 
                }                
            }            
        } 
        System.out.println();
    }
    
}
