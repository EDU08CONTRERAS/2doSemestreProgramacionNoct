

public class MetodoMath
{
    public static void main (String [] args)
    {
  
    
   
    System.out.println("La constante PI es igual a: "+ Math.PI);
System.out.println("La constante E es igual a: "+ Math.E);

System.out.println("Arcocoseno de 45º = " + Math.acos(Math.toRadians(45)));
System.out.println("Arcoseno de 45º = " + Math.asin(Math.toRadians(45)));
System.out.println("Arcotangente de 45º = " + Math.atan(Math.toRadians(45)));
System.out.println("Coseno de 45º = " + Math.cos(Math.toRadians(45)));
System.out.println("Seno de 45º = " + Math.sin(Math.toRadians(45)));
System.out.println("Tangente de 45º = " + Math.tan(Math.toRadians(45)));          

    //Redondeo con el método ceil 
System.out.println("Redondear 1.9 al valor mayor entero mas cercano " + Math.ceil(1.9));
System.out.println("Redondear 1.2 al valor mayor entero mas cercano " + Math.ceil(1.2));
System.out.println("Redondear 1.5 al valor mayor entero mas cercano " + Math.ceil(1.5));
//Redondeo con el Método floor
System.out.println("Redondear 1.9 al valor menor entero mas cercano " + Math.floor(1.9));
System.out.println("Redondear 1.2 al valor menor entero mas cercano " + Math.floor(1.2));
System.out.println("Redondear 1.5 al valor menor entero mas cercano " + Math.floor(1.5));
//Aproximación al entero más próximo  con el método rint
System.out.println("Entero mas proximo de 1.2 = " + Math.rint(1.2));
System.out.println("Entero mas proximo de 1.5 = " + Math.rint(1.5));
System.out.println("Entero mas proximo de 1.9 = " + Math.rint(1.9));
//Redondeo habitual con el metodo round
System.out.println("Redondero habitual de 1.2 = " + Math.round(1.2));
System.out.println("Redondero habitual de 1.5 = " + Math.round(1.5));
System.out.println("Redondero habitual de 1.9 = " + Math.round(1.9));
System.out.println("Valor absoluto de 1 = " + Math.abs(1) + "\n Valor absoluto de -1 = " + Math.abs(-1));
System.out.println("Exponencial  de un numero " + Math.exp(3));
System.out.println("Logaritmo natural base e" + Math.log(3));
System.out.println("Maximo de 6 y 7 " + Math.max(6, 7));
System.out.println("Minimo de 6 y 7 " + Math.min(6, 7));
System.out.println("5^2 = " + Math.pow(5, 2));
System.out.println("Número aleatorio " + Math.random());
System.out.println("Raiz cuadrada de 25 = " + Math.sqrt(25));
System.out.println("Raiz cuadrada de 213 =" + Math.sqrt(213));
System.out.println("45º convertidos a radianes = " + Math.toRadians(45));
System.out.println("180 radianes covertidos a grados = " + Math.toDegrees(180));



}
}
