package Clase_10_Arrays;
public class NumeroAleatorioLimites {
    public static void main(String[] args) {
        int primerNumero = (int) (Math.random() * 100);
        int segundoNumero = (int) (Math.random() * 100);
        int tercerNumero = (int) (Math.random() * 100);
        int cuartoNumero = (int) (Math.random() * 100);
        int quintoNumero = (int) (Math.random() * 100);
        int sextoNumero = (int) (Math.random() * 100);

        int[] myArray = {primerNumero, segundoNumero, tercerNumero, cuartoNumero, quintoNumero, sextoNumero};
        
        int contadorPares = 0;

        if (myArray[0] % 2 == 0) contadorPares++;
        if (myArray[1] % 2 == 0) contadorPares++;
        if (myArray[2] % 2 == 0) contadorPares++;
        if (myArray[3] % 2 == 0) contadorPares++;
        if (myArray[4] % 2 == 0) contadorPares++;
        if (myArray[5] % 2 == 0) contadorPares++;
        
        System.out.println("El array tiene los siguientes elementos: " + 
        primerNumero + " ," +
        segundoNumero + " ," +
        tercerNumero + " ," +
        cuartoNumero + " ," +
        quintoNumero + " ," +
        sextoNumero);
        System.out.println("El array contiene " + contadorPares + " numeros pares");
    }
}
