import java.util.Scanner;

public class CalculandoPromedio {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        try {
            float[] arrayUsuario = new float[20];
            float sumaArray = 0;
            for (int i = 0; i < arrayUsuario.length; i++) {
                System.out.println("Ingrese un numero entero: ");
                float numeroUsuario = miScanner.nextFloat();
                arrayUsuario[i] = numeroUsuario;
            }
            for(double num: arrayUsuario) {
                sumaArray += num;
            }
            float promedioArray = sumaArray / arrayUsuario.length;
            System.out.println("La suma de los elementos del array es: " + sumaArray);
            System.out.println("El promedio de los elementos del array es: " + promedioArray);
        } catch (Exception e) {
            System.out.println("Error: Los datos ingresados son incorrectos.");
        } finally {
            miScanner.close();
        }
    }
}
