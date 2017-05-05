
/**
 * Write a description of class IngresoDosNumeros here.
 * 
 * @author JLI 
 * @version 001
 * 
 * Programa que solicita el ingreso de 2 numeros por teclado y los muestra por pantalla
 */
import java.util.Scanner;
public class IngresoDosNumeros
{
    public static void main (String[] args)
    {
        //declaracion de variables
        int numero1, numero2;
        Scanner sc = new Scanner(System.in);
        
        //pedir el ingreso del primer numero
        System.out.print("Digite un número: ");
        numero1 = sc.nextInt(); //lee un entero por teclado
        
        //pedir el ingreso del segundo numero
        System.out.print("Digite otro número: ");
        numero2 = sc.nextInt(); //lee un entero por teclado  
        
        //mostrar resultado
        System.out.println("Usted ha introducido los números: " + numero1 + " y " + numero2);
        
    }//fin clase main

}//fin clase IngresoDosNumeros
