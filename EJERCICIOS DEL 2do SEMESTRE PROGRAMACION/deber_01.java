import java.util.Scanner;
public class deber_01
{
    public static void main (String []args)
    {
     Scanner entrada = new Scanner(System.in);
     int contp =0;
     int cont=0;
     double acumup=0;
     double mediap=0;
     int TAM=0;
     System.out.println("Ingrese el tamaño del arreglo  " );
     TAM = entrada.nextInt () ;
     double numero[] = new double[TAM];
     for (int i=0;i < TAM; i++) 
     {
       System.out.println("Ingrese un numero en la posición  "+i );
       numero[i] = entrada.nextInt(); 
       if( numero[i] > 0 )
       {
        cont=cont+1;
        if(numero[i]%2==0)
        {
         contp=contp+1;
         acumup=acumup+numero[i];
         mediap=acumup/contp;
        }       
       }
     System.out.println("los positivo ingresado son  "+cont );
     System.out.println("los positivo pares ingresado son  "+contp );
     System.out.println("la media de los numeros pares  positivos son "+mediap);
    }
    
    }
}