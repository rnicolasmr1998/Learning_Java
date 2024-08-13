package Clase_12_Bucles_II;
import java.util.Scanner;
public class ContadorParImpar {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int numeroPar = 0;
        int numeroImpar = 0;
        int respuestaUsuario;
        try {
            do {
                System.out.println("Ingresar un numero entero: ");
                int numeroUsuario = miScanner.nextInt();
                if (numeroUsuario % 2 == 0) {
                    numeroPar++;
                } else {
                    numeroImpar++;
                }
                System.out.println("¿Desea continuar?");
                System.out.println("1: Si");
                System.out.println("2: No");
                respuestaUsuario = miScanner.nextInt();
            } while(respuestaUsuario == 1);   
        } catch (Exception e) {
            System.out.println("Error: El valor de la opcion no es un numero");
        } finally {
            System.out.println("Cantidade de pares: " + numeroPar);
            System.out.println("Cantidade de impares: " + numeroImpar);
            miScanner.close();
        }
    }
}
