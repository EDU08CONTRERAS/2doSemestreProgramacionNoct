
import java.util.Scanner;
public class Ejercicio_03
{
    public static void main ( String [] args )
    {
        Scanner teclado=new Scanner (System.in);
        int dia,mes,año;
   // para que una fecha sea correcta se tiene que cumplir
   // día en el rango 1..30
   // mes en el rango 1..12
   // año cualquiera distinto del 0
   //Captura dia
   System.out.print("Introduzca día: ");
   dia=teclado.nextInt();
   //Captura mes
   System.out.print("Introduzca mes: ");
   mes=teclado.nextInt();
   //Captura año
   System.out.print("Introduzca año: ");
   año=teclado.nextInt();
   //Verificamos variables
   if (dia >= 1 && dia <=30)
   if (mes >= 1 && mes <= 12)
    if (año != 0)
     System.out.println ("Fecha correcta");
     else
     System.out.println ("Año incorrecto");
     else
     System.out.println("Mes incorrecto");
     else
     System.out.println("Día incorrecto");
     }
     } 
        
    

