import java.util.Scanner;
public class metodos
{
    public static void main (String []args)
    {
        Scanner teclado = new Scanner (System.in);
        int iNumero=0;
        int iUnidad = iNumero%10;
        String unidadEnTexto ;
        
        String sTexto;
        iNumero = iNumero/10;		
        sTexto = unidadEnTexto(iUnidad);
        int iDecena = iNumero%10;
iNumero = iNumero/10;
 
if ((iUnidad==0) && (iDecena>0))
	sTexto = decenaEnTexto(iDecena);
else if (iDecena==1)
	sTexto = decenaEnTexto(10+iUnidad);
else if (iDecena > 1)
	sTexto = decenaEnTexto(iDecena) + " y " + sTexto;
	int iCentena = iNumero%10;
    
if ((iCentena!=1) && (iCentena!=5) && (iCentena!=9) && (iCentena!=0))
	sTexto = unidadEnTexto(iCentena) + "cientos" + " " + sTexto;
else if ((iCentena==1) || (iCentena==5) || (iCentena==9))
	sTexto = centenaEnTexto(iCentena) + " " + sTexto;
        
    }
    public static String unidadEnTexto(int iNumero){
// Método que dado un número me lo devuelve en texto		
 switch(iNumero){
	case 1:
		return "uno";
	case 2:
		return "dos";
	case 3:
		return "tres";
	case 4:
		return "cuatro";
	case 5:
		return "cinco";
	case 6:
		return "seis";
	case 7:
		return "siete";
	case 8:
		return "ocho";
	case 9:
		return "nueve";
	case 0:
		return "cero";
	default:
		return "";
 }
}
public static String decenaEnTexto(int iDecena)
{
  switch (iDecena){
	case 1:
		return "diez";
	case 2:
		return "veinte";
	case 3:
		return "treinta";
	case 4:
		return "cuarenta";
	case 5:
		return "cincuenta";
	case 6:
		return "sesenta";
	case 7:
		return "setenta";
	case 8:
		return "ochenta";
	case 9:
		return "noventa";		
	default:
		return "";
  }
}
public static String entenaEnTexto(int iDecena){
  switch (iDecena){
	case 11:
		return "once";
	case 12:
		return "doce";
	case 13:
		return "trece";
	case 14:
		return "catorce";
	case 15:
		return "quince";
	case 16:
		return "dieciseis";
	case 17:
		return "diecisiete";
	case 18:
		return "dieciocho";
	case 19:
		return "diecinueve";		
	default:
		return "";
}
}
}