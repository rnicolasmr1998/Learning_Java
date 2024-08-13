package Clase_15_Actividad_Integradora_III;
import java.util.InputMismatchException;
import java.util.Scanner;
public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        boolean continuar;
        int numero = 0;

        do {
            continuar = false;
            try {
                System.out.println("Ingresa un numero primo: ");
                numero = miScanner.nextInt();
                if (numero <=1) {
                    System.out.println("Debe ingresar un numero mayor a uno.");
                    continuar = true;                    
                } else {
                    for (int i = 2; i < numero; i++) {
                        if (numero % i == 0) {
                            System.out.println("No es un numero primo");
                            continuar = true;
                            break;
                        }
                    }
                    if (!continuar) {
                        System.out.println("Es un numero primo");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero positivo.");
                miScanner.next();
                continuar = true;
            }

        } while(continuar);
        miScanner.close();
    }
}
