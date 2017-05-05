
/**
 * Write a description of class AreaCirculoTeclado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */ 
import java.util.Scanner;   // para leer desde el tecaldo
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
        System.out.println ("Calcula el área  de un círculo.");
        System.out.println ("--------------------------------");
        
        //entrada
        System.out.print ("Introduce el radio: ");
        radio = entrada.nextDouble();
        // calcular el area de circulo
        
        area = 3.14159 * radio * radio;
        
        // imprime resultado
        System.out.println ("El área del circulo es:  " + area);
        
    } // fin de metodo main
}
