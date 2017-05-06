import java.util.Scanner;
public class Ejercicio_02
{
 public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        int num;
        int cifra=0;
        do
        {
            System.out.println("Ingrese un número entre 0 y 9.999.");
            num=intro.nextInt();
            cifra=0;
        
        if(num>=0)
        {
            cifra++;
        }
        if(num>=10)
        {
            cifra++;
        }
        if(num>=100)
        {
            cifra++;
        }
        if(num>=1000)
        {
            cifra++;
        }
        if(cifra>=2)
        {
            System.out.println("tiene: "+cifra+" cifras.");
        }else
        {
            System.out.println("tiene: "+cifra+" cifra");
        }
            System.out.println("------------------------");
        }while(num>=0&&num<=9999);
        
        
        System.out.println("Ingreso un número fuera del rango.");
        System.out.println("Compile nuevamente e ingrese un número dentro del rango 0 y 9.999.");
}
  }