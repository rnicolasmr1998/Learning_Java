package Clase_12_Bucles_II;

import java.util.Scanner;

public class AdivinandoNumero {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 20) + 1; // El número secreto estará en el rango de 1 a 20

        try {
            int numeroUsuario;
            System.out.println("Escoge un número del 1 al 20");
            do {
                numeroUsuario = miScanner.nextInt();
                
                if (numeroUsuario < 1 || numeroUsuario > 20) {
                    System.out.println("El número ingresado excede el límite, debe ser entre 1 y 20");
                } else if (numeroUsuario < numeroSecreto) {
                    System.out.println("El número es demasiado bajo");  
                } else if (numeroUsuario > numeroSecreto) {
                    System.out.println("El número es demasiado alto");
                }
                System.out.println("Sigue intentando");
                
            } while (numeroUsuario != numeroSecreto);

            System.out.println("Felicidades, has adivinado el número");            
        } catch (Exception e) {
            System.out.println("Error: El valor colocado no es un número o un entero");
        } finally {
            miScanner.close();
        } 
    }
}

