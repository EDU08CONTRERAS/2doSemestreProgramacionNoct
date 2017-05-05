
/**
 * Write a description of class IngresoCalificacion here.
 * 
 * @author JLI 
 * @version 001
 * Este programa solicita al usuario el ingreso de una calificacion de tipo entero
 * si la calificacion ingresada es mayor o igual a 5 el programa debera presentar
 * el mensaje APROBADO, caso contrario, presentara el mensaje REPROBADO
 */

public class IngresoCalificacion
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int nota;
        
        System.out.print("Ingrese la calificacion: ");
        nota = entrada.nextInt();
        
        if (nota >= 5)
        {
            Sytem.out.print("APROBADO");
        }
        else
        {
            system.out.print("REPROBADO")
        }
        
    }//fin clase main

}//fin clase IngresoCalificacion
