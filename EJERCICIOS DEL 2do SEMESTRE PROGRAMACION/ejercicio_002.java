import java.util.Scanner;
public class ejercicio_002
{
   public static void main(String args[]){
       Scanner entrada=new Scanner(System.in);
       int TAM=0;
       int i=0;
       int posi=0,nega=0,cero=0;
       System.out.println("ingrese el tamaño del arreglo");
       TAM= entrada.nextInt();
       int[] arreglo= new int[TAM];
       for (i=0;i<arreglo.length;i++){ 
           System.out.println("ingrese el numero en la posicion"+" "+ i);
           arreglo[i]=entrada.nextInt();
          }
       System.out.println("los numeros + ingresados son:"+ cantidadPositivo(arreglo));
       System.out.println("los numeros - ingresados son:"+ cantidadNegativo(arreglo));
       System.out.println("los numeros 0 ingresados son:"+ cantidadCero(arreglo));         
    }
    
      public static int cantidadPositivo(int[]arregloPosi){
        int posi=0;
        for(int i=0;i<arregloPosi.length;i++){
             if (arregloPosi[i]>0)
             {
                 posi++;
             }
        }   
        return posi;
      }
      
      public static int cantidadNegativo(int[]arregloNega){
        int nega=0;
        for(int i=0;i<arregloNega.length;i++){
             if (arregloNega[i]<0){
                 nega++;
             }
        }
        return nega;
      }       
      
      public static int cantidadCero(int[]arregloCero){
        int cero=0;
        for(int i=0;i<arregloCero.length;i++){
             if (arregloCero[i]==0){
                 cero++;
                }
        }
        return cero;
      }    
}








