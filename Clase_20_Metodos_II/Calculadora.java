package Clase_20_Metodos_II;
import java.util.Scanner;

public class Calculadora {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();        
    }

    public static void menu() {
        int[] myArray = new int[2];
        float resultado;
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Ingresa un valor entero: ");
            int inputUser = myScanner.nextInt();
            myArray[i] = inputUser;                
        }
        while (true) {
            System.out.println("Escoja una alternativa: ");
            System.out.println("1: Sumar");
            System.out.println("2: Resta");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Salir");
            myScanner.nextLine();
            int optionUserMenu = myScanner.nextInt();
            switch (optionUserMenu) {
                case 1:
                    resultado = myArray[0] + myArray[1];
                    System.out.println("El valor de la suma de " + myArray[0] + 
                    " y " + myArray[1] + " es: " + resultado);
                    break;
                case 2:
                    resultado = myArray[0] - myArray[1];
                    System.out.println("El valor de la resta de " + myArray[0] + 
                    " y " + myArray[1] + " es: " + resultado);
                    break;
                case 3:
                    resultado = myArray[0] * myArray[1];
                    System.out.println("El valor de la multiplicacion de " + myArray[0] + 
                    " y " + myArray[1] + " es: " + resultado);
                case 4:
                    if(myArray[1] == 0) {
                        System.out.println("No se puede dividir por cero");
                        continue;
                    } else {
                        resultado = myArray[0] / myArray[1];
                        System.out.println("El valor de la division de " + myArray[0] + 
                        " y " + myArray[1] + " es: " + resultado);
                    }
                case 5:
                    System.out.println("Cerrando menu ...");
                    return;
                default:
                    System.out.println("El valor colocado no se encuentra en las opciones.");
                    break;
            }            
        }

    }
}
