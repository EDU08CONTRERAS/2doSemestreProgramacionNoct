import java.util.Scanner;
public class ejercicio_004
{
    public static void main(String args []){
       int TAM =0;
       Scanner teclado =new Scanner (System.in);
       System.out.println("ingrese el tamaño del array");
       TAM=teclado.nextInt();
       int num[] = new int[TAM];
       num = fibonaci(num);
       for(int M=0; M<num.length;M++)
       {
        System.out.println(num[M]);
       }
     }
    public static int [] fibonaci (int valor [] )
    {
       int valor1[] = new int [valor.length];
       for(int e=0; e<valor1.length;e++)
       {
            if(e==0){
              valor1[e]=0;
            } 
            else if (e==1)
            {
              valor1[e]=1;
            }
            else
            {
              valor1[e]=valor1[e-2]+valor1[e-1];
            }
        }
       return valor1;
    }
}
