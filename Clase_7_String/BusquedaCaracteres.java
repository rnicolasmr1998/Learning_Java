package Clase_7_String;
import java.util.Scanner;

public class BusquedaCaracteres {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese su color favorito: ");
        String colorFavorito = miScanner.nextLine();

        System.out.println("Ingrese un caracter: ");
        String caracterIngresado = miScanner.nextLine();
        int ubicacionCaracter = colorFavorito.indexOf(caracterIngresado);
        if (ubicacionCaracter == -1) {
            System.out.println("El caracter " + caracterIngresado + " no se encuentra en la palabra " + colorFavorito);
        } else {
            System.out.println("El caracter " + caracterIngresado + " se encuentra en la posicion " + ubicacionCaracter +
            " de la palbra " + colorFavorito);
        }
        miScanner.close();
    }
}
