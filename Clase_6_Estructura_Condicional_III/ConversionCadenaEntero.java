package Clase_6_Estructura_Condicional_III;

import java.util.Scanner;

public class ConversionCadenaEntero {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        try {
            System.out.println("Ingrese un numero: ");
            String primerNumero = miScanner.nextLine();
            int numeroEntero = Integer.parseInt(primerNumero);
            System.out.println("EL numero entero es: " + numeroEntero);
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir el numero a entero");
        } catch (Exception e) {
            System.out.println("Ups, algo salio mal.");
        }
        miScanner.close();
    }
}
