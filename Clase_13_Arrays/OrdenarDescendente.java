package Clase_13_Arrays;
import java.util.Arrays;
public class OrdenarDescendente {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        int inicializador = 0;
        int numeroEntero;
        while (inicializador < myArray.length) {
            numeroEntero = (int) (Math.random() * 100);
            myArray[inicializador] = numeroEntero;
            inicializador++;
        }
        System.out.println("El array es: " + Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println("El array ordenado de menor a mayor es: " + Arrays.toString(myArray));
        int[] myArrayReversed = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            myArrayReversed[i] = myArray[myArray.length - 1 - i];
        }
        System.out.println("El array ordenado de mayor a menor es: " + Arrays.toString(myArrayReversed));
    }
}
