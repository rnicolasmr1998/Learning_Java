package Clase_13_Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ComparandoArreglos {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int tamanioArray;
        
        while(true) {
            try{
                System.out.println("Ingresa el tamanio del array: ");
                tamanioArray = miScanner.nextInt();
                if(tamanioArray == 0) {
                    System.out.println("El tamanio del arreglo debe ser diferente de cero ");
                    continue;
                } else if(tamanioArray < 0) {
                    System.out.println("El tamanio del arreglo debe ser positivo ");
                    continue;
                }
                miScanner.close();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero positivo.");
                miScanner.next();  // Limpiar el buffer del scanner
            }
        }
        
        int[] myFirstArray = new int[tamanioArray];
        int[] mySecondArray = new int[tamanioArray];
        
        int inicializadorBucle = 0;
        while (inicializadorBucle < tamanioArray) { 
            myFirstArray[inicializadorBucle] = (int) (Math.random() * 100);
            mySecondArray[inicializadorBucle] = (int) (Math.random() * 100);
            inicializadorBucle++;
        }
        System.out.println("El primer array es: " + Arrays.toString(myFirstArray));
        System.out.println("El segundo array es: " + Arrays.toString(mySecondArray));
        System.out.println("El primer y el segundo array son iguales: " + 
        Arrays.equals(myFirstArray, mySecondArray));
    }
}
