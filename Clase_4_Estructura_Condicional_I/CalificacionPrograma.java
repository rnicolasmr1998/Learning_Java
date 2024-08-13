import java.util.Scanner;

public class CalificacionPrograma {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingresar un numero entre 0 y 100: ");
        int primerNumero = miScanner.nextInt();

        if (primerNumero < 60) {
            System.out.println("Nota: F");
        } else if (primerNumero >= 60 & primerNumero <=69) {
            System.out.println("Nota: D");
        } else if (primerNumero >= 70 & primerNumero <=79) {
            System.out.println("Nota: C");
        } else if (primerNumero >= 80 & primerNumero <=89) {
            System.out.println("Nota: B");
        } else if (primerNumero >= 90 & primerNumero <=100) {
            System.out.println("Nota: A");
        } else {
            System.out.println("Numero incorrecto");
        }
        miScanner.close();
    }
}
