import java.util.Scanner;

public class ContarOcurrencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Frase de inicialización
        System.out.println("Ingresa una frase: ");
        String frase = scanner.nextLine();

        // Ajustar la longitud de la frase a 50 caracteres
        if (frase.length() > 50) {
            frase = frase.substring(0, 50);
        } else {
            while (frase.length() < 50) {
                frase += " ";
            }
        }

        // Crear un array de 50 caracteres
        char[] array = new char[50];
        for (int i = 0; i < frase.length(); i++) {
            array[i] = frase.charAt(i);
        }
        System.out.println("La frase es: " + frase);

        // Solicitar al usuario un carácter objetivo
        System.out.print("Ingresa un carácter objetivo: ");
        char charObjetivo = scanner.nextLine().charAt(0);

        // Contar cuántas veces aparece el carácter en el array
        int contador = 0;
        for (char c : array) {
            if (Character.toLowerCase(c) == Character.toLowerCase(charObjetivo)) {
                contador++;
            }
        }

        // Imprimir el resultado
        if (contador > 0) {
            System.out.println("El carácter \"" + Character.toLowerCase(charObjetivo) + "\" aparece " + contador + " veces.");
        } else {
            System.out.println("El carácter \"" + Character.toLowerCase(charObjetivo) + "\" no aparece en la frase.");
        }

        scanner.close();
    }
}

