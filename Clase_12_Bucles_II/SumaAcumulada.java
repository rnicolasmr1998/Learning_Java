package Clase_12_Bucles_II;
import java.util.Scanner;
public class SumaAcumulada {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int numerosAcumulados = 0;
        int respuestaUsuario;
        do {
            System.out.println("Ingresar un numero entero positivo: ");
            int numeroUsuario = miScanner.nextInt();
            System.out.println("El numero ingresado es: " + numeroUsuario);
            numerosAcumulados += numeroUsuario;

            System.out.println("Quieres seguir?: ");
            System.out.println("1: afirmativo: ");
            System.out.println("2: negativo: ");
            respuestaUsuario = miScanner.nextInt();

        } while (respuestaUsuario == 1);

        System.out.println("La suma acumulada es: " + numerosAcumulados);
        miScanner.close();

    }
}
