import java.util.Scanner;

public class FiguraGeometrica {
    public static void main(String[] args) {
        
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Escoja una opción: ");
        System.out.println("1: Circulo");
        System.out.println("2: Cuadrado");
        System.out.println("3: Triangulo");
        
        int miOpcion = miScanner.nextInt();

        switch (miOpcion) {
            case 1 -> {
                System.out.println("Ingrese el valor del radio: ");
                Double radioCirculo = miScanner.nextDouble();
                System.out.println("El area es: " + (radioCirculo*radioCirculo* Math.PI));
            }
            case 2 -> {
                System.out.println("Ingrese el valor del lado: ");
                Double ladoCuadrado = miScanner.nextDouble();
                System.out.println("El area es: " + (ladoCuadrado*ladoCuadrado));
            }
            case 3 -> {
                System.out.println("Ingrese el valor de la altura: ");
                Double alturaTriangulo = miScanner.nextDouble();
                System.out.println("Ingrese el valor de la base: ");
                Double baseTriangulo = miScanner.nextDouble();
                System.out.println("El area es: " + (alturaTriangulo*baseTriangulo/2));
            }
            default -> System.out.println("El valor ingresado es incorrecto");
        }
        
        miScanner.close();
    }
}
