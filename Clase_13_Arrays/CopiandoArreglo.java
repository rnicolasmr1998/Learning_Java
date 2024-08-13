package Clase_13_Arrays;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CopiandoArreglo {
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
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero positivo.");
                miScanner.next();  // Limpiar el buffer del scanner
            }
        }

        int[] myArray = new int[tamanioArray];
        int inicializador = 0;
        int numeroAleatorio;
        while (inicializador < tamanioArray) {
            numeroAleatorio = (int) (Math.random() * 100);
            myArray[inicializador] = numeroAleatorio;
            System.out.println("El indice " + inicializador + " del array es: " + myArray[inicializador]);
            inicializador++;
        }

        while(true) {
            try {
                System.out.println("Ingrese el primer indice: ");
                int primerIndice = miScanner.nextInt();
                System.out.println("Ingrese el segundo indice: ");
                int segundoIndice = miScanner.nextInt();
                
                if (primerIndice > segundoIndice) {
                    System.out.println("Error, el primer indice debe ser menor que el segundo indice");
                    continue;
                } else if (primerIndice < 0 || segundoIndice < 0) {
                    System.out.println("Error, los indices deben ser positivos");
                    continue;
                } else if (primerIndice > myArray.length || segundoIndice > myArray.length) {
                    System.out.println("Error, los indices deben ser menores que el tamanio del array");
                    continue;
                } else if (primerIndice == segundoIndice) {
                    System.out.println("Error, los indices deben ser distintos");
                    continue;
                } else {
                    int[] myArrayCopia = Arrays.copyOfRange(myArray, primerIndice, segundoIndice + 1);
                    System.out.println("El arreglo copiado desde el indice "
                    + primerIndice + " hasta el segundo indice " 
                    + segundoIndice + " es: " + Arrays.toString(myArrayCopia));
                }
                miScanner.close();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número.");
                miScanner.next();  // Limpiar el buffer del scanner
            }
        }
    }   
}
