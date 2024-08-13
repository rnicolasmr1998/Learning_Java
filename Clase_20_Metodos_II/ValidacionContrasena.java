package Clase_20_Metodos_II;
import java.util.Scanner;

public class ValidacionContrasena {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            System.out.println("Ingrese una contraseña: ");
            String contrasena = scanner.nextLine();

            String resultadoValidacion = esSegura(contrasena);
            if (resultadoValidacion.isEmpty()) {
                System.out.println("La contraseña es segura.");
                return;
            } else {
                System.out.println("La contraseña no es segura." + resultadoValidacion);
                continue;
            }
        } while (true);
    }

    public static String esSegura(String contrasena) {
        String errores = "";

        if (!tieneLongitudCorrecta(contrasena)) {
            errores += "\n- La contraseña debe tener al menos 8 caracteres.";
        }
        if (!tieneMayuscula(contrasena)) {
            errores += "\n- La contraseña debe contener al menos una letra mayúscula.";
        }
        if (!tieneMinuscula(contrasena)) {
            errores += "\n- La contraseña debe contener al menos una letra minúscula.";
        }
        if (!tieneNumero(contrasena)) {
            errores += "\n- La contraseña debe contener al menos un número.";
        }
        if (!tieneCaracterEspecial(contrasena)) {
            errores += "\n- La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).";
        }

        return errores;
    }

    public static boolean tieneLongitudCorrecta(String contrasena) {
        return contrasena.length() >= 8;
    }

    public static boolean tieneMayuscula(String contrasena) {
        for (int i = 0; i < contrasena.length(); i++) {
            if (Character.isUpperCase(contrasena.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneMinuscula(String contrasena) {
        for (int i = 0; i < contrasena.length(); i++) {
            if (Character.isLowerCase(contrasena.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneNumero(String contrasena) {
        for (int i = 0; i < contrasena.length(); i++) {
            if (Character.isDigit(contrasena.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneCaracterEspecial(String contrasena) {
        String caracteresEspeciales = "/!@#$%^&*()-+";
        for (int i = 0; i < contrasena.length(); i++) {
            if (caracteresEspeciales.contains(Character.toString(contrasena.charAt(i)))) {
                return true;
            }
        }
        return false;
    }
}
