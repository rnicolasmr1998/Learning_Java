package Clase_19_Metodos_I;

import java.util.Scanner;

public class TablaMultiplicarMejorada {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myArray = new int[3];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = inputUser();
            System.out.println("La tabla de multiplicar del numero " + myArray[i] + " es: ");
            for (int j = 0; j < 11; j++) {
                imprimirTablaMultiplicar(myArray[i], j);
            }
        }
        myScanner.close();
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
