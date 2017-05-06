
import java.util.Scanner;
public class Ejercicio_06
{
    public static void main (String [] args)
    { 
        int numero=0;
        Scanner teclado = new  Scanner (System.in);
        System.out.println(" ingese su numero ");
        numero=teclado.nextInt();
        if (numero%2==0)
        {
            System.out.println("es un numero par");
        }
        else
        {
            System.out.println("es un numero impar");
            
        }
    }
}
