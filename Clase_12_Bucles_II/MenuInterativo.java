package Clase_12_Bucles_II;
import java.util.Scanner;
public class MenuInterativo {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int opcionMenu = 0;
        try {
            while (opcionMenu != 5){
                System.out.println("Elija una de las siguientes opciones: ");
                System.out.println("1: Comprar productos");
                System.out.println("2: Realziar devolución");
                System.out.println("3: Ver historial de compras");
                System.out.println("4: Preguntas frecuentes");
                System.out.println("5: Salir");
                opcionMenu = miScanner.nextInt();
                if (opcionMenu > 5 || opcionMenu < 1) {
                    System.out.println("Opcion incorrecta");                
                }
            }            
        } catch (Exception e) {
            System.out.println("Error: El valor de la opcion no es un numero");
        } finally {
            miScanner.close();
        }
    }
}
