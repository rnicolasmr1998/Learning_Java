package Clase_10_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class OrdenandoNombres {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese un nombre: ");
        String primerNombre = miScanner.nextLine();
        
        System.out.println("Ingrese un nombre: ");
        String segundoNombre = miScanner.nextLine();

        System.out.println("Ingrese un nombre: ");
        String tercerNombre = miScanner.nextLine();

        System.out.println("Ingrese un nombre: ");
        String cuartoNombre = miScanner.nextLine();

        String[] arrayNombres = {primerNombre, segundoNombre, tercerNombre, cuartoNombre};

        Arrays.sort(arrayNombres);

        System.out.println("Los nombres en orden son: " + Arrays.toString(arrayNombres));

        miScanner.close();
    }
    
}
