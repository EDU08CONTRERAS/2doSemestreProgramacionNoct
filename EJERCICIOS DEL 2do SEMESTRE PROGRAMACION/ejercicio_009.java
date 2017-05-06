import java.util.Scanner;
public class ejercicio_009
{
    public static void main (String[] args){
        Scanner lea = new Scanner (System.in);
        double a,b,c,x1,x2;
        System.out.println ("ECUACIÓN CUADRATICA DE LA FORMA AX^2+BX+C");
        System.out.println ("Ingrese El Coeficiente A");
        a = lea.nextDouble();
        System.out.println ("Ingrese El Coeficiente B");
        b = lea.nextDouble();
        System.out.println ("Ingrese El Coeficiente C");
        c = lea.nextDouble();
         if (devuelveDiscriminante(a,b,c) < 0){
             System.out.println ("La Ecuacion No Tiene Soluciones Reales");
         }

         if (devuelveDiscriminante(a,b,c) == 0) {
             System.out.println ("La ecuacion tiene solo una raiz real");
             x1 = ecuacionUnaRaiz(a,b);
             System.out.println ("La Solucion es, X1=X2 : " +x1);
         }
         
         if (devuelveDiscriminante(a,b,c) > 0) {
             System.out.println ("La ecuacion tiene dos raizes reales");
             x1 = ecuacionDosRaiz1(a,b,c);
             x2 = ecuacionDosRaiz2(a,b,c);
             System.out.println ("La Solucion es, X1 = " + x1 + " y, X2 = " + x2);
         }
    }
    public static double devuelveDiscriminante (double a1, double b1, double c1){
          double discriminante = ((b1*b1)-(4*(a1*c1)));
          return discriminante;
    }
    public static double ecuacionUnaRaiz(double a2, double b2){
          double ecuacion1 = -(b2)/(2*a2);
          return ecuacion1;
                               }
    public static double ecuacionDosRaiz1(double a3, double b3, double c3){
          double ecuacion2 = (-(b3)+Math.sqrt(devuelveDiscriminante(a3,b3,c3)))/(2*a3);
          return ecuacion2;
    }
    public static double ecuacionDosRaiz2(double a4, double b4, double c4){
          double ecuacion3 = (-(b4)-Math.sqrt(devuelveDiscriminante(a4,b4,c4)))/(2*a4);
          return ecuacion3;
    }                           
}
 


