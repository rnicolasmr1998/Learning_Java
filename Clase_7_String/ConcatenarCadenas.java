package Clase_7_String;
import java.util.Scanner;
public class ConcatenarCadenas {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombreUsuario = miScanner.nextLine();
        nombreUsuario = nombreUsuario + " ";
        System.out.println("Ingrese su apellido: ");
        String apellidoUsuario = miScanner.nextLine();

        System.out.println("Bienvenido " + nombreUsuario.concat(apellidoUsuario));
        miScanner.close();

    }
}
