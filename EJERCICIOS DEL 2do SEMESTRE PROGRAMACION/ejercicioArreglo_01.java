

public class ejercicioArreglo_01
{
    public static void main (String[] args)
    {
          int notas[] = {0, 3, 4, 7, 3, 1}; 

           System.out.println("Distribución de calificaciones:");
          for  (int contador = 0; contador < notas.length; contador++) 
          {
              System.out.println("Calificación: "+contador+"\t");
    
              for (int estrella = 0; estrella<notas[contador];estrella++) 
              {
                 System.out.println("*");
              }
          }
    }
}
    