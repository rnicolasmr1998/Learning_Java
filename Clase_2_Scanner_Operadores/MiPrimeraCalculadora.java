import java.util.Scanner;

public class MiPrimeraCalculadora {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);
        float oneNumber = 9;
        float twoNumber = 2;
        float threeNumber = 5;
        float fourNumber = 10;
        int yourBirth = 1998;

        System.out.print("Coloque el primer numero: ");
        oneNumber = miScanner.nextFloat();

        System.out.print("Coloque el segundo numero: ");
        twoNumber = miScanner.nextFloat();

        System.out.print("Coloque el tercer numero: ");
        threeNumber = miScanner.nextFloat();

        System.out.print("Coloque el cuarto numero: ");
        fourNumber = miScanner.nextFloat();

        System.out.print("Coloque su anio de nacimiento: ");
        yourBirth = miScanner.nextInt();

        System.out.print("Coloque la altura del rectangulo: ");
        double alturaRectangulo = miScanner.nextDouble();

        System.out.print("Coloque la base del rectangulo: ");
        double baseRectangulo = miScanner.nextDouble();

        float sumNumbers = oneNumber + twoNumber;
        float subtractNumbers = oneNumber - twoNumber;
        float multiplicationNumbers = oneNumber * twoNumber;
        float divisionNumbers = oneNumber / twoNumber;
        float moduleNumbers = oneNumber % twoNumber;
        double perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);
        double areaRectangulo = baseRectangulo * alturaRectangulo;
        
        Boolean mayorOne = oneNumber > twoNumber;
        Boolean distintNumbers = oneNumber != twoNumber;
        Boolean parFirstNumber = oneNumber % 2 == 0;
        Boolean firstCondtition = (oneNumber > twoNumber) & (threeNumber > fourNumber);
        Boolean secondCondtition = (oneNumber > twoNumber) || (threeNumber > fourNumber);
        final int nowYear = 2024;
        int yourAge = nowYear - yourBirth;
        String areYouAdult = yourAge >= 18 ? "Eres mayor de edad, puedes continuar en la página" : 
                                            "Eres menor de edad, no puedes continuar en la página";

        System.out.println(areYouAdult);
        System.out.println("El primer numero ingresado es mayor al segundo numero ingresado: " + mayorOne);
        System.out.println("Los dos numeros son distintos: " + distintNumbers);
        System.out.println("El primer número es mayor al segundo y el tercer número es mayor al cuarto: " + firstCondtition);
        System.out.println("El primer número es mayor al segundo o el tercer número es mayor al cuarto: " + secondCondtition);
        System.out.println("El primer número es par: " + parFirstNumber);
        System.out.println("La suma de " + oneNumber + " y " + twoNumber + " es: " + sumNumbers);
        System.out.println("La resta de " + oneNumber + " y " + twoNumber + " es: " + subtractNumbers);
        System.out.println("La multiplicacion de " + oneNumber + " y " + twoNumber + " es: " + multiplicationNumbers);
        System.out.println("La division de " + oneNumber + " y " + twoNumber + " es: " + divisionNumbers);
        System.out.println("El modulo de " + oneNumber + " y " + twoNumber + " es: " + moduleNumbers);
        System.out.println("El perimetro de un rectangulo con base igual a " + baseRectangulo + 
                            " y altura igual a " + alturaRectangulo + " es: " + perimetroRectangulo);
        System.out.println("El area de un rectangulo con base igual a " + baseRectangulo + " y altura igual a " + 
                            alturaRectangulo + " es: " + areaRectangulo);
        miScanner.close();
    }
}
