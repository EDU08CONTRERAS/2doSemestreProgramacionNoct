
import java.util.Scanner;
public class DeclarandoArreglos
{
    public static void main (String [] args )
    {
        Scanner teclado = new Scanner (System.in);
        String nombres[] = new String [4];
        
        for(int i=0 ; i< 4; i++)
        {
          System.out.println("ingrese su nombre");
          nombres [i] = teclado.nextLine();
        }
        
        double notas[] = new double[5];
         for(int e=0 ; e< 5; e++)
        {
          System.out.println("ingrese su numero reales");
          notas [e] = teclado.nextDouble();
        }
        
        int edadEstudiantes[] = new int[3];
        for(int m=0 ; m< 3; m++)
        {
          System.out.println("ingrese edad Estudiantes");
          edadEstudiantes [m] = teclado.nextInt(); 
        }
       
        String nombresCompleto [] = {"EDU","MARLON","CONTRERAS","ZAMBRANO"};
        
        for(int v=0 ; v< 4; v++)
        {
          System.out.println(nombresCompleto [v]);
        }
        
    }
    }
    
    
    

