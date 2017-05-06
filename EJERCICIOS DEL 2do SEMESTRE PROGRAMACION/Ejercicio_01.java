
import java.util.Scanner;
public class Ejercicio_01
{
    public static void mail (String [] args)
    {
        int numero_1=0;
        int numero_2=0;
        int numero_3=0;
        Scanner teclado = new Scanner (System.in);
        System.out.println("ingrese el numero 1");
        numero_1=teclado.nextInt ();

        System.out.println("ingrese el numero 2");
        numero_2=teclado.nextInt ();
        System.out.println("ingrese numero 3");
        numero_3=teclado.nextInt ();
        
        
        if(numero_1>numero_2&&numero_2>numero_3)
        {
          System.out.println(numero_1+"-"+numero_2+"-"+numero_3);
        }
     if(numero_2>numero_3&&numero_3>numero_1)
     {
         System.out.println(numero_2+"-"+numero_3+"-"+numero_1);
        }
     if(numero_3>numero_1&&numero_1>numero_2)
     {
         System.out.println(numero_3+"-"+numero_1+"-"+numero_2);
        }
     if(numero_1>numero_3&&numero_3>numero_2)
     {
         System.out.println(numero_1+"-"+numero_3+"-"+numero_2);
        }
     if(numero_2>numero_1&&numero_1>numero_3)
     {
         System.out.println(numero_2+"-"+numero_1+"-"+numero_3);
        }
     if(numero_3>numero_2&&numero_2>numero_1)
     {
         System.out.println(numero_3+"-"+numero_2+"-"+numero_1);
        }
        }
    }
