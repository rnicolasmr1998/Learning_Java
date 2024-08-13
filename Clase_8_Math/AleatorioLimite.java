package Clase_8_Math;
import java.util.Scanner;
public class AleatorioLimite {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese un número para que sea el limite inferior: ");
        double limiteInferior = miScanner.nextDouble();
        
        System.out.println("Ingrese un número para que sea el limite superior: ");
        double limiteSuperior = miScanner.nextDouble();
        
        double aleatorioRandom = limiteInferior + Math.random()*(limiteSuperior-limiteInferior);
        
        System.out.println("El numero aleatorio entre " + limiteInferior + " y " + limiteSuperior + " es: " + aleatorioRandom);
        miScanner.close();
    }
}
