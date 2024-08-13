import java.util.Scanner;

public class ProgramaParImpar {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        float primerNumero = miScanner.nextFloat();

        System.out.println("Ingrese el segundo numero: ");
        float segundoNumero = miScanner.nextFloat();

        Boolean primerNumeroPar = primerNumero % 2 == 0;
        Boolean segundoNumeroPar = segundoNumero % 2 == 0;

        System.out.println("El primer numero ingresado es par: " + primerNumeroPar);
        System.out.println("El segundo numero ingresado es par: " + segundoNumeroPar);

        miScanner.close();
    }
}