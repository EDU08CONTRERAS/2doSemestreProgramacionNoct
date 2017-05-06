
import java.util.Scanner;
public class Ejercicio_09
{
   public static void mail (String []args)
   {
       Scanner teclado = new Scanner (System.in);
       int numero1 =0;
       int numero2=0;
       String signo ;
       
       System.out.println("ingrese el signo de la operacion que desea realizar ");
       System.out.println ("+ : sumará los dos operandos");
       System.out.println ("- : restará los dos operandos");
       System.out.println ("* : multiplicará los dos operandos");
       System.out.println ("/ : dividirá los dos operandos");
       System.out.println (" %: calculará el módulo entre el operando 1 y el operando 2");
       signo=teclado.nextLine();
       
       switch (signo)
       {
       case  "+" :
       System.out.println("ingrese un numero entero ");
       numero1=teclado.nextInt ();
       System.out.println("ingrese un numero entero ");
       numero2=teclado.nextInt ();
       System.out.println("la suma es " +(numero1+numero2) );
       break;
       
       case  "-" :
       System.out.println("ingrese un numero entero ");
       numero1=teclado.nextInt ();
       System.out.println("ingrese un numero entero ");
       numero2=teclado.nextInt ();
       System.out.println("la resta  es " +(numero1-numero2) );
       break;
       
       case  "*" :
       System.out.println("ingrese un numero entero ");
       numero1=teclado.nextInt ();
       System.out.println("ingrese un numero entero ");
       numero2=teclado.nextInt ();
       System.out.println("la multiplicacion   es " +(numero1*numero2) );
       break;
       case "/":
       System.out.println("ingrese un numero entero ");
       numero1=teclado.nextInt ();
       System.out.println("ingrese un numero entero ");
       numero2=teclado.nextInt ();
       System.out.println("la division   es " +(numero1/numero2) );
       break;
       case "%":
       System.out.println("ingrese un numero entero ");
       numero1=teclado.nextInt ();
       System.out.println("ingrese un numero entero ");
       numero2=teclado.nextInt ();
       System.out.println("la  el residuo de la division   es " +(numero1%numero2) );
  
       break;
       default:
                System.out.print("Ingrese un operador  valido");
                break;
            


    }
    }
}
