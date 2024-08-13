package Clase_21_Metodos_III;
import java.util.InputMismatchException;
import java.util.Scanner;
public class EjercicioNumeroPrimo {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.print("Ingrese un numero: ");
                int numberUser = myScanner.nextInt();
                if (numberUser < 0) {
                    System.out.println("El valor ingresado debe ser mayor o igual a cero.");
                    continue;
                }
                if (!esPrimo(numberUser, 2)) {
                    System.out.println("El numero ingresado no es primo."); 
                } else {
                    System.out.println("El numero " + numberUser + " es primo.");
                    return;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: el valor colocado debe ser un numero entero pòsitivo.");
                myScanner.nextLine();
            }
        }
    }
    public static boolean esPrimo(int input) {
        if(input <= 1) return false;
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if(input % i == 0) return false;
        }
        return true;
    }

    public static boolean esPrimo(int input, int divisor) {
        if(input <= 1) return false;
        if(divisor > Math.sqrt(input)) return true;
        if (input % divisor == 0) return false;
        return esPrimo(input, divisor + 1);
    }

}
