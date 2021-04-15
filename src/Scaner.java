
import java.util.Scanner;

public class Scaner {
    public static void main (String args[]) {
        System.out.println("Escribe tu nombre");
        Scanner consola = new Scanner(System.in);
        
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe un titulo");
        var titulo = consola.nextLine();
        System.out.println("Resultado = " + titulo + " " +  usuario);
         
    }
}
