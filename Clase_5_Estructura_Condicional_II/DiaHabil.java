import java.util.Scanner;

public class DiaHabil {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Elija una opción: ");
        System.out.println("1: Lunes");
        System.out.println("2: Martes");
        System.out.println("3: Miercoles");
        System.out.println("4: Jueves");
        System.out.println("5: Viernes");
        System.out.println("6: Sabado");
        System.out.println("7: Domingo");

        int diaSemana = miScanner.nextInt();
        switch (diaSemana) {
            case 1, 2, 3, 4, 5 -> System.out.println("Día habil o laborable");
            case 6, 7 -> System.out.println("Día no habil o no laborable");
            default -> System.out.println("El valor ingresado es incorrecto");
        }

        miScanner.close();
    }
}
