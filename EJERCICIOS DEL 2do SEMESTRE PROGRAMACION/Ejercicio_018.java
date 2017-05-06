
import java.util.Scanner;
public class Ejercicio_018
{
    public static void main (String[]args)
    {
        Scanner teclado = new Scanner (System.in);
        double sueldo=0;
        int cont=0 ;
        int conts=0;
        System.out.println("ingrese 10 sueldo");
      do
       {
        System.out.println("ingrese sueldo");
        sueldo=teclado.nextDouble ();
        if(sueldo >1000)
        {
            conts=conts+1;
        }
        cont=cont+1;
        }while(cont<10);
        cont=cont+1;
        System.out.println("los sueldos mayores a $1000.00 son " +conts);
        
    }
    
   
}
