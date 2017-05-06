
import java.util.Scanner;
public class deber_03
{
    public static void main (String []args)
    {
      Scanner teclado = new Scanner (System.in);
      int tam=1;
      int factorial=1;
      
      System.out.println("Ingrese el tamaño que desea el arreglo  " );
      tam=teclado.nextInt ();
      int numero[] = new int[tam];
      
    for (int i=0;i < tam; i++) 
    {
         do{
            System.out.println("ingrese su numero ");
            numero[i] = teclado.nextInt();
        }while(numero[i]<0);
    }
    int numero1[]=new int [tam];
    for (int e=0;e < tam; e++) 
    {
         numero[e]=numero[i];
    }
    
    }
    }

    
