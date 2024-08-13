package Clase_21_Metodos_III;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioFibonacci {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.print("Ingrese un numero entero positivo: ");
                int lengthUser = myScanner.nextInt();
                if (lengthUser < 0) {
                    System.out.println("El numero colocado debe ser un entero positivo");
                    continue;
                }
                fibonacciPosition(lengthUser);
                return;
            } catch (InputMismatchException e) {
                System.out.println("Error: El valor ingresado no es un numero.");
                myScanner.nextLine();
            }
        }
    }

    public static void fibonacciPosition(int length) {
        int[] myArray = new int[length + 1];
        for (int i = 0; i < myArray.length; i++) {
            if(i == 0 || i == 1) {
                myArray[i] = i;
            } else {
                myArray[i] = myArray[i - 1] + myArray[i - 2];
            }
        }
        System.out.println("El numero fibonacci de la posicion " + length + 
                           " es: " + myArray[length] + " y la serie completa es: " +
                           Arrays.toString(myArray));
    }
}
