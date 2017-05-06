import java.util.Scanner;
public class ejercicio_008
{
     public static void main (String args[]){
         Scanner entrada= new Scanner (System.in);
         double matriz[][]= new double [3][3];
         double matriz2[][] = new double [3][3];
         System.out.println("  INGRESE UN NUMERO");
         for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.println("POSICION" + "["+i+"]"+"["+j+"]");
                matriz[i][j]= entrada.nextDouble();
            }
         }
          for(int i=0;i<3;i++){
              for (int j=0;j<3;j++){
                System.out.print(matriz[i][j] + "\t");
               
              }
               System.out.println();
         }
         matriz2 = matrizInvertidaMetodo(matriz);
         System.out.println ("  LA MATRIZ INVERTIDA ES:");
          for(int i=0;i<3;i++){
              for (int j=0;j<3;j++){
                    System.out.print(matriz2[i][j] + "\t");
               
              }
               System.out.println();
        }
    }
        public static double [][]matrizInvertidaMetodo(double matriz3[][]){
             double matriz1[][]=new double[3][3];
             for(int j=0;j<3;j++){
                 for (int i=0;i<3;i++){
                     if (i==0)
                         matriz1 [j][i]= matriz3[j][2];
                    else if (i==2)
                    matriz1[j][i]= matriz3[j][0];
                    else
                        matriz1[j][i] = matriz3[j][i];
            
         }
        }
         return matriz1;
    }
}


