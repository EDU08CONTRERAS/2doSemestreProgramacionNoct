import java.util.Scanner;
public class Ejercicio_014
{
    public static void main (String []args)
    {
       Scanner teclado = new Scanner (System.in);
        int numero=0;
        int contador=0;
        
       do{ 
          System.out.println("ingrese los numero que desea (para poder salir debe ingresar un numero negativo )");
           numero=teclado.nextInt ();
           contador++; 
            } while(numero>=0); 
       System.out.println("los numeros ingresados son "+contador); 
} 
} 
        
   
