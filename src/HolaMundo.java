// David lechuga Huerta 
public class HolaMundo {
    public static void main(String args[]) {
        //System.out.println("Hola Mundo desde Java");
        //Definicion de Variables
        int variableEntera = 10;
        System.out.println(variableEntera);
        //Cambio de valor de una Variable
        variableEntera = 5;
        System.out.println(variableEntera);
        
        String variableCadena = "Saludos";
        System.out.println(variableCadena);
        
        variableCadena = "Adios";
        System.out.println(variableCadena);
        
        //var hace inferencias de tipos en Java
        
        var variableEntera2 = 15;
        System.out.println(variableEntera2);
        
        var variableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + variableCadena2);
        
    }
}