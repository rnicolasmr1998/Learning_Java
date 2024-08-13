import java.util.Scanner;
public class DeterminacionEdades {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Colocar tu edad en anios: ");
        int miEdad = miScanner.nextInt();

        if (miEdad < 18) {
            System.out.println("Eres menor de edad");
        } else if (miEdad >= 18 & miEdad <= 64) {
            System.out.println("Eres adulto");
        } else if (miEdad >=65) {
            System.out.println("Eres un adulto mayor");
        } else {
            System.out.println("Dato incorrecto");
        }
        miScanner.close();
    }
}
