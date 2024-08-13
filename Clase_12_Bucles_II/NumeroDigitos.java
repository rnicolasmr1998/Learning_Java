package Clase_12_Bucles_II;
import java.util.Scanner;
public class NumeroDigitos {
    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numeroUsuario = miScanner.nextInt();
        int numeroDigitos = 0;

        if (numeroUsuario ==0) {
            numeroDigitos = 1;
        } else {
            numeroUsuario = Math.abs(numeroUsuario);
            while (numeroUsuario > 0) {
                numeroUsuario /= 10;
                numeroDigitos++;
            }
        }
        System.out.println("El numero es " + numeroUsuario + " y tiene " + numeroDigitos + " digitos");

        miScanner.close();
    }
}
