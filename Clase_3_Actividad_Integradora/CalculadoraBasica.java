import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        float primerNumero = miScanner.nextFloat();

        System.out.println("Ingrese el segundo numero: ");
        float segundoNumero = miScanner.nextFloat();

        float resultado = 0;

        System.out.println("Elija una operacion: ");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Division");
        System.out.println("4: Multiplicacion");

        int operacion = miScanner.nextInt();

        switch (operacion) {
            case 1:
                    resultado = primerNumero + segundoNumero;
                break;
            case 2:
                    resultado = primerNumero - segundoNumero;
                break;
            case 3:
                    if(segundoNumero == 0) {
                        System.out.println("Error: No se puede dividir el numero por 0");
                    } else {
                        resultado = primerNumero / segundoNumero;
                    }
                break;
            case 4:
                    resultado = primerNumero * segundoNumero;
                break;
            default:
                    System.out.println("Operación incorrecta");
        }

        System.out.println("El resultado de la operación es: " + resultado);
        // if(operacion == 3 && segundoNumero ==0) {
        //     System.out.println("Error: No se puede dividir el numero por 0");
        // }
        
        // Usando operador ternario (existe un error porque te da el valor cero por defecto)

        // resultado = (operacion == 1) ? (primerNumero + segundoNumero) :
        //             (operacion == 2) ? (primerNumero - segundoNumero) :
        //             (operacion == 3) ? (primerNumero * segundoNumero) :
        //             (operacion == 4) ? (primerNumero / segundoNumero) : 0;
        
        // if (operacion < 1 || operacion > 4) {
        //     System.out.println("Operacion no valida");
        // } else {
        //     System.out.println(resultado);
        // }

        miScanner.close();

    }
}
