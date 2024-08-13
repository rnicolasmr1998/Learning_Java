import java.util.Scanner;

public class DiasSemana {
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
            case 1:
                System.out.println("El día de hoy es Lunes");
                break;
            case 2:
                System.out.println("El día de hoy es Martes");
                break;
            case 3:
                System.out.println("El día de hoy es Miercoles");
                break;
            case 4:
                System.out.println("El día de hoy es Jueves");
                break;
            case 5:
                System.out.println("El día de hoy es Viernes");
                break;
            case 6:
                System.out.println("El día de hoy es Sabado");
                break;
            case 7:
                System.out.println("El día de hoy es Domingo");
                break;
            default:
                System.out.println("El valor ingresado es incorrecto");
                break;
        };
        miScanner.close();
    }
}
