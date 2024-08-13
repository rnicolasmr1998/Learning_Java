package Clase_20_Metodos_II;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
public class RellenarArray {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.print("Ingresa el tamanio del array: ");
            int lenghtArray = myScanner.nextInt();
            int[] myArray = new int[lenghtArray];
            myArray = rellenarArrayMetodo(myArray);
            System.out.println(Arrays.toString(myArray));
        } catch (InputMismatchException e) {
            System.out.println("Error: El valor ingresado no es un numero entero");
        }
    }

    public static int[] rellenarArrayMetodo(int[] array) {
        int minLengthArray = 0;
        int maxLengthArray = array.length;
        int inputValueUser = 0;
        while (true) {
            System.out.print("Ingrese un valor para rellenar el array: ");
            inputValueUser = myScanner.nextInt();
            System.out.print("Ingrese un valor del " + minLengthArray + 
                               " al " + (maxLengthArray - 1) + ": ");
            int inputLengthUser = myScanner.nextInt();

            if(inputLengthUser < minLengthArray || inputLengthUser >  maxLengthArray - 1) {
                System.out.println("Error: El índice debe ser mayor que " + minLengthArray + 
                                   " y menor que " + maxLengthArray);
                continue;
            }

            for (int i = minLengthArray; i < maxLengthArray; i++) {
                array[i] = inputValueUser;
            }
            minLengthArray = inputLengthUser + 1;
            if (minLengthArray == maxLengthArray) {
                return array;
            }
        }
    }
}
