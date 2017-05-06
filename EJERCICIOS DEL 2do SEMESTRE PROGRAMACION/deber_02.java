
import java.util.Scanner;
public class deber_02
{
    public static void main (String []args)
    {
     Scanner entrada = new Scanner(System.in);
      int contp =0;
      int contn=0;
      int cont=0;
      int tam=0;
      System.out.println("Ingrese el tamaño que desea el arreglo  " );
      tam=entrada.nextInt ();
      int numero[] = new int[tam];
     for (int i=0;i < tam; i++) 
     {
       System.out.println("Ingrese un numero en la posición "+i);
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