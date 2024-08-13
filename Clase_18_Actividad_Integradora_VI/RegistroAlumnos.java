package Clase_18_Actividad_Integradora_VI;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class RegistroAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[0];
        Double[] notas = new Double[0];
        int count = 0; // Contador de alumnos registrados

        while (true) {
            try {
                // Mostrar el menú
                System.out.println("\nSeleccione una opción:");
                System.out.println("1: Registrar alumno");
                System.out.println("2: Mostrar todos los alumnos");
                System.out.println("3: Mostrar promedio de notas");
                System.out.println("4: Buscar alumno por nombre");
                System.out.println("5: Modificar nota por nombre");
                System.out.println("6: Eliminar alumno por nombre");
                System.out.println("7: Salir");
                System.out.print("Opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la línea pendiente

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el nombre del alumno: ");
                        String nombre = scanner.nextLine().toUpperCase().trim();
                        if (nombre.isEmpty()) {
                            System.out.println("El nombre no puede estar vacío.");
                            break;
                        }
                        System.out.print("Ingrese la nota del alumno (0.00 a 20.00): ");
                        double nota = scanner.nextDouble();
                        scanner.nextLine(); // Consumir la línea pendiente
                        if (nota < 0.0 || nota > 20.0) {
                            System.out.println("La nota debe estar entre 0.00 y 20.00.");
                            break;
                        }
                        // Ampliar el tamaño de los arrays
                        nombres = Arrays.copyOf(nombres, count + 1);
                        notas = Arrays.copyOf(notas, count + 1);
                        nombres[count] = nombre;
                        notas[count] = nota;
                        count++;
                        System.out.println("Alumno registrado con éxito.");
                        break;

                    case 2:
                        System.out.println("Lista de alumnos:");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + nombres[i] + " - Nota: " + notas[i]);
                        }
                        break;

                    case 3:
                        if (count == 0) {
                            System.out.println("No hay alumnos registrados.");
                            break;
                        }
                        double sumaNotas = 0;
                        for (int i = 0; i < count; i++) {
                            sumaNotas += notas[i];
                        }
                        double promedio = sumaNotas / count;
                        System.out.println("Promedio de notas: " + promedio);
                        break;

                    case 4:
                        System.out.print("Ingrese el nombre del alumno a buscar: ");
                        String nombreBusqueda = scanner.nextLine().toUpperCase().trim();
                        boolean encontrado = false;
                        for (int i = 0; i < count; i++) {
                            if (nombres[i].equalsIgnoreCase(nombreBusqueda)) {
                                System.out.println("Alumno: " + nombres[i] + " - Nota: " + notas[i]);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Alumno no encontrado.");
                        }
                        break;

                    case 5:
                        System.out.print("Ingrese el nombre del alumno para modificar la nota: ");
                        String nombreModificar = scanner.nextLine().trim();
                        boolean modificado = false;
                        for (int i = 0; i < count; i++) {
                            if (nombres[i].equalsIgnoreCase(nombreModificar)) {
                                System.out.print("Ingrese la nueva nota (0.00 a 20.00): ");
                                double nuevaNota = scanner.nextDouble();
                                scanner.nextLine(); // Consumir la línea pendiente
                                if (nuevaNota < 0.0 || nuevaNota > 20.0) {
                                    System.out.println("La nota debe estar entre 0.00 y 10.00.");
                                } else {
                                    notas[i] = nuevaNota;
                                    System.out.println("Nota modificada con éxito.");
                                }
                                modificado = true;
                                break;
                            }
                        }
                        if (!modificado) {
                            System.out.println("Alumno no encontrado.");
                        }
                        break;

                    case 6:
                        System.out.print("Ingrese el nombre del alumno para eliminar: ");
                        String nombreEliminar = scanner.nextLine().toUpperCase().trim();
                        boolean eliminado = false;
                        for (int i = 0; i < count; i++) {
                            if (nombres[i].equalsIgnoreCase(nombreEliminar)) {
                                // Desplazar los elementos para eliminar el alumno
                                for (int j = i; j < count - 1; j++) {
                                    nombres[j] = nombres[j + 1];
                                    notas[j] = notas[j + 1];
                                }
                                count--;
                                nombres = Arrays.copyOf(nombres, count);
                                notas = Arrays.copyOf(notas, count);
                                System.out.println("Alumno eliminado con éxito.");
                                eliminado = true;
                                break;
                            }
                        }
                        if (!eliminado) {
                            System.out.println("Alumno no encontrado.");
                        }
                        break;

                    case 7:
                        System.out.println("Saliendo del programa...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.nextLine(); // Consumir la línea pendiente
            }
        }
    }
}


