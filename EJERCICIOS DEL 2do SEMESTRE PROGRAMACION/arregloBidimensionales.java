
import java.util.Scanner;
public class arregloBidimensionales
{
    public static void main (String [] args )
    {
         Scanner teclado = new Scanner (System.in);
        int arregloB [][] = {{2,3,32,4},{3,5,4,2},{2,3,32,4},{3,5,4,2}};
        int suma=0;
       
         
         for(int i=0; i < 4; i++)
         {
             for(int j=0; j < 4; j++)
             {
                 System.out.print(arregloB[i][j]+"\t");
               suma=suma +arregloB[i][j];
             }   
             System.out.println();
             
         }
         
         System.out.println( "el numero de fila es :"+ arregloB.length );
         System.out.println("el numero de columna es ;"+ arregloB[0].length );
         System.out.println(+suma);
    }
}
   
      
    
