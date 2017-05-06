
import java.util.Scanner;
public class DIAS
{
    public static void main(String[] args) 
    {
        int dias=0;
        Scanner teclado = new Scanner (System.in);
        do{
            System.out.println ("ingrese un numero del 1 al 7 : ");
            dias = teclado.nextInt();
        }while(dias<1 || dias>7);
        
        
        switch (dias)
        {
            
            case 1:
            System.out.println ("el _" +dias+ "_representa a lune"   );
            break;
            
            case 2:
            System.out.println ("el _" +dias+ "_representa a marte"  );
            break;
            case 3:
            System.out.println ("el_" +dias+ "_representa a miercole"   );
            break;
            case 4:
            System.out.println ("el_" +dias+ "_representa a jueve"  );
            break;
            case 5:
            System.out.println ("el_" +dias+ "_representa a vierne");
            break;
            case 6:
            System.out.println ("el_" +dias+ "_representa a sabado"  );
            break;
            case 7:
            System.out.println ("el_" +dias+ "_representa a domingo  ");
            break;
        }
    }
}
