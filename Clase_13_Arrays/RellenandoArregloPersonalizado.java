package Clase_13_Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class RellenandoArregloPersonalizado {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int lenghtArray = 0;
        // Solicitar al usuario el tamanio del array
        while (true) {
            try {
                System.out.println("Ingrese el tamanio del array: ");
                lenghtArray = myScanner.nextInt();

                if(lenghtArray == 0) {
                    System.out.println("El tamnio del array debe ser distinto a cero.");
                    continue;
                } else if(lenghtArray < 0) {
                    System.out.println("El tamanio del array debe ser un numero positivo.");
                    continue;
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un numero entero positivo.");
                myScanner.next();
            }
        }

        // Solicitar un numero al usuario
        int[] myArray = new int[lenghtArray];
        int numberUser;
        int numberIndexInitial = 0;
        int numberIndex;
        while (true) {
            try {
                System.out.println("Ingrese un numero para llenar el array: ");
                numberUser = myScanner.nextInt();
                System.out.println("Ingrese un indice hasta donde se va a  llenar el array con el numero anterior: ");
                numberIndex = myScanner.nextInt();
                if(numberIndex < 0) {
                    System.out.println("El indice debe ser un numero positivo");
                    continue;
                } else if(numberIndex <= numberIndexInitial) {
                    System.out.println("El indice debe ser mayor a: " + numberIndexInitial);
                    continue;
                } else if(numberIndex > lenghtArray) {
                    System.out.println("El indice debe ser menor a: " + lenghtArray);
                    continue;
                } else if(numberIndex < lenghtArray) {
                    Arrays.fill(myArray, numberIndexInitial, numberIndex, numberUser);
                    numberIndexInitial = numberIndex;
                    continue;
                } else {
                    Arrays.fill(myArray, numberIndexInitial, numberIndex, numberUser);
                    numberIndexInitial = numberIndex;
                    if (numberIndex == lenghtArray) {
                        System.out.println("El array es: " + Arrays.toString(myArray));
                        myScanner.close();
                        break;
                    }
                    continue;                    
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un numero entero positivo");
                myScanner.next();
            }
        }
    }
}
