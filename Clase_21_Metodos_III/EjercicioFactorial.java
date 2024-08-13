package Clase_21_Metodos_III;
import java.util.InputMismatchException;
import java.util.Scanner;
public class EjercicioFactorial {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            try {
                System.out.print("Coloque un numero entero positivo: ");
                int valueUser = myScanner.nextInt();
                if (valueUser < 0) {
                    System.out.println("El numero ingresado debe ser mayor o igual a cero.");
                    continue;
                };
                int numberFactorial = metodoFactorial(valueUser);
                System.out.println("El numero factorial de " + valueUser + " es: " + numberFactorial);
                return;
            } catch (InputMismatchException e) {
                System.out.println("Error: El valor ingresado no es un numero entero positivo.");
                myScanner.nextLine();
            }
        }
    }

    public static int metodoFactorial(int input) {
        if(input == 1 ||input == 0) {
            return 1;
        } else {
            return input * metodoFactorial(input - 1);
        }
    }
}
