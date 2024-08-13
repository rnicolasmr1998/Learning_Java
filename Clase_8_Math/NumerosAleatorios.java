package Clase_8_Math;
import java.util.Scanner;
public class NumerosAleatorios {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        double numeroAleatorio = Math.random() * 355;
        System.out.println("El numero aleatorio es " + numeroAleatorio + " y redondeado hacia abajo es " + Math.floor(numeroAleatorio));
        miScanner.close();
    }
}
