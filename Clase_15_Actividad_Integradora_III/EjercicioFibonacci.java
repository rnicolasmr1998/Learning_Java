package Clase_15_Actividad_Integradora_III;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioFibonacci {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int longitudArray;
        boolean continuar;
        do {
            continuar = false;
            try {
                System.out.println("Ingrese el tamaño del array: ");
                longitudArray = myScanner.nextInt();

                if (longitudArray <= 0) {
                    System.out.println("El tamaño del array debe ser un número positivo mayor a cero.");
                    continuar = true;
                } else {
                    int[] myArray = new int[longitudArray];
                    int inicializacion = 2;

                    while(inicializacion < longitudArray) {
                        myArray[0] = 0;
                        myArray[1] = 1;
                        myArray[inicializacion] = myArray[inicializacion - 1] + myArray[inicializacion - 2];
                        inicializacion++;
                    }
                    System.out.println("Los " +
                                        longitudArray + 
                                        " primeros numeros fibonacci son: " +
                                        Arrays.toString(myArray));;
                }          
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero positivo.");
                myScanner.next();
                continuar = true;
            }
        } while (continuar);
        myScanner.close();
    }
}
