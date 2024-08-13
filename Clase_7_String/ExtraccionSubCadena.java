package Clase_7_String;
import java.util.Scanner;
public class ExtraccionSubCadena {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su comida favorita: ");
        String nombreComida = miScanner.nextLine();
        int longitudComida = nombreComida.length();
        System.out.println("Ingrese dos numeros del 0 al " + longitudComida + ":");
        try {
            System.out.println("El primer numero es: ");
            int primerNumero = miScanner.nextInt();
            System.out.println("El segundo numero es: ");
            int segundoNumero = miScanner.nextInt();
            String subCadenaComida = nombreComida.substring(primerNumero, segundoNumero);
            System.out.println("La subcadena del " + primerNumero + " al " + 
            segundoNumero + " numero de la palabra " + nombreComida + " es: " + subCadenaComida);
        } catch (Exception e) {
            System.out.println("Error: El valor ingresado es incorrecto.");
        }
        
        miScanner.close();



    }
}
