package Clase_10_Arrays;
import java.util.Scanner;

public class PromedioElementos {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        try {
            int[] arrayUsuario = new int[4];
            int sumaArray = 0;
            for (int i = 0; i < arrayUsuario.length; i++) {
                System.out.println("Ingrese un numero entero: ");
                int numeroUsuario = miScanner.nextInt();
                arrayUsuario[i] = numeroUsuario;
                sumaArray += numeroUsuario;
            }
            double promedioArray = sumaArray / arrayUsuario.length;
            System.out.println("La suma de los elementos del array es: " + sumaArray);
            System.out.println("El promedio de los elementos del array es: " + promedioArray);
        } catch (Exception e) {
            System.out.println("Error: Los datos ingresados son incorrectos.");
        } finally {
            miScanner.close();
        }
    }
}
