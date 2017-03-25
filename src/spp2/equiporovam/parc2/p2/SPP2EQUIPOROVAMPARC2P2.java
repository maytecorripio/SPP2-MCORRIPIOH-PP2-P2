/*
Orianna Linette Virgen Mar       A01411515
María Teresa Corripio Herrera  A01410393
Rafael Alejandro Cisneros Gual A01410038
Leticia Vianey Narváez Reyes     A01410432
Ana Martha Alanis Cortaza        A01411418

 */
package spp2.equiporovam.parc2.p2;
import java.util.Scanner;

/**
 *
 * @author MayteCorripio
 */
public class SPP2EQUIPOROVAMPARC2P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al programa#2 que evalua si los arregos son iguales");
        Scanner kb = new Scanner (System.in);
        int d;
        System.out.println("Introduzca el largo y el ancho de su arreglo");
        d = pedirDato();
        int[][] arregloa = new int [d][d];
        int[][] arreglob = new int [d][d];
        System.out.println("Introduzca los valores del primer arreglo");
        arregloa =  arreglo(d);
        System.out.println("Introduzca los valores del segundo arreglo");
        arreglob = arreglo(d);
        evaluar (arregloa, arreglob);
        
    }
    
    public static int pedirDato(){
        Scanner kb =  new Scanner (System.in);
        boolean flag;
        int n=0;
            do{
                System.out.println("Introduzca un numero entero");
            try{
                n= kb.nextInt();
                flag=false;
            } catch(Exception er){
                System.out.println("Intentelo de nuevo");
                flag=true;
                kb.nextLine(); 
            }
            } 
        while (flag);
        return n;
    }
    public static int [][] arreglo(int d){
        int[][] arreglo = new int[d][d];
            for(int i=0; i<arreglo.length; i++){
                for(int j=0; j<arreglo.length; j++){
                    arreglo[i][j] = pedirDato();
                }
                }
            return arreglo;
    }
    public static void evaluar(int[][]arregloa, int[][]arreglob){
        int x=0;
            for(int i=0; i<arregloa.length; i++){
                for (int j=0; j<arregloa.length; j++){
                    x=arregloa [i][j]- arreglob[i][j];
                    if( x==0){   
                    }else{
                        System.out.println("Sus arreglos son diferentes");
                        x=2;
                        break;
                    }
                }
            }
            if(x==0){
                System.out.println("Sus arreglos son iguales");
            }else{    
    }
    }
    }

