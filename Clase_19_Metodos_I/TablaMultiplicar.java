package Clase_19_Metodos_I;
import java.util.Scanner;
public class TablaMultiplicar {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int inputUser = inputUser();
        for (int i = 1; i < 11; i++) {
            imprimirTablaMultiplicar(inputUser, i);            
        }
    }

    public static int inputUser() {
        System.out.println("Ingrese un numero: ");
        int inputUser = myScanner.nextInt();
        return inputUser;
    }

    public static void imprimirTablaMultiplicar(int inputUser, int number) {
        System.out.println(inputUser + " x " + number + " = " + (inputUser * number));
    }
}
