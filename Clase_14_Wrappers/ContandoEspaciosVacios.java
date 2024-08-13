package Clase_14_Wrappers;
import java.util.Scanner;

public class ContandoEspaciosVacios {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra: ");
        String characterUser = myScanner.nextLine();
        int countWhiteSpace = 0;

        for (int i = 0; i < characterUser.length(); i++) {
            if(Character.isWhitespace(characterUser.charAt(i))){
                countWhiteSpace++;
                continue;
            }
        }
        System.out.println("La palabra " 
                            + "'"
                            + characterUser 
                            + "'"
                            + " tiene: " 
                            + countWhiteSpace 
                            + " espacios en blanco.");
        
        myScanner.close();
    }
}
