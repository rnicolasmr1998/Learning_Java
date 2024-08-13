import java.util.Scanner;
public class VerificacionContrasenia {
    public static void main(String[] args) {
        String miContrasenia = "Renimaru";
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese la contraseña: ");
        String primerNumero = miScanner.nextLine();
        
        if (miContrasenia.equals(primerNumero)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
        miScanner.close();
    }
}
