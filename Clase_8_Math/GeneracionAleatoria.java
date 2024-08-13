package Clase_8_Math;

import java.util.Scanner;

public class GeneracionAleatoria {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entre el 1 y el 30: ");
        int numeroLimite = miScanner.nextInt();

        // Generar un número aleatorio entre 1 y numeroLimite (inclusive)
        int numeroAleatorio = (int) Math.ceil(Math.random() * (numeroLimite));

        System.out.println("Número aleatorio generado: " + numeroAleatorio);

        double numeroAleatorioRaiz = Math.sqrt(numeroAleatorio);
        System.out.println("Raiz cuadrada del numero aleatorio creado: " + numeroAleatorioRaiz);

        boolean prime = true;
        for (int i = 2; i < numeroAleatorio; i++) {
            if (numeroAleatorio % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("El numero aleatorio " + numeroAleatorio + " es primo.");
        } else {
            System.out.println("El numero aleatorio " + numeroAleatorio + " no es primo.");
        }
        miScanner.close();
    }
}

