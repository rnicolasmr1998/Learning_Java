import java.util.Scanner;

public class AreaPerimetroFigura {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Elegir una opción: ");
        System.out.println("1: Circulo");
        System.out.println("2: Cuadrado");

        int miOpcion = miScanner.nextInt();
        switch (miOpcion) {
            case 1 -> {
                System.out.println("Ingresa el valor del radio: ");
                double radioCirculo = miScanner.nextDouble();
                System.out.println("Escoge entre las siguientes opciones: ");
                System.out.println("1: Perimetro");
                System.out.println("2: Area");
                int resultadoCirculo = miScanner.nextInt();
                String resultado = resultadoCirculo == 1 ? ("El perimetro es: " + Math.PI*2*radioCirculo) : 
                resultadoCirculo == 2 ? ("El area es: " + Math.pow(radioCirculo, 2) * Math.PI) : ("El valor ingresado es incorrecto");
                System.out.println(resultado);
            }
            case 2 -> {
                System.out.println("Ingresa el valor de la base: ");
                double baseRectangulo = miScanner.nextDouble();
                System.out.println("Ingresa el valor de la altura: ");
                double alturaRectangulo = miScanner.nextDouble();
                System.out.println("Escoge entre las siguientes opciones: ");
                System.out.println("1: Perimetro");
                System.out.println("2: Area");
                int resultadoRectangulo = miScanner.nextInt();
                String resultado = resultadoRectangulo == 1 ? ("El perimetro es: " + 2*(baseRectangulo+alturaRectangulo)) : 
                resultadoRectangulo == 2 ? ("El area es: " + baseRectangulo*alturaRectangulo) : ("El valor ingresado es incorrecto");
                System.out.println(resultado);
            }
            default -> System.out.println("El valor ingresado es incorrecto");
        }
        miScanner.close();
    }
}
