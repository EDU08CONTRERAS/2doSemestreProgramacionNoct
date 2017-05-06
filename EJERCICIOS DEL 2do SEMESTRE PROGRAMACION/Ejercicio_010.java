import java.util.Scanner;
public class Ejercicio_010
{
    public static void main (String []args)
    {
        int contador=0;
        String cadena;
        Scanner teclado = new Scanner (System.in);
        
        
        System.out.println("ingrese una frase");
        cadena=teclado.nextLine ();
        
           for(int x=0;x<cadena.length();x++)   
              {
                  if ((cadena.charAt(x)=='a') || (cadena.charAt(x)=='e') || (cadena.charAt(x)=='i') || (cadena.charAt(x)=='o') || (cadena.charAt(x)=='u'))
                  {
                      contador++;
           }
         }
       
        System.out.println("La palabra " + cadena + "contiene " + contador + " vocales");
    
    }
    
}
