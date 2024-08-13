package Clase_10_Arrays;

import java.util.Scanner;

public class EncontrandoMaximo {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        try {
            int[] arrayUsuario = new int[5];
            int maximoArray = 0;
            for (int i = 0; i < arrayUsuario.length; i++) {
                System.out.println("Ingrese un numero entero: ");
                int numeroUsuario = miScanner.nextInt();
                arrayUsuario[i] = numeroUsuario;
                
                if(arrayUsuario[i] > maximoArray) {
                    maximoArray = arrayUsuario[i];
                }
            };
            System.out.println("El valor maximo del array es: " + maximoArray);
        } catch (Exception e) {
            System.out.println("Error: Los datos ingresados son incorrectos.");
        } finally {
            miScanner.close();
        }
    }
}
