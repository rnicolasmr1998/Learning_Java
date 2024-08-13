package Clase_6_Estructura_Condicional_III;
import java.util.Scanner;

public class OperacionResta {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        try {
            System.out.println("Ingrese el primer numero: ");
            double primerNumero = miScanner.nextDouble();
            System.out.println("Ingrese el segundo numero: ");
            double segundoNumero = miScanner.nextDouble();
            System.out.println("La resta entre el primer y segundo numero es: " + (primerNumero - segundoNumero));
        } catch (Exception e) {
            System.out.println("El valor ingresado es incorrecto");
        }

        miScanner.close();
    }
}
