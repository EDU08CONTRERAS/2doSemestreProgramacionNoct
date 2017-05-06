
import java.util.Scanner;
public class Ejercicio_013{
    public static void main (String [] args){
    Scanner teclado= new Scanner (System.in);
    int altura=0;
    System.out.println("ingrese la altura del escalera ");
    altura= teclado.nextInt ();
    for (int i=1;i<=altura;i++)
 { 
  for(int j=1;j<i+1;j++)
  { 
  System.out.print("*");
  }
  System.out.println("\n");
 }
}
}
