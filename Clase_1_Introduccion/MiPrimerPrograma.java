import java.util.Scanner;

public class MiPrimerPrograma {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);
        System.out.print("¿Cual es su nombre?: ");
        String yourName = miScanner.nextLine();
        System.out.print("¿Cuantos anios tienes?: ");
        int yourAge = miScanner.nextInt();
        System.out.println("Mi nombre es " + yourName + ". Tengo "+ yourAge + " años y estoy emocionado por aprender Java.");
        miScanner.close();
    }
}

