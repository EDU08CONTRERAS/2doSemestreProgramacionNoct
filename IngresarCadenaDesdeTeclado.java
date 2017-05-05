
/**
 * Write a description of class IngresarCadenaDesdeTeclado here.
 * 
 * @author JLI
 * @version 001
 * 
 * Clase que solicita al usuario el ingreso de una cadena de caracteres desde
 * el teclado
 */

import java.util.Scanner;
public class IngresarCadenaDesdeTeclado
{
    public static void main (String[] args)
    {
        // declaro una variable tipo String
        String variableCadena;
        // declaro una variable tipo Scanner
        Scanner ingreso = new Scanner(System.in);
                
        //ingreso de cadena
        System.out.print("Ingrese una cadena de caracteres: ");
        variableCadena = ingreso.nextLine();
        
        //mostrar por pantalla
        System.out.print("La cadena ingresada es: " + variableCadena);
        
    }// fin metodo main
} // fin de clase IngresarCadenaDesdeTeclado
