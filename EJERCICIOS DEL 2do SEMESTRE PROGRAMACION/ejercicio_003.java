
import java.util.Scanner;
public class ejercicio_003
{
  public static void main (String []args)
  {
      Scanner entrada = new Scanner (System.in);
      int TAM=0;
      System.out.println("ingrese el tamaño del arreglo");
      TAM =entrada.nextInt();
      int vector[] = new int[TAM];
      System.out.println("Ingrese los números  :");
      for (int i = 0 ; i < vector.length ; i++)
      {
        vector[i] = entrada.nextInt();
      }
      int factorial[] = new int[vector.length];
      factorial = devuelveFactorial(vector);
      System.out.println("Los factoriales son :");
      for (int i = 0 ; i < factorial.length ; i++)
      {
        System.out.println(+vector[i]+"=======>"+factorial[i]);
      }
  }
  public static int[] devuelveFactorial (int arreglo[])
  {
      int array[] = new int[arreglo.length];
      for (int i = 0 ; i < array.length ; i++)
      {
          if (arreglo[i] == 0 || arreglo[i] == 1)
          {
            array[i] = 1;
          }
          else
          {
            array[i] = arreglo[i];
            for (int e = 1 ; e < arreglo[i] ; e++)
            {
              array[i] *= e;
            }
          }
      }
      return array;
  }
}



