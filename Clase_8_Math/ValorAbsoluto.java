package Clase_8_Math;
import java.util.Scanner;
public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        try {
            System.out.println("Introduzca un numero entero: ");
            int numeroEntero = miScanner.nextInt();
    
            System.out.println("El numero colocado es " + numeroEntero + " y su valor absoluto es " + Math.abs(numeroEntero));            
        } catch (Exception e) {            
            System.out.println("Error: El valor ingresado es incorrecto");
        }

        miScanner.close();
    }
}
