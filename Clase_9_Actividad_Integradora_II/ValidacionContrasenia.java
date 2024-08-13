package Clase_9_Actividad_Integradora_II;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidacionContrasenia {
    public static void main(String[] args) {
        
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingrese una contrasenia con los siguientes parametros:");
        System.out.println("-La contraseña debe tener al menos 8 caracteres.");
        System.out.println("-La contraseña debe contener al menos una letra mayúscula y una letra minúscula.");
        System.out.println("-La contraseña debe contener al menos un número.");
        System.out.println("-La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).");

        String nuevaContrasenia = miScanner.nextLine();

        String resultadoValidacion = validarContrasenia(nuevaContrasenia);
        if (resultadoValidacion.isEmpty()) {
            System.out.println("La contrasenia es segura.");
        } else {
            System.out.println("La contrasenia no es segura. Verifique los siguientes puntos:");
            System.out.println(resultadoValidacion);
        }

        miScanner.close();
    }

    public static String validarContrasenia(String contrasenia) {
        StringBuilder mensajes = new StringBuilder();

        // Verifica que la contraseña tenga al menos 8 caracteres
        if (contrasenia.length() < 8) {
            mensajes.append("-La contraseña debe tener al menos 8 caracteres.\n");
        }

        // Verifica que la contraseña contenga al menos una letra mayúscula
        Pattern mayuscula = Pattern.compile("[A-Z]");
        Matcher matcherMayuscula = mayuscula.matcher(contrasenia);
        if (!matcherMayuscula.find()) {
            mensajes.append("-La contraseña debe contener al menos una letra mayúscula.\n");
        }

        // Verifica que la contraseña contenga al menos una letra minúscula
        Pattern minuscula = Pattern.compile("[a-z]");
        Matcher matcherMinuscula = minuscula.matcher(contrasenia);
        if (!matcherMinuscula.find()) {
            mensajes.append("-La contraseña debe contener al menos una letra minúscula.\n");
        }

        // Verifica que la contraseña contenga al menos un número
        Pattern numero = Pattern.compile("[0-9]");
        Matcher matcherNumero = numero.matcher(contrasenia);
        if (!matcherNumero.find()) {
            mensajes.append("-La contraseña debe contener al menos un número.\n");
        }

        // Verifica que la contraseña contenga al menos un carácter especial
        Pattern caracterEspecial = Pattern.compile("[!@#$%^&*(),.?\":{}|<>]");
        Matcher matcherCaracterEspecial = caracterEspecial.matcher(contrasenia);
        if (!matcherCaracterEspecial.find()) {
            mensajes.append("-La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).\n");
        }

        // Devuelve los mensajes de error concatenados
        return mensajes.toString();
    }
}

