package Clase_10_Arrays;

public class SumandoElementosPares {
    public static void main(String[] args) {
        int primerNumero = (int) (Math.random() * 100);
        int segundoNumero = (int) (Math.random() * 100);
        int tercerNumero = (int) (Math.random() * 100);
        int cuartoNumero = (int) (Math.random() * 100);
        int quintoNumero = (int) (Math.random() * 100);
    
        int[] myArray = {primerNumero, segundoNumero, tercerNumero, cuartoNumero, quintoNumero};

        System.out.println("El array tiene los siguientes elementos: " + 
        primerNumero + " ," +
        segundoNumero + " ," +
        tercerNumero + " ," +
        cuartoNumero + " ," +
        quintoNumero);

        System.out.println("La suma de los elementos ubicados en las posiciones pares es: "
        + (myArray[0] + myArray[2] + myArray[4]));
    }
}
