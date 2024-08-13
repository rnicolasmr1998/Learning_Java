package Clase_21_Metodos_III;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioManipularOraciones {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        String phraseUser = "";
        String[] words = new String[0]; // Inicialización de words

        while (true) {
            try {
                System.out.println("Escoja una de las siguientes opciones: ");
                if (phraseUser.isEmpty()) {
                    System.out.println("1: Crear oracion");
                    System.out.println("9: Salir");
                } else {
                    System.out.println("1: Borrar oracion");
                    System.out.println("2: Cantidad de caracteres de la oración");
                    System.out.println("3: Cantidad de palabras de la oración");
                    System.out.println("4: Mostrar palabras ordenadas alfabéticamente");
                    System.out.println("5: Ingresar un número y devolver la palabra correspondiente");
                    System.out.println("6: Buscar palabra dentro de la oración");
                    System.out.println("7: Modificar palabra dentro de la oración");
                    System.out.println("8: Agregar contenido a la oración");
                    System.out.println("9: Salir");
                }

                int optionUser = myScanner.nextInt();
                myScanner.nextLine(); // Consumir la línea pendiente

                if (phraseUser.isEmpty() && (optionUser != 1 && optionUser != 9)) {
                    System.out.println("Opcion no valida. Introduzca 1 o 9.");
                    continue; // Volver al principio del bucle
                }

                switch (optionUser) {
                    case 1:
                        if (phraseUser.isEmpty()) {
                            System.out.println("Introduzca la frase: ");
                            phraseUser = myScanner.nextLine();
                            do {
                                if (phraseUser.isEmpty()) {
                                    System.out.println("Frase vacia!!! ");
                                    System.out.print("Introduzca la frase: ");
                                    phraseUser = myScanner.nextLine();
                                } else {
                                    System.out.println("La frase creada es:\n" + phraseUser);
                                    break;
                                }
                            } while (true);
                            words = phraseUser.split("\\s+"); // Actualización de words cuando se crea la frase
                        } else {
                            System.out.println("¿Esta seguro que quiere borrar la frase?");
                            System.out.println("1: Si");
                            System.out.println("2: No");
                            int optionDelete = myScanner.nextInt();
                            myScanner.nextLine(); // Consumir la línea pendiente
                            while (true) {
                                if (optionDelete == 1) {
                                    phraseUser = "";
                                    System.out.println("Frase borrada.");
                                    words = new String[0]; // Reinicialización de words cuando se borra la frase
                                    break;
                                } else if (optionDelete == 2) {
                                    break;
                                } else {
                                    System.out.println("Opcion no valida. Introduzca 1 o 2.");
                                    optionDelete = myScanner.nextInt();
                                    myScanner.nextLine(); // Consumir la línea pendiente
                                }
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Cantidad de caracteres: " + phraseUser.length());
                        break;
                    case 3:
                        System.out.println("Cantidad de palabras: " + words.length);
                        break;
                    case 4:
                        String[] sortedWords = words.clone();
                        Arrays.sort(sortedWords);
                        System.out.println("Palabras ordenadas: " + String.join(", ", sortedWords));
                        break;
                    case 5:
                        System.out.println("Ingrese un numero de 0 a " + (words.length - 1) + ": ");
                        int index = myScanner.nextInt();
                        myScanner.nextLine(); // Consumir la línea pendiente
                        if (index >= 0 && index < words.length) {
                            System.out.println("Palabra correspondiente: " + words[index]);
                        } else {
                            System.out.println("Índice fuera de rango.");
                        }
                        break;
                    case 6:
                        System.out.println("Ingrese la palabra a buscar: ");
                        String wordToSearch = myScanner.nextLine();
                        wordToSearch = wordToSearch.toLowerCase();
                        if (phraseUser.toLowerCase().contains(wordToSearch)) {
                            System.out.println("La palabra se encuentra en la oración.");
                        } else {
                            System.out.println("La palabra no se encuentra en la oración.");
                        }
                        break;
                    case 7:
                        System.out.println("Ingrese la palabra a modificar: ");
                        System.out.println("Palabra actual: " + phraseUser);
                        String wordToModify = myScanner.nextLine();
                        System.out.println("Ingrese la nueva palabra: ");
                        String newWord = myScanner.nextLine();
                        phraseUser = phraseUser.replace(wordToModify, newWord);
                        words = phraseUser.split("\\s+"); // Actualización de words después de modificar la frase
                        System.out.println("Frase modificada: " + phraseUser);
                        break;
                    case 8:
                        System.out.println("Ingrese el contenido a agregar: ");
                        String contentToAdd = myScanner.nextLine();
                        phraseUser += " " + contentToAdd;
                        words = phraseUser.split("\\s+"); // Actualización de words después de agregar contenido
                        System.out.println("Frase actualizada: " + phraseUser);
                        break;
                    case 9:
                        System.out.println("Saliendo...");
                        myScanner.close();
                        return;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero positivo.");
                myScanner.nextLine(); // Consumir la línea pendiente
                continue;
            }
        }
    }
}
