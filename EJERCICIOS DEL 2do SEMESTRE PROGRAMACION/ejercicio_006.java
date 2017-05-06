import java.util.Scanner;
public class ejercicio_006
{
    public static void main (String [] args) 
    {
     Scanner lea = new Scanner (System.in);
     int determinante;
     System.out.println (" Matrices 3x3");
     int matriz[][]=new int[3][3];
     System.out.println ("Ingrese los elementos de las siguientes intersecciones de la Matriz 'A'en su respectivo orden: ");
     System.out.println ("[ [1, 2, 3], [4, 5, 6], [7, 8, 8] ]");
     for(int i=0;i<3;i++)
     {
         for(int j=0;j<3;j++)
         {
           matriz[i][j] = lea.nextInt();
         }
     }
     System.out.println ("A = ");
     for(int i=0;i<3;i++)
     {
         for(int j=0;j<3;j++)
         {
            System.out.print ("|"+ matriz[i][j] +"|");
         }
         System.out.println (); 
     }
     System.out.println("La determinante es : " + retornaDeterminante(matriz));
  }
  public static int  retornaDeterminante (int matriz1[] [] ) 
  {
      int determinante = 0;
      determinante = ((matriz1[0][0] * matriz1[1][1] * matriz1[2][2]) + (matriz1[0][1] * matriz1[1][2] * matriz1[2][0])+
      (matriz1[0][2] * matriz1[1][0] * matriz1[2][1])  -  (matriz1[0][0] * matriz1[1][2] * matriz1[2][1]) - (matriz1[0][1] *
      matriz1[1][0] * matriz1[2][2]) - (matriz1[0][2] * matriz1[1][1] * matriz1[2][0]) );
      return determinante;
    }  
}


