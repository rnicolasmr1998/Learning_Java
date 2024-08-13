package Clase_10_Arrays;

public class SumandoElementos {
    public static void main(String[] args) {
        int[] primerArray = {1, 5, 25};
        int sumaArray = 0;
        for (int i = 0; i < primerArray.length; i++) {
            sumaArray += primerArray[i];
        }
        System.out.println("La suma de " + primerArray[0] + ", " + primerArray[1] 
        + " y " + primerArray[2] + " es: " + sumaArray);
    }
}
