package Clase_12_Bucles_II;
import java.util.Scanner;
public class ValidacionContrasenia {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        String contraseniaPrograma = "Secreto";

        System.out.println("Ingrese la contrasenia: ");
        String contraseniaUsuario = miScanner.nextLine();
        while (!contraseniaPrograma.equals(contraseniaUsuario)) {
            System.out.println("Contrasenia incorrecta, intentelo de nuevo: ");
            contraseniaUsuario = miScanner.nextLine();
        }
    System.out.println("Contrasenia correcta: Puede usar el aplicativo");     
        miScanner.close();
    }
}
