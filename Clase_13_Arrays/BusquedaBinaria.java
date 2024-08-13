package Clase_13_Arrays;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int tamanioArray;

        // Solicitar tamaño del arreglo con manejo de excepciones
        while (true) {
            try {
                System.out.println("Ingresa el tamanio del array: ");
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
        int inicializadorBucle = 0;
        int numeroAleatroio;
        
        // Llenar el array con números aleatroios
        while(inicializadorBucle < myArray.length) {
            numeroAleatroio = (int) (Math.random() * 100);
            myArray[inicializadorBucle] = numeroAleatroio;
            inicializadorBucle++;                
        }
        
        Arrays.sort(myArray);
        System.out.println("El array es: " + Arrays.toString(myArray));

        while (true) {
            try {
                System.out.println("Escoja un numero: ");
                numeroAleatroio = miScanner.nextInt();
                int indiceArray = Arrays.binarySearch(myArray, numeroAleatroio);
                if (indiceArray >= 0) {
                    System.out.println("El número " + numeroAleatroio + " está presente en el array, en el indice " + indiceArray);
                } else {
                    System.out.println("El número " + numeroAleatroio + " no está presente en el array.");
                }
                miScanner.close();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero positivo.");
                miScanner.next();  // Limpiar el buffer del scanner
            }
        }
    }
}
