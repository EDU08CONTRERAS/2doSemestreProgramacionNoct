
import java.util.Scanner;
public class ejercicioArreglosBidimensionar
{
   public static void main (String []args)
   {
       int matriz[][] = new int [4][4];
        
       Scanner teclado = new Scanner (System.in);
         System.out.println("ingrese valores");
       for(int e=0; e<4;e++)
       {
           
           for(int m=0; m<4;m++)
           {
            
            matriz[e][m]= teclado.nextInt () ;
           }
       }
       
       for(int e=0; e<4;e++)
       {
           for(int m=0; m<4;m++)
           {
               System.out.print(matriz[e][m]+"\t");
           
           }
           System.out.println("");
       }
   }
   
}
