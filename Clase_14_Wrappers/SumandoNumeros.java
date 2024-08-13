package Clase_14_Wrappers;
import java.util.Scanner;

public class SumandoNumeros {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Integer integerUser;
        Double doubleUser;
        Double sumNumbersUser;
        String characterUser;
        // Ingrese un numero entero
        while (true) {       
            try {
                System.out.println("Ingresa un numero entero");
                characterUser = myScanner.nextLine(); 
                integerUser = Integer.valueOf(characterUser);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un numero entero");                
            }
            
        }
        // Ingrese un numero decimal
        while (true) {
            try {
                System.out.println("Ingresa un numero decimal");
                characterUser = myScanner.nextLine();
                doubleUser = Double.valueOf(characterUser);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un numero decimal");
            }
            
        }

        sumNumbersUser = integerUser + doubleUser;
        System.out.println("La suma de " +
                            integerUser +
                            " y " +
                            doubleUser +
                            " es: " +
                            sumNumbersUser);
        myScanner.close();

    }    
}
