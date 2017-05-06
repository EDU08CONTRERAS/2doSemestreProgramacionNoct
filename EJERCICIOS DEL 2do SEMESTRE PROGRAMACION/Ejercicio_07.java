
import java.util.Scanner;
public class Ejercicio_07
{
   public static void main (String [] args )
   {
       Scanner teclado= new Scanner (System.in);
       int hora;
      System.out.println("Introduzca una hora (un valor entero): ");
      hora = teclado.nextInt();
      if (hora >= 0 && hora < 12)
          System.out.println("Buenos días");
      else if (hora >= 12 && hora < 21)
           System.out.println("Buenas tardes");
      else if (hora >= 21 && hora < 24)
            System.out.println("Buenas noches");
      else
            System.out.println("Hora no válida");
}
}