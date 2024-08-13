package Clase_16_Actividad_Integradora_IV;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GraficoBarras {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] myArray = new int[4];
        boolean condition = false;
        do {
            try {
                for (int i = 0; i < myArray.length; i++) {
                    System.out.println("Ingrese un numero del 1 al 20: ");
                    int numberUser = myScanner.nextInt();
                    if (numberUser > 20 || numberUser < 1) {
                        System.out.println("El numero ingresado esta fuera del rango");
                        condition = true;
                        break;
                    } else {
                        System.out.println("El numero " +
                                            (i + 1) + 
                                            " del array es: " +
                                            numberUser);
                        myArray[i] = numberUser;
                        condition = false;
                    }
                }

                for (int valueArray : myArray) {
                    for (int j = 0; j < valueArray + 1; j++) {
                        if (j == 0) {
                            System.out.print(valueArray + " ");
                        } else if (j == valueArray){
                            System.out.print("*\n");
                        } else {
                            System.out.print("*");
                        };
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: El valor ingresado no es un numero.");
                condition = true;
                myScanner.next();
            }
        } while (condition);
        myScanner.close();
    }
}
