package Clase_16_Actividad_Integradora_IV;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosPrimosPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condition = false;
        do {
            try {
                System.out.print("Ingrese la cantidad deseada de números primos a obtener: ");
                int cantidadDeseada = scanner.nextInt();

                if (cantidadDeseada <= 0) {
                    System.out.println("La cantidad debe ser mayor a 0");
                    condition = true;
                    continue;
                }

                int cantidadEncontrados = 0;
                int number = 2;
                System.out.print("Los primeros " + cantidadDeseada + " números primos son: ");
                while (cantidadEncontrados < cantidadDeseada) {
                    boolean esPrimo = true;
                    for (int i = 2; i < number; i++) {
                        if (number % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                    if (esPrimo) {
                        System.out.print(number + " ");
                        cantidadEncontrados++;
                    }
                    number++;
                }
                condition = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un valor numerico");
                condition = true;
                scanner.next();
            }
        } while (condition);

        scanner.close();      
    }
}
