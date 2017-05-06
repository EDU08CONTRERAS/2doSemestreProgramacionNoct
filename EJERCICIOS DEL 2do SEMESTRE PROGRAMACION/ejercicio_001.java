
import java.util.Scanner;
public class ejercicio_001
{
  public static void main (String[] args){
      Scanner entrada = new Scanner (System.in);
      int TAM=0;
      System.out.println("ingrese el tamaño del arreglo");
      TAM =entrada.nextInt();
      double numero[] = new double[TAM];
      System.out.println("PROGRAMA CON METODO PARA MOSTRAR LA MEDIA DE LOS NUMEROS POSITIVOS");
      System.out.println("INGRESE NUMEROS");
      for (int i = 0 ; i < numero.length ; i++){
          System.out.print((i+1) + "-->");
          numero[i] = entrada.nextDouble();
      }
      System.out.println("LA MEDIA DE LOS NUMEROS POSITIVOS EN LAS CASILLAS PARES ES :" + mediaPosiPares(numero));
  }
  public static double mediaPosiPares (double real[]){
      double guardaPosi = 0;
      int contaPosi = 0;
      for (int i = 1 ; i < real.length ; i += 2){
          if (real[i] > 0){
              guardaPosi += real[i];
              contaPosi++;
          }
      }
      double mediaPosi = (double) guardaPosi/contaPosi;
      return mediaPosi;
  }
}


