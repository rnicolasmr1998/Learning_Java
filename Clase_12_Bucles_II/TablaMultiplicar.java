package Clase_12_Bucles_II;
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        System.out.println("0: Cancelar");
        int numeroTabla = miScanner.nextInt();
        while(numeroTabla != 0){
            System.out.println("La tabla de multiplicar del numero " + numeroTabla + " es: ");
            for (int i = 0; i < 13; i++) {
                System.out.println(numeroTabla + " x " + i + " = " + (numeroTabla * i));
            }
            System.out.println("Ingrese un numero: ");
            System.out.println("0: Cancelar");
            numeroTabla = miScanner.nextInt();
        }
        miScanner.close();


    }
}
