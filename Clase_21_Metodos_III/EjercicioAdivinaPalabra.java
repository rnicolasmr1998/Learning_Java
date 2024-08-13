package Clase_21_Metodos_III;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioAdivinaPalabra {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] animalsArrays = {"ELEFANTE", "CANGURO", "MURCIELAGO",
                                  "JIRAFA", "MANATI", "LEOPARDO", 
                                  "LORO", "TARANTULA", "DELFIN",
                                  "CAPIBARA", "RINOCERONTE", "CONDOR"};
        int numberRandom = numeroAleatorio(animalsArrays);
        String wordAnimal = animalsArrays[numberRandom];

        while(true) {
            try {
                System.out.println("Elija una opción: ");
                System.out.println("1: Jugar");
                System.out.println("2: Salir");
                System.out.print("Introduce la opción: ");
                int optionUser = myScanner.nextInt();
                switch (optionUser) {
                    case 1:
                        adivinarPalabra(wordAnimal);
                        numberRandom = numeroAleatorio(animalsArrays);
                        wordAnimal = animalsArrays[numberRandom];
                        break;
                    case 2:
                        System.out.println("Saliendo del juego ...");
                        return;
                    default:
                        System.out.println("Error: Debe elegir la opción 1 o 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: El valor colocado no es un número.");
                myScanner.nextLine();
            }
        }
    }

    public static void adivinarPalabra(String word) {
        String wordPista = "";
        int numberAttempts = 5;
        for (int i = 0; i < word.length(); i++) {
            wordPista += "_ ";
        }

        System.out.println("El juego consiste en adivinar la palabra que corresponde a un animal.");
        System.out.println("Tener en cuenta: ");
        System.out.println("- Tienes como máximo 5 intentos para adivinar la palabra.");
        System.out.println("- Puedes elegir la opción de verificar si una letra está en la palabra.");
        System.out.println("- Si se te acaban los intentos y no has adivinado la palabra, pierdes.");
        
        while (true) {
            if (numberAttempts == 0) {
                System.out.println("¡Perdiste! Te quedaste sin intentos.");
                System.out.println("La palabra correcta era: " + word);
                return;
            }

            System.out.println("Pista: " + wordPista.trim());
            System.out.println("Número de intentos: " + numberAttempts);
            System.out.println("Elige una opción: ");
            System.out.println("1: Adivinar la palabra");
            if (numberAttempts !=1) System.out.println("2: Introducir una letra");
            System.out.print("Introduce la opción: ");
            int optionGame = myScanner.nextInt();
            myScanner.nextLine(); // Limpiar el buffer

            if (optionGame != 1 && optionGame != 2) {
                System.out.println("Alternativa no encontrada.");
                System.out.println("Debe escoger la opción 1 o 2.");
                continue;
            }

            if (optionGame == 2 && numberAttempts == 1) {
                System.out.println("Ya no puedes introducir letras.");
                System.out.println("Debe escoger la opción 1.");
                continue;
            }

            switch (optionGame) {
                case 1:
                    System.out.print("Ingresa el animal: ");
                    String optionAnimalUser = myScanner.nextLine().toUpperCase().trim();
                    if (word.equals(optionAnimalUser)) {
                        System.out.println("¡Felicidades! Has adivinado la palabra: " + optionAnimalUser);
                        return;
                    } else {
                        numberAttempts--;
                        System.out.println("Te equivocaste. Sigue intentando.");
                        System.out.println("Te quedan: " + numberAttempts + " intentos");
                    }
                    break;

                case 2:
                    numberAttempts--;
                    System.out.print("Ingresa una letra: ");
                    char optionLetterUser = myScanner.nextLine().toUpperCase().trim().charAt(0);
                    // Convertimos la pista en un array de caracteres para modificarla
                    char[] arrayCharacter = wordPista.replace(" ", "").toCharArray();
                    boolean letraEncontrada = false;

                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) == optionLetterUser) {
                            arrayCharacter[i] = optionLetterUser;
                            letraEncontrada = true;
                        }
                    }

                    if (!letraEncontrada) {
                        
                        System.out.println("No se encontró la letra.");
                    }

                    // Convertimos el array de caracteres de vuelta a String con espacios
                    wordPista = String.valueOf(arrayCharacter).replace("", " ").trim();

                    // Si el usuario adivina todas las letras
                    if (!wordPista.contains("_")) {
                        System.out.println("¡Felicidades! Has adivinado la palabra: " + word);
                        return;
                    }
                    break;
            }
        }
    }

    public static int numeroAleatorio(String[] word) {
        return (int) (Math.random() * word.length);
    }
}

