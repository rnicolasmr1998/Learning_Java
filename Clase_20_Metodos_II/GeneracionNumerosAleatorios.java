package Clase_20_Metodos_II;
import java.util.InputMismatchException;
import java.util.Scanner;
public class GeneracionNumerosAleatorios {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            try {
                System.out.println("Escoja una alternativa:");
                System.out.println("1: Generar un número aleatorio");
                System.out.println("2: Salir");
                System.out.print("Introduce la alternativa: ");
                int optionUser = myScanner.nextInt();
                if (optionUser == 1) {
                    int randomNumber = numeroAleatorio();
                    System.out.println("El numero aleatorio es: " + randomNumber);
                    myScanner.nextLine();
                } else if(optionUser != 1 && optionUser != 2) {
                    System.out.println("Opcion no valida. Introduzca 1 o 2");
                    continue;
                } else {
                    System.out.println("Saliendo del programa ...");
                    return;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe introducir un número entero");
                myScanner.nextLine();
                continue;
            }
        } while (true);
    }
    public static int numeroAleatorio() {
        return (int) (Math.random() * 135);
    }
}
