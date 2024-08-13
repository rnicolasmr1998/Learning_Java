package Clase_19_Metodos_I;
import java.util.Scanner;
public class SegundoEjercicio {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String nameUser = inputName(myScanner);
        int ageUser = inputAge(myScanner);
        printNameAndAge(nameUser, ageUser);
        myScanner.close();
    }

    // Obteniendo el nombre del usuario
    public static String inputName(Scanner myScanner) {
        System.out.println("Ingrese su nombre: ");
        String nameUser = myScanner.nextLine(); 
        return nameUser;
    }

    // Obteniendo la edad del usuario
    public static int inputAge(Scanner myScanner) {
        System.out.println("Ingrese su nombre: ");
        int ageUser = myScanner.nextInt(); 
        return ageUser;
    }

    // Imprimiendo el nombre y la edad del usuario
    public static void printNameAndAge(String nameUser, int ageUser) {
        System.out.println("Hola " + nameUser + ", tienes " + ageUser + " anios");
    }
}
