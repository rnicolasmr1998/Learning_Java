package Clase_14_Wrappers;
import java.util.Scanner;

public class VerificandoCadenaLetras {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena: ");
        String characterUser = myScanner.nextLine();
        for (int i = 0; i < characterUser.length(); i++) {
            if (!Character.isLetter(characterUser.charAt(i))) {
                System.out.println("La palabra " + characterUser + " no solo tiene letras.");
                break;
            }
            if (i == characterUser.length() - 1) {
                System.out.println("La palabra " + characterUser + " solo tiene letras.");
            }
        }
        myScanner.close();
    }
}
