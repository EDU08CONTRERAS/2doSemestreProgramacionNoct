
public class PromedioEstudiante {
public static void main(String[] args) 
 {
   int exa1 = 97, exa2 = 88, exa3 = 93;
   double promedio;
   int promedioRedondeado;
   promedio = (double) (exa1 + exa2 + exa3) / 3;
   promedioRedondeado = (int) Math.round(promedio);
   System.out.println("l promedio es: " + promedio);
   System.out.println("El promedio redondeado es: "+promedioRedondeado);
   }
}