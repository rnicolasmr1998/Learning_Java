package Clase_20_Metodos_II;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinarNumero {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            try {
                System.out.println("Elije una opcion:");
                System.out.println("1: Juguemos");
                System.out.println("2: Salir");
                System.out.println("Opcion: ");
                int optionGame = myScanner.nextInt();
                switch (optionGame) {
                    case 1:
                        int minValue = 0;
                        int maxValue = 0;
                        boolean validInput = false;
                        while (!validInput) {
                            System.out.print("Ingrese un numero minimo: ");
                            minValue = myScanner.nextInt();
                            System.out.print("Ingrese un numero maximo: ");
                            maxValue = myScanner.nextInt();
                            if (minValue < maxValue) {
                                validInput = true;
                            } else {
                                System.out.println("Inputs invalidos. Por favor, volver a intentar.");
                            }
                        }
                        int randomNumber = numeroAleatorio(minValue, maxValue);
                        System.out.println("Juguemos a adivinar el numero.");
                        boolean controlGame = true;
                        do {
                            System.out.println(
                                "Adivina el numero mayor igual a " + 
                                minValue + " y menor o igual a " + maxValue);
                            System.out.print("Ingresa tu opción: ");
                            int inputUser = myScanner.nextInt();
                            if (randomNumber > inputUser) {
                                System.out.println("Estas por debajo del numero.");
                                myScanner.nextLine();
                            } else if (randomNumber < inputUser) {
                                System.out.println("Esta por encima del numero");
                                myScanner.nextLine();
                            } else if (inputUser > maxValue || inputUser < minValue){
                                System.out.println("El numero ingresado esta fuera del rango.");
                                myScanner.nextLine();
                            }else {
                                System.out.println("Genial. Adivinaste el numero");
                                controlGame = false;
                            }
                        } while (controlGame);
                        break;
                    case 2:
                        System.out.println("Saliendo del juego ...");
                        return;
                    default:
                        System.out.println("Error: Opcion invalida");
                        myScanner.nextLine();
                        continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: El valor ingresado no es un numero.");
                myScanner.nextLine();
                continue;
            }
        } while (true);
    }

    public static int numeroAleatorio(int minValue, int maxValue) {
        return (int) (minValue + Math.random() * (maxValue + 1 - minValue));
    }
}
