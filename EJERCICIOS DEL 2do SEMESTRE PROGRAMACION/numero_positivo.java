
import java.util.Scanner;
public class numero_positivo
{
    public static void main (String []args)
    {
        int numero=0;
        Scanner teclado = new Scanner (System.in);
        System.out.println("escriba el numero");
        numero= teclado.nextInt();
        if(numero>0)
        {
            System.out.println("el numero ingresado es positivo"+numero);
            
        }
        if(numero<0)
        {
            System.out.println("el numero ingresado es negativo"+numero);
        }
        
        
    }
}
