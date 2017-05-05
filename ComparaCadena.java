
/**
 * Write a description of class ComparaCadena here.
 * 
 * @author JLI 
 * @version 001
 */

import java.util.Scanner;
public class ComparaCadena
{
    public static void main(String[] args)
    {
        String texto1, texto2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la primera cadena: ");
        texto1 = entrada.nextLine();
        System.out.println("Ingrese la segunda cadena: ");
        texto2 = entrada.nextLine();
        
        if (texto1.equals(texto2) == true)
        {
            System.out.println(texto1 + " es igual a " + texto2);
        }
        else
        {
            System.out.println(texto1 + " no es igual a " + texto2);
        }
        
        if (texto1.compareTo(texto2) > 0)
        {
            System.out.println(texto1 + " es mayor alfabeticamente ");
        }
        else
        {
            System.out.println(texto2 + " es mayor alfabeticamente ");
        }
    }
} //ComparaCadena
