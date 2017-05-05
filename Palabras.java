
/**
 * Write a description of class Palabras here.
 * 
 * @author JLI 
 * @version 001
 */

import java.util.Scanner;
public class Palabras
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String texto;
        
        System.out.print("Ingrese la cadena: ");
        texto = entrada.nextLine();
        
        System.out.println("El largo de la cadena es: " + texto.length());
        System.out.println(texto+ " en mayuscula es: "+ texto.toUpperCase());
        System.out.println(texto+ " en minuscula es: "+ texto.toLowerCase());
        System.out.println("Las 3 primeras letras son: " + texto.substring(0,3));
        
    } // fin metodo main
}
