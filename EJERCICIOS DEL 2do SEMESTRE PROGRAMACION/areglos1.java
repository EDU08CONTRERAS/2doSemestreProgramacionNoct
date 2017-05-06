
import java.util.Scanner;
public class areglos1
{
    public static void main (String []args)
    {
     Scanner entrada = new Scanner(System.in);
     final int e = 10;
      int numero[] = new int[e];
      int contp =0;
      int contn=0;
      int cont=0;
     for (int i=0;i < e; i++) 
     {
       System.out.println("Ingrese un numero  " );
          numero[i] = entrada.nextInt();
          if( numero[i] < 0 )
          {
              contn=contn+1;
          }
          
            if( numero[i] > 0 )
          {
              contp=contp+1;
          }
          
          if( numero[i] == 0 )
          {
              cont++;
          }
            
     }
     System.out.println("los positivo ingresado son  "+contp );
     System.out.println("los negativos ingresados son  " +contn);
     System.out.println("los numero 0 ingresado son "+cont );
     
}


}