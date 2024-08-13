package Clase_20_Metodos_II;
import java.util.Scanner;
public class EsPar {
    
    static Scanner myScanner = new Scanner(System.in);
    // public static void main(String[] args) {
    //         Scanner pepe = new Scanner(System.in);
    //         Integer numero = null;
    //         System.out.println("Por favor ingrese un número:");
    //         do {
    //             try {
    //                 numero = pepe.nextInt();
    //             } catch (Exception e) {
    //                 pepe.nextLine();
    //                 System.out.println("No ingresó un número, intente nuevamente:");
    //             }
    //         } while (numero == null);
    //         if (numero % 2 == 0) {
    //             System.out.println("El "+numero+" es par");
    //         }
    //     }
    public static void main(String[] args) {
        Integer numberUser = null;
        do {
            try {
                numberUser = solicitarNumero();    
            } catch (Exception e) {
                myScanner.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");
            }
        } while (numberUser == null);
        esPar(numberUser);
    }        

    public static int solicitarNumero() {
        System.out.println("Ingresa un numero entero");
        int numberUser = myScanner.nextInt();
        return numberUser;
    }

    public static void esPar(int input){
        if(input % 2 == 0) {
            System.out.println("El numero " + input + " es par.");
        } else {
            System.out.println("El numero " + input + " es impar.");
        }
    }

}
