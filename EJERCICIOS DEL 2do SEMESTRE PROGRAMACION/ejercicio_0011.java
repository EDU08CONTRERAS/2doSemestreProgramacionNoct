

public class ejercicio_0011
{
    public static void main(String[] args) {
        String palabra = "Anita lava la tina";
        System.out.println("Palabra utilizada: "+ palabra);
        if (palindromo(palabra))
            System.out.println("Palindromo");
        else
            System.out.println("NO Palindromo");
    }
    static boolean palindromo(String palabra)
    {
        String modificado = palabra.replaceAll(" ","").toLowerCase();
        int i=0;
        while (i < modificado.length() )
        {
            if (modificado.charAt(i) != modificado.charAt(modificado.length() -1 -i))
                
            return false;
            i++;
        }
        return true;
     }
}




