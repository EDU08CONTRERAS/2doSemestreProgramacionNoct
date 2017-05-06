
import java.util.Scanner;
public class sumatoriaArreglosUnidimensionales
{
    public static void main (String []args )
    {
        final int TAM = 5;
        int suma = 0;
        Scanner entrada = new Scanner(System.in);
        int k[] = new int[TAM];
        for (int i=0;i < TAM; i++) 
        {
          System.out.println("Ingrese el valor delarreglo en la posición " + i);
          k[i] = entrada.nextInt();
          suma = suma + k[i];
        }
        System.out.println("posicion\tnumero");
        for (int i=0;i < TAM; i++) 
        {
           
           System.out.println(i+"\t"+"\t"+k[i]);
        }
        System.out.println("La sumatoria es: " + suma);
}
}