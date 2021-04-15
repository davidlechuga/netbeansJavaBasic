
public class AdiosMundo {

    public static void main(String args[]) {
        var usuario = "David";
        var titulo = "Politólogo";
        var despedida = "Adios mundo";

        var union = despedida + " " +  titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;
        //suma numerica
        System.out.println(i + j);
        // primero dos numeros y despues cadena
        System.out.println(i + j + usuario);
        // contexto cadena, como detecta que primer valor es string, todo lo demas lo convierte en string
        System.out.println(usuario + i + j);
        // Prioridad en la evaluación ( )
        System.out.println(usuario + (i + j));

        for (int o = 0; o < 5; ++o) {
            System.out.println(o);
        }

    }
}
