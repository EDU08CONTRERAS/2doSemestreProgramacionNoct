
import java.util.Scanner;
public class Ejercicio_04
{
   public static void main (String[] args)
   {
       Scanner ingreso = new Scanner (System.in);
       System.out.println("\t\tPROGRAMA QUE PRESENTA FECHA QUE CONTINUA\nIngrese fecha en numeros:\n");
       System.out.print("Dia :\t");
       int dia = ingreso.nextInt();
       System.out.print("Mes :\t");
       int mes = ingreso.nextInt();
       System.out.print("AÃ±o :\t");
       int año = ingreso.nextInt();
       System.out.println("\nSu fecha ingresada es:\t" + dia + " / " + mes + " / " + año + "\n");
       if ((dia <= 31 && mes == 1) || (dia <= 28 && mes == 2) || (dia <= 31 && mes == 3) || (dia <= 30 && mes == 4) 
       || (dia <= 31 && mes == 5) || (dia <= 30 && mes == 6)
            || (dia <= 31 && mes == 7) || (dia <= 31 && mes == 8) || (dia <= 30 && mes == 9) || (dia <= 31 && mes == 10)
            || (dia <= 30 && mes == 11) || (dia <= 31 && mes == 12)){
                switch (dia)
                {
                    case 31: 
                    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10)
                    {
                                    dia = 1;
                                    mes++;
                                    break;
                                  }
                              else{
                                  dia = 1;
                                  mes = 1;
                                  año++;
                                  break;
                                }
                    case 30: if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
                                    dia = 1;
                                    mes++;
                                    break;
                                  }
                   case 28:  if (mes == 2){
                                     dia = 1;
                                     mes++;
                                     break;
                                    }
                    default:
                            dia++;
                            break;
                }
                System.out.print("La fecha siguiente es:\t" + dia + " / " + mes + " / " + año);
        }
        else{
            System.out.print("FECHA INGRESADA INCORRECTA");
        }
    }
}
