package Clase_8_Math;
import java.util.Scanner;
public class CalculandoRaiz {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo: ");       
        double numeroPositivo = miScanner.nextDouble();
        System.out.println("La raiz cuadrada de " + numeroPositivo + " es: " + Math.sqrt(numeroPositivo));

        miScanner.close();
    }
}
