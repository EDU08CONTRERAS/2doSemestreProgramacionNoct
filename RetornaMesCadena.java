
/**
 * Write a description of class RetornaMesCadena here.
 * 
 * @author JLI 
 * @version 001
 * 
 * El usuario debe ingresar un numero entrero y el programa devolvera el mes correspondiente
 * si ingresa un numero mayor a 12 o menor a 1 indicara que no es un MES VALIDO
 */
import java.util.Scanner;
public class RetornaMesCadena
{
    public static void main()
    {
        int mes;
        Scanner entrada;
        
        entrada = new Scanner(System.in);
        System.out.print("Ingrese el mes: ");
        mes = entrada.nextInt();
        
        switch (mes)
        {
            case 1:
                System.out.print("ENERO");
                break;
                
            case 2:
                System.out.print("FEBRERO");
                break;
                
            case 3:
                System.out.print("MARZO");
                break;
                
            case 4:
                System.out.print("ABRIL");
                break;
                
            case 5:
                System.out.print("MAYO");
                break;
                
            case 6:
                System.out.print("JUNIO");
                break;
                
            case 7:
                System.out.print("JULIO");
                break;
                
            case 8:
                System.out.print("AGOSTO");
                break;
                
            case 9:
                System.out.print("SEPTIEMBRE");
                break;
                
            case 10:
                System.out.print("OCTUBRE");
                break;
                
            case 11:
                System.out.print("NOVIEMBRE");
                break;
                
            case 12:
                System.out.print("DICIEMBRE");
                break;
                
            default:
                System.out.print("Ingrese un mes valido");
                break;
            
        }
        
        
        
    } // fin metodo main

} //fin clase RetornaMesCadena
