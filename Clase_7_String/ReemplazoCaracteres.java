package Clase_7_String;
import java.util.Scanner;

public class ReemplazoCaracteres {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de su escritor favorito: ");
        String nombreEscritor = miScanner.nextLine();

        System.out.println("Ingrese el caracter para ser reemplazado: ");
        String primerCaracter = miScanner.nextLine();

        System.out.println("Ingrese el caracter que lo va a reemplazar: ");
        String segundoCaracter = miScanner.nextLine();

        System.out.println("Si reemplazo el caracter " + primerCaracter + 
        " por " + segundoCaracter + " de su escritor favorito (" + nombreEscritor + 
        ") el resultado es: " + nombreEscritor.replace(primerCaracter, segundoCaracter));

        miScanner.close();
    }
}