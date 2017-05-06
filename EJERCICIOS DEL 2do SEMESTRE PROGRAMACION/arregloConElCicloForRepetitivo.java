
import java.util.Scanner;
public class arregloConElCicloForRepetitivo
{
    public static void main (String [] args )
    {
        Scanner entrada = new Scanner(System.in);
        
        int k[] = new int[5];
        for (int i=0;i < 5; i++) 
        {
         System.out.println("Ingrese el valor del arreglo en la posición "+i );
          
         k[i] = entrada.nextInt();
        }
        for (int i=0;i < 5; i++) 
        {
         System.out.println("posicion  numero");
         System.out.println(i+  "\t"  +k[i]);
        }
    }
}