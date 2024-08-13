package Clase_10_Arrays;
import java.util.Scanner;
public class BuscandoElementos {
    public static void main(String[] args) {
        
        Scanner miScanner = new Scanner(System.in);

        int[] myArray = {5, 8, 10};

        System.out.println("Ingrese un numero entero: ");
        int numeroUsuario = miScanner.nextInt();

        if (myArray[0] == numeroUsuario ||myArray[1] ==numeroUsuario ||myArray[2] ==numeroUsuario) {
            System.out.println("El numero " + numeroUsuario + " está presente en el array.");
        } else {
            System.out.println("El numero " + numeroUsuario + " no está presente en el array.");
        }
        miScanner.close();
    }
}
