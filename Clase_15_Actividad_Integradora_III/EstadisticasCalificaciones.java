package Clase_15_Actividad_Integradora_III;
// import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EstadisticasCalificaciones {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int longitudCadena;
        while (true) {
            try {
                System.out.println("Ingrese el tamaño del array: ");
                longitudCadena = myScanner.nextInt();

                if (longitudCadena <= 0) {
                    System.out.println("El tamaño del array debe ser un número positivo mayor a cero.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero positivo.");
                myScanner.next();
            }
        }

        String[] myArray = new String[longitudCadena];
        int notasDesaprobadas = 0;
        int notasAprobadas = 0;
        int notasExcelentes =0;

        for (int i = 0; i < longitudCadena; i++) {
            double notaAleatoria = Math.random() * 20;
            notaAleatoria = Math.round(notaAleatoria * 100.0) / 100.0;
            if(notaAleatoria <= 10.50) {
                notasDesaprobadas++;
            } else if(notaAleatoria <= 15) {
                notasAprobadas++;
            } else {
                notasExcelentes++;
            }
            myArray[i] = String.valueOf(notaAleatoria);
        }
        Double[] arregloNotasDesaprobadas = new Double[notasDesaprobadas];
        Double[] arregloNotasAprobadas = new Double[notasAprobadas];
        Double[] arregloNotasExcelentes = new Double[notasExcelentes];
        Double sumaNotasDesaprobadas = 0.0;
        Double sumaNotasAprobadas = 0.0;
        Double sumaNotasExcelentes = 0.0;
        notasDesaprobadas = 0;
        notasAprobadas = 0;
        notasExcelentes =0;

        for (int i = 0; i < longitudCadena; i++) {
            if(Double.valueOf(myArray[i]) <= 10.50) {
                arregloNotasDesaprobadas[notasDesaprobadas] = Double.valueOf(myArray[i]);
                sumaNotasDesaprobadas += Double.valueOf(myArray[i]);
                notasDesaprobadas++;
            } else if(Double.valueOf(myArray[i]) <= 15) {
                arregloNotasAprobadas[notasAprobadas] = Double.valueOf(myArray[i]);
                sumaNotasAprobadas += Double.valueOf(myArray[i]);
                notasAprobadas++;
            } else {
                arregloNotasExcelentes[notasExcelentes] = Double.valueOf(myArray[i]);
                sumaNotasExcelentes += Double.valueOf(myArray[i]);
                notasExcelentes++;
            }
        }
        System.out.println(sumaNotasAprobadas);
        System.out.println(sumaNotasDesaprobadas);
        System.out.println(sumaNotasExcelentes);

        if(notasAprobadas == 0 & notasDesaprobadas == 0) {
            System.out.println("No hay notas aprobadas o desaprobadas");
            double promedioNotasExcelentes = sumaNotasExcelentes / notasExcelentes;
            System.out.println("La cantidad de notas Excelentes es: " + 
                                notasExcelentes + 
                                " cuyas notas son: " + 
                                Arrays.toString(arregloNotasExcelentes) + 
                                " con un promedio de: " +
                                promedioNotasExcelentes);
        } else if(notasAprobadas == 0) {
            System.out.println("No hay notas aprobadas");
            double promedioNotasDesaprobadas = sumaNotasDesaprobadas / notasDesaprobadas;
            double promedioNotasExcelentes = sumaNotasExcelentes / notasExcelentes;
            System.out.println("La cantidad de notas Desaprobadas es: " + 
                                notasDesaprobadas + 
                                " cuyas notas son: " + 
                                Arrays.toString(arregloNotasDesaprobadas) + 
                                " con un promedio de: " +
                                promedioNotasDesaprobadas);
            System.out.println("La cantidad de notas Excelentes es: " + 
                                notasExcelentes + 
                                " cuyas notas son: " + 
                                Arrays.toString(arregloNotasExcelentes) + 
                                " con un promedio de: " +
                                promedioNotasExcelentes);
        } else if(notasAprobadas == 0 & notasExcelentes == 0) {
            System.out.println("No hay notas aprobadas ni excelentes");
            double promedioNotasDesaprobadas = sumaNotasDesaprobadas / notasDesaprobadas;
            System.out.println("La cantidad de notas Desaprobadas es: " + 
                                notasDesaprobadas + 
                                " cuyas notas son: " + 
                                Arrays.toString(arregloNotasDesaprobadas) + 
                                " con un promedio de: " +
                                promedioNotasDesaprobadas);
        } else if(notasDesaprobadas == 0) {
            System.out.println("No hay notas desaprobadas");
            double promedioNotasAprobadas = sumaNotasAprobadas / notasAprobadas;
            double promedioNotasExcelentes = sumaNotasExcelentes / notasExcelentes;
            System.out.println("La cantidad de notas Aprobadas es: " + 
                                notasAprobadas + 
                                " cuyas notas son: " + 
                                Arrays.toString(arregloNotasAprobadas) + 
                                " con un promedio de: " +
                                promedioNotasAprobadas);
            System.out.println("La cantidad de notas Excelentes es: " + 
                                notasExcelentes + 
                                " cuyas notas son: " + 
                                Arrays.toString(arregloNotasExcelentes) + 
                                " con un promedio de: " +
                                promedioNotasExcelentes);
        } else if(notasExcelentes == 0) {
            System.out.println("No hay notas excelentes");
            double promedioNotasDesaprobadas = sumaNotasDesaprobadas / notasDesaprobadas;
            double promedioNotasAprobadas = sumaNotasAprobadas / notasAprobadas;
            System.out.println("La cantidad de notas Desaprobadas es: " + 
                                notasDesaprobadas + 
                                " cuyas notas son: " + 
                                Arrays.toString(arregloNotasDesaprobadas) + 
                                " con un promedio de: " +
                                promedioNotasDesaprobadas);
            System.out.println("La cantidad de notas Aprobadas es: " + 
                                notasAprobadas + 
                                " cuyas notas son: " + 
                                Arrays.toString(arregloNotasAprobadas) + 
                                " con un promedio de: " +
                                promedioNotasAprobadas);
        } else if(notasExcelentes == 0 & notasDesaprobadas == 0) {
            System.out.println("No hay notas desaprobados ni excelentes");
            double promedioNotasAprobadas = sumaNotasAprobadas / notasAprobadas;

            System.out.println("La cantidad de notas Aprobadas es: " + 
                                notasAprobadas + 
                                " cuyas notas son: " + 
                                Arrays.toString(arregloNotasAprobadas) + 
                                " con un promedio de: " +
                                promedioNotasAprobadas);
        } else {
            double promedioNotasDesaprobadas = sumaNotasDesaprobadas / notasDesaprobadas;
            double promedioNotasAprobadas = sumaNotasAprobadas / notasAprobadas;
            double promedioNotasExcelentes = sumaNotasExcelentes / notasExcelentes;
            System.out.println("La cantidad de notas Desaprobadas es: " + 
                                notasDesaprobadas + 
                                " cuyas notas son: " + 
                                Arrays.toString(arregloNotasDesaprobadas) + 
                                " con un promedio de: " +
                                promedioNotasDesaprobadas);
            System.out.println("La cantidad de notas Aprobadas es: " + 
                                notasAprobadas + 
                                " cuyas notas son: " + 
                                Arrays.toString(arregloNotasAprobadas) + 
                                " con un promedio de: " +
                                promedioNotasAprobadas);
            System.out.println("La cantidad de notas Excelentes es: " + 
                                notasExcelentes + 
                                " cuyas notas son: " + 
                                Arrays.toString(arregloNotasExcelentes) + 
                                " con un promedio de: " +
                                promedioNotasExcelentes);

        }
        myScanner.close();
    }
}
