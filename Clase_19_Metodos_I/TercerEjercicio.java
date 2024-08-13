package Clase_19_Metodos_I;
import java.util.Scanner;
public class TercerEjercicio {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        String nameUser = inputName();
        int ageUser = inputAge();
        printNameAndAge(nameUser, ageUser);
        myScanner.close();
    }

    // Obteniendo el nombre del usuario
    public static String inputName() {
        System.out.println("Ingrese su nombre: ");
        String nameUser = myScanner.nextLine(); 
        return nameUser;
    }

    // Obteniendo la edad del usuario
    public static int inputAge() {
        System.out.println("Ingrese su nombre: ");
        int ageUser = myScanner.nextInt(); 
        return ageUser;
    }

    // Imprimiendo el nombre y la edad del usuario
    public static void printNameAndAge(String nameUser, int ageUser) {
        System.out.println("Hola " + nameUser + ", tienes " + ageUser + " anios");
    }
}
