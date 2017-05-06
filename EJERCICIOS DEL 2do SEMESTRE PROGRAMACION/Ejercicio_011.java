
import java.util.Scanner;
public class Ejercicio_011
{
    public static void main (String [] args )
    {
        Scanner teclado= new Scanner (System.in);
        String dia ;
        System.out.println("ingrse un dia de la semana para saber si es laboral o no ");
        dia=teclado.nextLine ();
        
        switch (dia)
        {
            case "lunes" :
            System.out.println("dia laboral  ");
            break;
            case "martes" :
            System.out.println("dia laboral  ");
            break;
            case "miercoles" :
            System.out.println("dia laboral  ");
            break;
            case "jueves" :
            System.out.println("dia laboral  ");
            break;
            case "viernes" :
            System.out.println("dia laboral  ");
            break;
            case "sabado" :
            System.out.println("dia fin de semana   ");
            break;
            case "domingo " :
            System.out.println("dia fin de semana   ");
            break;
            default:
                System.out.print("Ingrese un dia valido valido o ingrese todo con minuscula ");
                break;
        }
    }
}
