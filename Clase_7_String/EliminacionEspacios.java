package Clase_7_String;
import java.util.Scanner;
public class EliminacionEspacios {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de su escritor favorito: ");
        String nombreEscritor = miScanner.nextLine();

        System.out.println("Su escritor favorito es: " + nombreEscritor.trim());

        miScanner.close();
    }
}
