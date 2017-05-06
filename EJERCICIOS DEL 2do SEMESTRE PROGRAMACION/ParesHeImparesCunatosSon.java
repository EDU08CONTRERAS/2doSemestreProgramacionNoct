import java.util.Scanner;
public class ParesHeImparesCunatosSon
{
    public static void main (String [] args)
    {
        int contadorpar=0;
        int contadorimpar=0;
        int numero=0;
        int i=0;
        int acumuladorpar=0;
        int acumuladorimpare=0;
        Scanner teclado = new Scanner (System.in);
        while(i<10)
        {
            System.out.println ("ingrese el numero");
            numero = teclado.nextInt();
            if(numero%2==0)
            {
                 acumuladorpar=acumuladorpar+numero;
                contadorpar++;
              
            }
            if(numero%2!=0)
            {
                acumuladorimpare=acumuladorimpare+numero;
                contadorimpar++;
                
            }
            i++;
            }
                System.out.println ("los total de pares ingresado son " +contadorpar);
                 System.out.println ("los total de impares ingresado son " +contadorimpar);
                  System.out.println ("los total de pares sumados son  " +acumuladorpar);
                   System.out.println ("los total de impare sumados  son " +acumuladorimpare); 
            }      
        }
        
     
        
        
    

