

import java.util.Scanner;
public class Ejercicio_05
{
    public static void main (String [] args )
    {
        double nota1=0;
        double nota2=0;
        double nota3=0;
        double suma=0;
        double promedio=0;
         Scanner teclado = new Scanner (System.in);
         
        System.out.println("ingrese la primera nota ");
         nota1=teclado.nextDouble( );
         System.out.println("ingrese la segunda  nota ");
         nota2=teclado.nextDouble( );
         System.out.println("ingrese la tercera nota ");
         nota3=teclado.nextDouble( );
         
         suma=nota1+nota2+nota3;
         promedio=suma/3;
         
         if (promedio>=7)
         {
              System.out.println("el alumno  aprobado ");
            }
            else
            {
              System.out.println("el alumno no  aprobo ");
              
            }
        
        
    
        }
    }
