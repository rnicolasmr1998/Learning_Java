package Clase_16_Actividad_Integradora_IV;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SerieFibonacciMejorada {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean condition = false;
        do {
            try {
                System.out.println("Ingresa un numero entero positivo: ");
                int numberUser = myScanner.nextInt();
                if (numberUser < 0) {
                    System.out.println("El numero no puede ser negativo");
                    condition = true;
                    continue;
                } else {
                    double numberAureo = (1 + Math.sqrt(5))/ 2;
                    double positionFibonacci = (Math.pow(numberAureo, numberUser) - Math.pow((1-numberAureo), numberUser)) / Math.sqrt(5);
                    System.out.println("La posicion " +
                                        numberUser +
                                        " es el " +
                                        positionFibonacci +
                                        " numero fibonacci.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ser un numero entero positivo");
                myScanner.next();
                condition = true;
            }
        } while (condition);
        myScanner.close();
    }
}
