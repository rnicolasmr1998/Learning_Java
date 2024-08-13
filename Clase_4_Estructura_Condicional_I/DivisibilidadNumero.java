import java.util.Scanner;

public class DivisibilidadNumero {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        float primerNumero = miScanner.nextFloat();

        if (primerNumero % 3 == 0 & primerNumero % 5 == 0) {
            System.out.println("El numero es divisible por 3 y por 5");
        } else if (primerNumero % 3 == 0) {
            System.out.println("El numero es divisible por 3 y no por 5");
        } else if (primerNumero % 5 == 0) {
            System.out.println("El numero es divisible por 5 y no por 3");
        } else {
            System.out.println("El número no es divisible ni por 5 ni por 3");
        }
        miScanner.close();
    }
}
