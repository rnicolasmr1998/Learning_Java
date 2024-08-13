package Clase_20_Metodos_II;
import java.util.InputMismatchException;
import java.util.Scanner;
public class FigurasGeometricas {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.println("Elija una opcion: ");
            System.out.println("1: Circulo");
            System.out.println("2: Triangulo");
            System.out.println("3: Paralelogramo");
            System.out.print("Opcion: ");
            int optionFigure = myScanner.nextInt();
            System.out.println("Elija una opcion: ");
            System.out.println("1: Perimetro");
            System.out.println("2: Area");
            System.out.print("Opcion: ");
            int optionCalculate = myScanner.nextInt();
            switch (optionFigure) {
                case 1:
                    System.out.print("Ingrese el radio del circulo: ");
                    int radioCirculo = myScanner.nextInt();
                    if (radioCirculo <= 0) {
                        System.out.println("Error: El radio no puede ser menor o igual a cero.");
                    }
                    if (optionCalculate == 1) {
                        perimetroCirculo(radioCirculo);
                    } else {
                        areaCirculo(radioCirculo);
                    }
                    break;
                case 2:
                    if (optionCalculate == 1) {
                        System.out.print("Ingrese un lado del triangulo: ");
                        int lado1Triangulo = myScanner.nextInt();
                        System.out.print("Ingrese el segundo lado del triangulo: ");
                        int lado2Triangulo = myScanner.nextInt();
                        System.out.print("Ingrese el tercer lado del triangulo: ");
                        int lado3Triangulo = myScanner.nextInt();
                        perimetroTriangulo(lado1Triangulo, lado2Triangulo, lado3Triangulo);
                    } else {
                        System.out.print("Ingrese la altura del triangulo: ");
                        int alturaTriangulo = myScanner.nextInt();
                        System.out.print("Ingrese la base del triangulo: ");
                        int baseTriangulo = myScanner.nextInt();
                        areaTriangulo(baseTriangulo, alturaTriangulo);
                    }
                    break;
                case 3:
                    if (optionCalculate == 1) {
                        System.out.print("Ingrese un lado del paralelogramo: ");
                        int lado1Paralelogramo = myScanner.nextInt();
                        System.out.print("Ingrese el segundo lado del paralelogramo: ");
                        int lado2Paralelogramo = myScanner.nextInt();
                        perimetroParalelogramo(lado1Paralelogramo, lado2Paralelogramo);
                    } else {
                        System.out.print("Ingrese la altura del paralelogramo: ");
                        int alturaParalelogramo = myScanner.nextInt();
                        System.out.print("Ingrese la base del paralelogramo: ");
                        int baseParalelogramo = myScanner.nextInt();
                        areaParalelogramo(baseParalelogramo, alturaParalelogramo);
                    }
                    break;
                default:
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: El valor ingresado no es un numero");
        }
    }
    public static void perimetroCirculo(int radio) {
        double perimeterCirle = Math.PI * 2 * radio;
        System.out.println("El perimetro del circulo es: " + perimeterCirle);
    }

    public static void areaCirculo(int radioCirculo) {
        double areaCircle = Math.PI * Math.pow(radioCirculo, 2);
        System.out.println("El area del circulo es: " + areaCircle);        
    }

    public static void perimetroTriangulo(int lado1, int lado2, int lado3) {
        double perimeterTriangle = lado1 + lado2 + lado3;
        System.out.println("El perimetro del triangulo es: " + perimeterTriangle);
    }

    public static void areaTriangulo(int base, int altura) {
        double areaTriangle = (base * altura) / 2;
        System.out.println("El perimetro del triangulo es: " + areaTriangle);
    }

    public static void perimetroParalelogramo(int lado1, int lado2) {
        double perimeterParallelogram = 2 * (lado1 + lado2);
        System.out.println("El perimetro del paralelogramo es: " + perimeterParallelogram);
    }

    public static void areaParalelogramo(int base, int altura) {
        double areaParallelogram = base * altura;
        System.out.println("El area del paralelogramo es: " + areaParallelogram);
    }
}
