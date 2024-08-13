package Clase_14_Wrappers;
import java.util.Scanner;

public class CadenaNumero {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena: ");
        String characterUser = myScanner.nextLine();
        try {
            Integer numberUser = Integer.valueOf(characterUser);
            System.out.println("El numero es: " + numberUser);            
        } catch (NumberFormatException e) {
            System.out.println("El valor " + characterUser + " no se puede convertir a numero entero.");
        } finally {
            myScanner.close();
        }
    }    
}
