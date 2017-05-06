
import java.util.Scanner;
public class Ejercicio_019
{
    public static void main (String []args)
    {
        Scanner teclado = new Scanner (System.in);
        int edad =0;
        int altura=0;
        int cont=0;
        int contedad=0;
        int contedadm=0;
        int contaltura=0;
        int contalturam=0;
        System.out.println("ingrese las edades y las alturas de 5 alumnos");
        do
        {
            System.out.println("ingrese la edad del alumno");
            edad=teclado.nextInt();
            if( edad < 18)
            {
                contedadm=contedadm+1;
            }
            else
            {
               
                contedad=contedad+1;
            }
            System.out.println("ingrese la altura  del alumno (en numeor entero sin punto ni coma)");
            altura=teclado.nextInt();
            if(altura<175)
            {
                contalturam=contalturam+1;
            }
            else
            {
                
                contaltura=contaltura+1;
            }
            cont++;
        }while(cont<5);
        System.out.println("la cantidad de alumno  que  mide meno de 175 es " +contalturam );
        System.out.println("la cantidad de alumno que mide mas de 175  es " +contaltura );
        System.out.println("la cantidad de alumno de mayores de 18 es  "   +contedad);
        System.out.println("la cantidad de alumno de menores de edad es  "  +contedadm );
    }
    
}
