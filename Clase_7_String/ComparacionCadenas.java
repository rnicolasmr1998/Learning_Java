package Clase_7_String;
import java.util.Scanner;
public class ComparacionCadenas {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        
        String miNombre = "Nicolas";
        System.out.println("Adivina mi nombre: ");
        String alternativaUsuario = miScanner.nextLine();

        if(miNombre.trim().toLowerCase().equals(alternativaUsuario.toLowerCase())) {
            System.out.println("La respuesta es correcta, mi nombre es: " + alternativaUsuario.toUpperCase());
        } else {
            System.out.println("La respuesta es incorrecta, mi nombre es: " + miNombre.toUpperCase());
        }
        
        miScanner.close();
    }
}
