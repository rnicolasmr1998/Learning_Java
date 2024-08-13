package Clase_14_Wrappers;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ContandoDigitosNumero {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int intNumberUser;
        String characterUser;
        int numberDigits;

        while(true) {
            System.out.println("Introduzca un numero entero: ");
            try{
                intNumberUser = myScanner.nextInt();
                characterUser = String.valueOf(intNumberUser);
                numberDigits = 0;
                for (int i = 0; i < characterUser.length(); i++) {
                    if (Character.isDigit(characterUser.charAt(i))) {
                        numberDigits++;
                    }
                }
                System.out.println("El numero de digitos que tiene " +
                                    characterUser + 
                                    " es: " + 
                                    numberDigits);
                
                break;
            } catch(InputMismatchException e) {
                System.out.println("Error: El dato ingresado no es un numero entero");
                myScanner.next();
            }
        }
        myScanner.close();
    }    
}
