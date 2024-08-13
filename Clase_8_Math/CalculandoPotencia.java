package Clase_8_Math;
import java.util.Scanner;
public class CalculandoPotencia {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero que representa la base: ");
        double numeroBase = miScanner.nextDouble();

        System.out.println("Ingrese un numero que representa el exponente: ");
        double numeroExponente = miScanner.nextDouble();

        System.out.println("El resultado del numero " + numeroBase + " elevado al exponente " + numeroExponente + " es " + Math.pow(numeroBase, numeroExponente));       
        
        miScanner.close();
    }
}
