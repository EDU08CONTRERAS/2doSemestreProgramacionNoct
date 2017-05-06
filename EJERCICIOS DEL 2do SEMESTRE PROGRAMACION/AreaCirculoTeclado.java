
import java.util.Scanner;
    public class AreaCirculoTeclado
{
    public static void main (String[] args)
    {
        //Crea un objeto para leer los datos
        Scanner entrada = new Scanner(System.in);   //variable de tipo referencia
        // declaracion de variables
        double radio;
        double area;
        //mensaje al usuario
        System.out.println ("Calcular el area del circulo ");
        
        
        //entrada
        System.out.print ("Introduce el radio: ");
        radio = entrada.nextDouble();
        // calcular el area de circulo
        
        area = 3.14159 * radio * radio;
        
        // imprime resultado
        System.out.println ( + area);
        
    } // fin de metodo main
}


