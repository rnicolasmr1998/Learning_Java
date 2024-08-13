import java.util.Scanner;

public class EstadoSatisfaccion {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Califique su experiencia en EGG: ");
        System.out.println("1: Muy deficiente");
        System.out.println("2: Deficiente");
        System.out.println("3: Suficiente");
        System.out.println("4: Notable");
        System.out.println("5: Sobresaliente");
        
        int miExperiencia = miScanner.nextInt();

        switch (miExperiencia) {
            case 1:
                System.out.println("Su experiencia en Egg es: Muy deficiente");
                break;
            case 2:
                System.out.println("Su experiencia en Egg es: Deficiente");
                break;
            case 3:
                System.out.println("Su experiencia en Egg es: Suficiente");
                break;
            case 4:
                System.out.println("Su experiencia en Egg es: Notable");
                break;
            case 5:
                System.out.println("Su experiencia en Egg es: Sobresaliente");
                break;
            default:
                System.out.println("El valor ingresado es incorrecto");
                break;
        };
        miScanner.close();
    }
}
