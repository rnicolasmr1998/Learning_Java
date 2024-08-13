package Clase_20_Metodos_II;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
public class ArrayAleatorio {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean validInput = true;
        while(validInput) {
            try {
                int lengthArray = 0;
                int minValueArray = 0;
                int maxValueArray = 0;
                while (true) {
                    System.out.print("Ingrese el tamanio del array: ");
                    lengthArray = myScanner.nextInt();
                    if (lengthArray == 0) {
                        System.out.println("El tamanio del array no puede ser cero");
                        continue;
                    } else if (lengthArray < 0) {
                        System.out.println("El tamanio del array no puede ser negativo");
                        continue;
                    }
                    break;
                }
                while (true) {
                    System.out.print("Ingrese el valor minimo del array: ");
                    minValueArray = myScanner.nextInt();
                    System.out.print("Ingrese el valor maximo del array: ");
                    maxValueArray = myScanner.nextInt();
                    if (minValueArray < maxValueArray) {
                        break;
                    } else {
                        System.out.println("Inputs invalidos. Por favor, volver a intentar.");
                    }  
                }
                int[] myArray = randomArray(lengthArray, minValueArray, maxValueArray);
                System.out.println("El array es: " + Arrays.toString(myArray));
                validInput = false;            
            } catch (InputMismatchException e) {
                System.out.println("Error: El valor ingresado deber de ser un entero");
                myScanner.nextLine();
            }
        }

    }

    public static int[] randomArray(int lenght, int min, int max) {
        int[] myArray = new int[lenght];
        for (int i = 0; i < myArray.length; i++) {
            int valueRandom = (int) (min + Math.random() * (max + 1 - min));
            myArray[i] = valueRandom;
        }
        return myArray;
    }
}
