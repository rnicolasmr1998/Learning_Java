package Clase_19_Metodos_I;
import java.util.Scanner;

public class EjercicioInicial {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nameUser = myScanner.nextLine();
        System.out.println("Ingrese su edad:");
        int ageUser = myScanner.nextInt();
        printName(nameUser);
        printNameAndAge(nameUser, ageUser);
        myScanner.close();        
    }

    public static void printName(String name) {
        name = name.toUpperCase();
        System.out.println("Bienvenido " + name);
    }

    public static void printNameAndAge(String name, int age) {
        System.out.println("Hola " + name.toUpperCase() + " tienes " + age + " anios");
    }
}
