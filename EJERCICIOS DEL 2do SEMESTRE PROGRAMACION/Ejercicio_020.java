

import java.util.Scanner;
public class Ejercicio_020
{ public static void main (String[]args)
      {
          Scanner teclado = new Scanner (System.in);
         
           int j,num,cont_pri;
 boolean primo;
 cont_pri=0;
 System.out.print("ingrese el  numero deseado : ");
 num=teclado.nextInt();
 
 for(int i=1;i<=num;i++){

  primo=true;
  j=2;
  while (j<=i-1 && primo==true)
  {
  if (i%j==0)
  primo=false;
  j++;
  }
  if (primo==true){
  cont_pri++; // si es primo incrementamos el contador de primos
  System.out.println(i+(" es primo"));
  }
  }
  System.out.println("En el rango 1.." + num + ", hay "+ cont_pri + " números primos");
    }
}