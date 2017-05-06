
import java.util.Scanner;
public class Ejercicio_015
{
    public static void main (String []args)
    {
       Scanner teclado =new Scanner (System.in);
        int numero;
        int acumulador=0;
        do
        {
            System.out.println("ingrese   un numero (tiene que digitar 0 para salir )");
            numero=teclado.nextInt ();
            acumulador=acumulador+numero;
            

    }while(numero != 0);
   System.out.println("la suma de todos los números introducidos es :" +acumulador );
}
}