import java.util.Scanner;
public class ejercicio_0010
{
  public static void main (String [] args){
      Scanner entrada = new Scanner (System.in);
      System.out.println("PROGRAMA QUE MUESTRA EL TRIANGULO DE PASCAL SEGUN LAS FILAS");
      System.out.print("INGRESE LA CANTIDAD DE FILAS : ");
      int filas = entrada.nextInt();
      int triang[][] = new int[filas+1][filas+1];
      triang = triangulo(filas);
      for (int i = 0 ; i < triang.length ; i++){
          for (int m = i ; m < filas ; m++){
              System.out.print("  ");
          }
          for (int j = 0 ; j <= i ; j++){
              System.out.print(triang[i][j] + "  ");
          }
          System.out.println();
      }
  }
  public static int [][]triangulo (int alt){
      int pascal[][] = new int[alt+1][alt+1];
      for (int i = 0 ; i < pascal.length ; i++){
          for (int j = 0 ; j <= i ; j++){
              if (j == 0 || i == j){
                  pascal[i][j] = 1;
              }else{
                  pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
              }
          }
      }
      return pascal;
  }
}


