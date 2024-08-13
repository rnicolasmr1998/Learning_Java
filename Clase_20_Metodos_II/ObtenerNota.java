package Clase_20_Metodos_II;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ObtenerNota {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        int inputUser = SolicitarNota();
        String noteUser = getNota(inputUser);
        System.out.println("El usuario saco " + inputUser + " puntos equivalente a "  +
                            noteUser + " de calificacion.");
    }

    public static int SolicitarNota(){
        do {
            try {
                System.out.println("Ingrese una nota de 0 a 100: ");
                int inputUser = myScanner.nextInt();
                if (inputUser > 100 || inputUser < 0 ) {
                    System.out.println("Error: El valor colocado no se encuentre en el rango de 0 a 100.");
                    myScanner.nextLine();
                    continue;
                }
                return inputUser;
            } catch (InputMismatchException e) {
                System.out.println("Error: El valor colocado no es un numero entero");
                myScanner.nextLine();
                continue;
            }         
        } while (true);
    }

    public static String getNota(int input) {
        return switch (input / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
}
}
