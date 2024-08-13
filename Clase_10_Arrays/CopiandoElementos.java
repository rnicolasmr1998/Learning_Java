package Clase_10_Arrays;
import java.util.Scanner;

public class CopiandoElementos {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int[] myArray = {1,2,3};

        System.out.println("Ingrese un numero entero: ");
        int numeroUno = miScanner.nextInt();
        
        System.out.println("Ingrese un numero entero: ");
        int numeroDos = miScanner.nextInt();

        int[] myArrayCopia = {myArray[0],myArray[1],myArray[2], numeroUno, numeroDos};

        System.out.println("Los valores del array antiguo son: " + 
        myArray[0] + ", " + myArray[1] + ", " + myArray[2]);

        System.out.println("Los valores del nuevo array son: " + 
        myArrayCopia[0] + ", " + myArrayCopia[1] + ", " + myArrayCopia[2] +
        ", " + myArrayCopia[3] + ", " + myArrayCopia[4]);
        
        miScanner.close();
    }
}
