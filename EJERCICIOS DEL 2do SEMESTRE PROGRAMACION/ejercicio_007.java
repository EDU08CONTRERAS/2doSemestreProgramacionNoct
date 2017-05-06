import java.util.Scanner;
public class ejercicio_007
{
 public static void main( String[]args)
 {
     Scanner entrada= new Scanner(System.in);
     int fila =0;
     int col=0;
     int fila1 =0;
     int col1=0;
     System.out.println( "las dos matrices que van a ingresar  deben ser  cuadradas de tipo entero");
     System.out.println( "Ingrese el tamaño de Matriz #1 en filas ");
     fila = entrada.nextInt();
     System.out.println( "Ingrese el tamaño de Matriz #2 en columnas");
     col = entrada.nextInt();
     int Matriz[][]=new int [fila][col];
     System.out.println( "Ingrese el tamaño de Matriz #2 en filas");
     fila1 = entrada.nextInt();
     System.out.println( "Ingrese el tamaño de Matriz #2 en columnas");
     col1 = entrada.nextInt();
     int Matriz1[][]=new int [fila1][col1];
     System.out.println( "Ingrese la Matriz #1");
     for(int e=0;e<Matriz.length;e++)
     {
         for(int m=0;m<Matriz.length;m++)
         {
            System.out.print("Ingrese en la posicion ["+ e + "][" + m + "] : ");
            Matriz [e][m]=entrada.nextInt();
         }
     }       
     System.out.println( "Ingrese la matriz 2");  
     for(int e=0;e<Matriz1.length;e++)     
     {
         for(int m=0;m<Matriz1.length;m++)
         {
            System.out.print("Ingrese en la posicion ["+ e + "][" + m + "] : ");
            Matriz1[e][m]=entrada.nextInt();
         }
     }
     System.out.println( "MATRIZ 1");
     for (int e = 0 ; e < Matriz.length ; e++)
     {
          for (int m = 0 ; m < Matriz.length ; m++)
          {
            System.out.print( Matriz[e][m] + "\t");
          }
          System.out.println( "\t\t");
     }
     System.out.println();
     System.out.println( "MATRIZ 2");
     for (int e = 0 ; e < Matriz1.length ; e++)
     {
          for (int m = 0 ; m < Matriz1.length ; m++)
          {
            System.out.print( Matriz1[e][m] + "\t");
          }
          System.out.println( "\t\t");
     }
     System.out.println();
     System.out.print("Las Matrices "+matrizIguales(Matriz,Matriz1));
    }
 
 public static String matrizIguales(int Matriz[][],int Matriz1[][])
 {
     String palabra;
     int contamatriz=0;
     for(int e=0;e<Matriz.length;e++)
     {
       for (int m=0;m<Matriz1.length;m++)
       {
         if(Matriz[e][m]==Matriz1[e][m])
         {
                 {contamatriz++;}
         }
       }   
     }
     if (contamatriz==4)
     {
        palabra = "SON IGUALES";
     }
     else
     {
        palabra = "NO SON IGUALES";
     }
     return palabra;
 }     
}

