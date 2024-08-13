package Clase_20_Metodos_II;
import java.util.Scanner;
import java.util.Arrays;
public class ImprimirArray {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        // array unidimensional de enteros
        int[] arrayIntegerUnidimensional = {15, 88, 94, 37, 75};
        imprimirArray(arrayIntegerUnidimensional);

        // array unidimensional de strings
        String[] arrayStringUnidimensional = {"Hola", "mundo", "Java"};
        imprimirArray(arrayStringUnidimensional);

        // array bidimensional de enteros
        int[][] arrayIntegerBidimensional = {
            {54, 32, 27}, 
            {41, 95, 76}, 
            {10, 3, 89}
        };
        imprimirArray(arrayIntegerBidimensional);

        // array bidimensional de strings
        String[][] arrayBidimensionalStrings = {
            {"Hola", "Mundo"},
            {"Aprendiendo", "Java"},
            {"Sobrecarga", "Métodos"}
        };
        imprimirArray(arrayBidimensionalStrings);
    }

    public static void imprimirArray(int[] input) {
        System.out.println("El array unidimensional de enteros es: " + 
                            Arrays.toString(input));
    }

    public static void imprimirArray(String[] input) {
        System.out.println("El array unidimensional de strings es: " + 
                            Arrays.toString(input));
    }

    public static void imprimirArray(int[][] input) {
        System.out.println("El array unidimensional de strings es: " + 
                            Arrays.deepToString(input));
    }

    public static void imprimirArray(String[][] input) {
        System.out.println("El array unidimensional de strings es: " + 
                            Arrays.deepToString(input));
    }
}
