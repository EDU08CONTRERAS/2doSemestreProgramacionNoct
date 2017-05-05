
/**
 * Write a description of class recorrerCadenaCaracteres here.
 * 
 * @author JLI 
 * @version 001
 * Esta clase saca el tamaño de una cadena de caracteres, la recorre y la imprime de manera vertical
 */
public class recorrerCadenaCaracteres
{
    public static void main (String[] args)
    {
        String cadena1 = "Este es un ejemplo de cadenas de caracteres ";
        String cadena2 = "se usarán algunos métodos de la clase String";
        String cadena3 = "";
        
        /**
         * Se va a utilizar el operador "+" para concatenar cadenas de caracteres
         * se va a concatenar elcontenido de cadena1 y el contenido de cadena2 
         * y se la va almacenar en la variable cadena3
         */
        
        cadena3 = cadena1 + cadena2; //concatenamos cadena1 y cadena2
        
        /**
         * Para encontrar el tamaño de la cadena utilizo el método length() de la clase String
         * length() devuelve un número entero
         */
        System.out.print ("El contenido de la variable cadena1 es: "+ cadena1 + "\n");
        System.out.print ("El tamaño total de la variable cadena1 es: "+ cadena1.length()+ " caracteres\n");

        System.out.print ("\nEl contenido de la variable cadena2 es: "+ cadena2 + "\n");
        System.out.print ("El tamaño total de la variable cadena2 es: "+ cadena2.length()+ " caracteres\n");

        System.out.print ("El contenido de la variable cadena3 es: "+ cadena3 + "\n");
        System.out.print ("El tamaño total de la variable cadena3 es: "+ cadena3.length()+ " caracteres\n");
        
        /**for ( int i = 0 ; i < 25 ; i++ )
        {
            System.out.println();
        }**/
        
        for (int i = 0; i < cadena1.length(); i++)     
        {
            System.out.println (cadena1.charAt(i));
        }
        
        for (int i = 0; i < cadena2.length(); i++)     
        {
            System.out.println (cadena2.charAt(i));
        }
        
        for (int i = 0; i < cadena3.length(); i++)     
        {
            System.out.println (cadena3.charAt(i));
        }
    } // fin metodo main

}// fin clase recorrerCadenaCaracteres
