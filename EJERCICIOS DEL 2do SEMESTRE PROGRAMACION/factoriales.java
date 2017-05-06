
import java.util.Scanner;
public class factoriales
{
    public static void main ( String [] args)
    {
       int  numero=1;
       int factorial=1;
        Scanner teclado = new Scanner (System.in);
         do{
            System.out.println("ingrese su numero ");
            numero = teclado.nextInt();
        }while(numero<0);
        while(numero>0)
        {
            factorial=factorial*numero;
            numero=numero-1;
        }
        System.out.println("los factoriales son ");
        System.out.println(+factorial );
    }
    
    
}
