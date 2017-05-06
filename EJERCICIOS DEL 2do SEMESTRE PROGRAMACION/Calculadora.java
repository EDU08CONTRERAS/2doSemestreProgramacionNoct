import java.util.Scanner;
public class Calculadora
{
   public static void main (String []args)
   
   {
      Scanner teclado= new Scanner (System.in);
       double numero1=0;
       double numero2=0;
       double suma=0;
       double resta=0;
       double mult=0;
       double division=0;
       System.out.println("ingrese el primer numero ");
       numero1=teclado.nextDouble ();
       System.out.println("ingrese el segundo numero ");
       numero2=teclado.nextDouble ();
       suma=numero1+numero2;
       System.out.println("la suma de los dos numero es :" +suma);
       resta=numero1-numero2;
       System.out.println("la resta de los dos numero es :" +resta);
       mult=numero1*numero2;
       System.out.println("la multiplicacion de los dos numero es :" +mult);
       division=numero1/numero2;
       System.out.println("la division  de los dos numero es :" +division);
       
    }
}
