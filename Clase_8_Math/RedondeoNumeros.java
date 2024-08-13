package Clase_8_Math;
import java.util.Scanner;
public class RedondeoNumeros {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        try {
            System.out.println("Coloque un numero decimal: ");
            double numeroDecimal = miScanner.nextDouble();

        System.out.println("El numero colocado es " + numeroDecimal + " y su valor redondeado es " + Math.round(numeroDecimal));

        } catch (Exception e) {
            System.out.println("Error: El valor ingresado es incorrecto");
        }
        
        miScanner.close();
    }
}
