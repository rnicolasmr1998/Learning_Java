package Clase_9_Actividad_Integradora_II;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ConversionUnidadesTemperatura {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        
        try {
            System.out.println("Ingresa una temperatura: ");
            double temperaturaIngresada = miScanner.nextDouble();
            
            System.out.println("Ingrese la unidad de medida: ");
            System.out.println("1: Celsius");
            System.out.println("2: Fahrenheit");
            int unidadTemperatura = miScanner.nextInt();    
            
            if (unidadTemperatura == 1) {
                System.out.println("La temperatura es " + temperaturaIngresada + 
                " grados Celsius, equivalente a " + (temperaturaIngresada*(9/5)+32) + 
                " grados Fahrenheit.");
            } else if (unidadTemperatura == 2) {
                System.out.println("La temperatura es " + temperaturaIngresada + 
                " grados Fahrenheit, equivalente a " + (temperaturaIngresada-32)*(9/5) + 
                " grados Celsius.");
            } else {
                System.out.println("Debes seleccionar una de las alternativas.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: El valor de la temperatura no es un numero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: La opcion ingresada no es un numero.");
        } finally {
            miScanner.close();
        }
    }
}
