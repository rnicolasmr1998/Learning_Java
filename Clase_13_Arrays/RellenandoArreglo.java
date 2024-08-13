package Clase_13_Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
public class RellenandoArreglo {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int tamanioArray;

        while(true) {
            try {
                System.out.println("Escriba el tamaño del arreglo: ");
                tamanioArray = miScanner.nextInt();
                if(tamanioArray == 0) {
                    System.out.println("El tamanio del arreglo debe ser diferente de cero ");
                    continue;
                } else if(tamanioArray < 0) {
                    System.out.println("El tamanio del arreglo debe ser positivo ");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero positivo.");
                miScanner.next();  // Limpiar el buffer del scanner
            }
        }

        int[] myArray = new int[tamanioArray];
        int valueArray;
        while (true) {
            try {
                System.out.println("Ingresa un valor para rellenar el arreglo: ");
                valueArray = miScanner.nextInt();
                Arrays.fill(myArray, valueArray);
                System.out.println("El array es:" + Arrays.toString(myArray));
                miScanner.close();
                break;    
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                miScanner.next();  // Limpiar el buffer del scanner
            }
        }
    }
}
