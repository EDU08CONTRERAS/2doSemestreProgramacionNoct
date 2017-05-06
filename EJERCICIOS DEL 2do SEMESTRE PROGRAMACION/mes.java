import java.util.Scanner;
public class mes
{
    public static void main (String []args)
    {
        Scanner teclado= new Scanner (System.in);
        int mes=0;
        do{
            System.out.println("ingese un numero del 1 a el 12 ");
            mes=teclado.nextInt();
            
        }while(mes <1 || mes>12);
        
        switch (mes)
        {
            case 1:
            System.out.println("el "+mes+"representa a enero  ");
            break;
            case 2:
            System.out.println("el "+mes+"representa a febrero  ");
            break;
            case 3:
            System.out.println("el "+mes+"representa a marzo  ");
            break;
            case 4:
            System.out.println("el "+mes+"representa a aabril ");
            break;
            case 5:
            System.out.println("el "+mes+"representa a mayo  ");
            break;
            case 6:
            System.out.println("el "+mes+"representa a junio  ");
            break;
            case 7:
            System.out.println("el "+mes+"representa a julio ");
            break;
            case 8:
            System.out.println("el "+mes+"representa a agosto  ");
            break;
            case 9:
            System.out.println("el "+mes+"representa a septiembre  ");
            break;
            case 10:
            System.out.println("el "+mes+"representa a octubre   ");
            break;
            case 11: 
            System.out.println("el "+mes+"representa a noviembre   ");
            break;
            case 12: 
            System.out.println("el "+mes+"representa a diciembre  ");
            break;
            
            
        }
        
        
        
     
    }
    
    
    }
