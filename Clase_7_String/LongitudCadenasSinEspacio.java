package Clase_7_String;
import java.util.Scanner;

public class LongitudCadenasSinEspacio {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de su pelicula favorita: ");
        String nombrePelicula = miScanner.nextLine();
        String nombrePeliculaSinEspacios = nombrePelicula.replace(" ", "");

        System.out.println("El nombre de su pelicula favorita es: " + nombrePelicula.toUpperCase() + 
        " y tiene " + nombrePeliculaSinEspacios.length() + " caracteres de longitud sin contar espacios.");
        miScanner.close();
    }
}
