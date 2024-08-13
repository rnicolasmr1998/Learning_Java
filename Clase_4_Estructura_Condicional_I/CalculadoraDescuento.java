import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Precio del producto: ");
        double miProduct = miScanner.nextDouble();

        if (miProduct >= 100) {
            miProduct = miProduct * 0.9;
            System.out.println("El precio final del producto es " + miProduct);
        } else {
            System.out.println("El precio final del producto es " + miProduct);
        }
        miScanner.close();
    }
}
