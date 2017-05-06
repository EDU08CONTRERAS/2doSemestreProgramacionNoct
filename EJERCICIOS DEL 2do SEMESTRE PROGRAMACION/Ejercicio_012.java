
import java.util.Scanner;
public class Ejercicio_012
{
    public static void main(String[] args) 
    {
Scanner teclado = new Scanner (System.in);
		String contraseña="eureka";

		//Esta variable booleana, nos controlara que en caso de que acierte la condicion cambie
		boolean acierto=false;

		for (int i=0;i<3 && !acierto;i++)
		{
			String contraseña1;
			System.out.println( "ingrse la contraseña ");
			contraseña1=teclado.nextLine();

			//Comprobamos si coincide, no usamos ==, usamos el metodo equals
			if (contraseña1.equals(contraseña)){
				System.out.println("Acceso Correcto");
				acierto=true;
}
}

}
}