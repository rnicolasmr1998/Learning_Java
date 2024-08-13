package Clase_7_String;

import java.util.Scanner;
public class LongitudCadena {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese el titulo de su libro favorito: ");
        try {
            String libroFvorito = miScanner.nextLine();
            int longitudLibro = libroFvorito.length();
            System.out.println("Su libro favorito es: " + libroFvorito + " y tiene " + longitudLibro + " caracteres.");
        } catch (Exception e) {
            System.out.println("Error: El valor ingresado es incorrecto.");
        }
        miScanner.close();
    }
}
