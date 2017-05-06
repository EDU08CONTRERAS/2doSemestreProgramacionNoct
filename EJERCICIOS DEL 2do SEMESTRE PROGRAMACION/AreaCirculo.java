public class AreaCirculo 
{
public static void main(String[] args) 
 {
   double radio, area, circunferencia;
    radio = 5;
    area = Math.PI * Math.pow(radio, 2);
    circunferencia = 2 * Math.PI * radio;
    System.out.println("El área del círculo es: " + area);
    System.out.println("La circunferencia es: " +circunferencia);
  }
}