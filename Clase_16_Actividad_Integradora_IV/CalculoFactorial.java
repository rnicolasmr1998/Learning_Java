package Clase_16_Actividad_Integradora_IV;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CalculoFactorial {
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
                    long factorial = 1;
                    for (int i = 1; i <= numberUser; i++) {
                        factorial *= i;
                    }
                    System.out.println(numberUser + "! = " + factorial);
                    condition = false;
            }} catch (InputMismatchException e) {
                System.out.println("Error: Debe ser un numero entero positivo");
                myScanner.next();
                condition = true;
            }
        } while (condition);
        myScanner.close();
    }
}

