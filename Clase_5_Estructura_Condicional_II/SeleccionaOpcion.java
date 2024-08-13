import java.util.Scanner;

public class SeleccionaOpcion {
    public static void main(String[] args) {
        
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Escoja una opción: ");
        System.out.println("1: Guardar");
        System.out.println("2: Cargar");
        System.out.println("3: Salir");
        
        int miOpcion = miScanner.nextInt();

        switch (miOpcion) {
            case 1 -> System.out.println("El documento ha sido guardado con exito");
            case 2 -> System.out.println("El documento se esta cargando en la pagina");
            case 3 -> System.out.println("El programa se ha cerrado con exito");
            default -> System.out.println("El valor ingresado es incorrecto");
        }
        
        miScanner.close();
    }
}
