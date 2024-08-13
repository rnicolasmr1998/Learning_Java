package Clase_16_Actividad_Integradora_IV;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DibujandoCuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condition = false;
        do {
            try {
                System.out.print("Ingrese el tamaño del cuadrado: ");
                int tamanioCuadrado = scanner.nextInt();
                if (tamanioCuadrado <= 0) {
                    System.out.println("El valor ingresado debe ser un numero mayor a cero.");
                    condition = true;
                    continue;
                } else {
                    for (int i = 0; i < tamanioCuadrado; i++) {
                        for (int j = 0; j < tamanioCuadrado; j++) {
                        // Imprimir asterisco si estamos en el borde del cuadrado
                            if (i == 0 || i == tamanioCuadrado - 1 || j == 0 || j == tamanioCuadrado - 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                        }
                }
                condition = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: El valor ingresado no es un número");
                condition = true;
                scanner.next();
            }    
        } while (condition);
        scanner.close();      
    }
}
