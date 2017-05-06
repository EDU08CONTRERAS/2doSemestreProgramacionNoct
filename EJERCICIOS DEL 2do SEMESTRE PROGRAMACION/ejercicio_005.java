import java.util.Scanner;
public class ejercicio_005
{
   public static void main (String[] args)
   {
     Scanner entrada = new Scanner(System.in);
     int TAM=0;
     System.out.println(" ingrese el tamaño del arreglo" );
     TAM=entrada.nextInt();
     double numero[]= new double[TAM];
     double numero2[]= new double [numero.length];
     for(int i=0; i<numero.length; i++)
     {
         System.out.println(" ingrese el numero" );
         numero[i] = entrada.nextDouble();
        
     }
     numero2 = invertido(numero);
     for(int i=0; i<numero2.length; i++)
     {
         System.out.print(numero2[i] + "\t");
        
     }
   }
   public static double [] invertido(double salida[])
   {
        double  salida2[]= new double[salida.length];
        System.out.println("El numero invertido es:...." );
        for(int i = 0 ; i < salida.length ; i++)
        {
            salida2[i]=salida[salida.length -1-i];
        }    
        return salida2;        
   }
}

