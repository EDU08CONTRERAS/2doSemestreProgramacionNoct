
/**
 * Write a description of class MenuCadena here.
 * 
 * @author JLI
 * @version 001
 * Programa que da un menu de opciones
 */
public class MenuCadena
{
    public static void main(String[] args) throws java.io.IOException // se controla una excepcion
    {
        char opcion;
        int  lineas = 25;
        String cadena = "Este es un ejemplo de cadena de caracteres favor revisarlos";
         System.out.println("Este es un ejemplo de cadena de caracteres favor revisarlos");
        do 
        {
            System.out.print("\n\n\t\t\t\tMenu  de uso del metodos clase String\n\n\n");
            System.out.print("\t\t\t\t   [1] Longitud de cadena\n");
            System.out.print("\t\t\t\t   [2] Cadena en mayuscula\n");
            System.out.print("\t\t\t\t   [3] Cadena en minuscula\n");
            System.out.print("\t\t\t\t   [4] Cadena sin espacios en blanco\n");
            System.out.print("\t\t\t\t   [5] Retornar un caracter en una posicion determinada\n");
            System.out.print("\t\t\t\t   [6] Extaer una subcadena desde una posicion determinada\n");
            System.out.print("\t\t\t\t   [7] Salir\n");
            System.out.print("\n\n");
            System.out.print("\t\tIngrese solo  una opcion  del [1] al [7]:");
        
            opcion = (char)System.in.read();
            //System.out.println("\nopcion es: " + opcion);            
            switch(opcion)
            {
                case '1':   //Longitud de cadena
                        System.out.println("\nLa longitud total de cadena es: " + cadena.length());
                        break;
                case '2':   //cadena en mayusculas
                        System.out.println("\nLa cadena en mayÃºscula es: " + cadena.toUpperCase());
                        break;
                case '3':   //cadena en minusculas
                        System.out.println("\nLa cadenna en mayÃºscula es: " + cadena.toLowerCase());
                        break;
                case '4':   //cadena sin espacios en blanco
                        System.out.println("\nLa cadena sin espacios es: " + cadena.trim());
                        break;
                case '5': //Retornar un caracgrr en un espacio determinado
                        System.out.println("\nEl caracter a retornar es : " + cadena.trim());
                        break;
                case '6':
                        break;
                case '7':
                        System.out.println("Gracias!!!\n\n");
                        break;
                default:
                        for (int i = 0; i < lineas; i++) // LIMPIA LA PANTALLA
                        { 
                            System.out.println();
                        }
                        System.out.println("\n\n\n\n\n\t\t\t\tError, sÃ³lo digite una opciÃ³n entre [1 - 7]");
                        break;
            } // fin switch
            
        } while (opcion != '1' && opcion != '2' && opcion != '3' && opcion != '4' && 
                 opcion != '5' && opcion != '6' && opcion != '7');
        
        //System.out.println("\nopcion es: " + opcion);
    }// fin metodo main()

}// fin clase












