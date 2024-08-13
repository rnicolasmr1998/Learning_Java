import java.util.Scanner;

public class ClasificacionNumero {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        float primerNumero = miScanner.nextFloat();

        if (primerNumero < 0) {
            System.out.println("El numero es negativo");
        } else if (primerNumero == 0 ) {
            System.out.println("El numero es cero");
        } else {
            System.out.println("El numero es positivo");
        }
        miScanner.close();
    }
}