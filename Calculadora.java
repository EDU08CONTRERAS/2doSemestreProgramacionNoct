

import java.util.Scanner;
public class Calculadora
{
    public static void main (String args[])
    {
        Scanner entrada = new Scanner(System.in);
        double numero1,numero2;
        
        System.out.print("Digite el primer número: ");
        numero1 = entrada.nextDouble();
        
        System.out.print("Digite el segundo número: ");
        numero2 = entrada.nextDouble();
        
        System.out.println("Los numeros digitados son: "+ numero1 + " y " + numero2);
        
        /* calculo la suma de los 2 numeros ingresados */
        System.out.println( numero1 + " + " + numero2 + " = " + (numero1+numero2));
        
        /* calculo la resta de los 2 numeros ingresados */
        System.out.println( numero1 + " - " + numero2 + " = " + (numero1-numero2));
        
        /* calculo el producto de los 2 numeros ingresados */
        System.out.println( numero1 + " * " + numero2 + " = " + numero1*numero2);
    } //fin clase main

    
} // fin clase Calculadora
