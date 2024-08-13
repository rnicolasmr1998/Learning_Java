package Clase_15_Actividad_Integradora_III;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GenerandoContrasenia {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
          try {
              System.out.println("Ingrese una longitud de cadena: ");
              int longitudCadena = myScanner.nextInt();
              if(longitudCadena == 0) {
                System.out.println("El número ingresado debe ser diferente de cero");
                continue;
              } else if(longitudCadena < 0) {
                System.out.println("El número ingresado debe ser mayor a cero");
                continue;
              }
              char[] myArray = new char[longitudCadena];
              int cantidadMayusculas = 0;
              int cantidadMinusculas = 0;
              int cantidadNumeros = 0;
              String contrasenia = "";
              do {
                for (int i = 0; i < myArray.length; i++) {
                    int numeroAleatorio = (int) (Math.random() * 3);
                    switch (numeroAleatorio) {
                        case 0:
                            numeroAleatorio = (int) (Math.random() * 9 + 48);
                            myArray[i] = (char) numeroAleatorio;
                            cantidadNumeros++;
                            break;
                        case 1:
                            numeroAleatorio = (int) (Math.random() * 25 + 65);
                            myArray[i] = (char) numeroAleatorio;
                            cantidadMayusculas++;
                            break; 
                        case 2:
                            numeroAleatorio = (int) (Math.random() * 25 + 97);
                            myArray[i] = (char) numeroAleatorio;
                            cantidadMinusculas++;
                            break;
                    }
                }
                // contrasenia = new String(myArray);
                for (int i = 0; i < myArray.length; i++) {
                    contrasenia = contrasenia.concat(String.valueOf(myArray[i]));
                }
            } while (cantidadNumeros == 0 || cantidadMayusculas == 0 || cantidadMinusculas == 0);
            System.out.println("La contrasenia es: " + contrasenia);
            myScanner.close();
            break;
          }  catch (InputMismatchException e) {
                System.out.println("Error: el valor ingresado no corresponde a un numero");
                myScanner.next();
          }
        };       
    }
}
