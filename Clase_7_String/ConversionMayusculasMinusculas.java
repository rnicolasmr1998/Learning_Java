package Clase_7_String;
import java.util.Scanner;

public class ConversionMayusculasMinusculas {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de su profesion: ");
        String nombreProfesion = miScanner.nextLine();

        System.out.println("El nombre de su profesion en mayusculas es: " + nombreProfesion.toUpperCase());
        System.out.println("El nombre de su profesion en minusculas es: " + nombreProfesion.toLowerCase());

        miScanner.close();
    }
}
