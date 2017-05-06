
import java.util.Scanner;
public class Ejercicio_016
{
   public static void main (String []argrs)
   {
       Scanner teclado = new Scanner (System.in);
         int cont=0;
         int numero=0;
         System.out.println("ingrese el numero de la lista que desee");
         numero=teclado.nextInt ();
         while (cont<numero)
         {
           cont++;
           System.out.println("Imprimir:"+cont);
        }
}
}