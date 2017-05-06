

import java.util.Scanner;
public class sumatoriaArreglosUnidimensionales2
{
    public static void main (String []args )
    {
        Scanner entrada = new Scanner(System.in);
        int tamañoArreglo=0;
        System.out.println("ingrese el tamaño del arreglo que desee ");
        tamañoArreglo=entrada.nextInt ();
        int suma = 0;
        
        int k[] = new int[tamañoArreglo];
        for (int i=0;i < tamañoArreglo; i++) 
        {
          System.out.println("Ingrese el valor delarreglo en la posición " + i);
          k[i] = entrada.nextInt();
          suma = suma + k[i];
        }
        System.out.println("posicion\tnumero");
        for (int i=0;i < tamañoArreglo; i++) 
        {
           
           System.out.println(i+"\t"+"\t"+k[i]);
        }
        System.out.println("La sumatoria es: " + suma);
}
}