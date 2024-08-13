package Clase_6_Estructura_Condicional_III;

import java.util.Scanner;
public class DivisionSegura {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingrese el dividendo de la operacion: ");
        int miDividendo = miScanner.nextInt();

        System.out.println("Ingresa el divisor de la operacion: ");
        int miDivisor = miScanner.nextInt();

        try {
            double resultadoDivision = miDividendo / miDivisor;
            System.out.println("El resultado de la division es: " + resultadoDivision);
        } catch (ArithmeticException e) {
            System.out.println("Error: No es posible dividir un numero por cero.");
        }
        System.out.println("Gracias por participar.");

        miScanner.close();
    }
}
