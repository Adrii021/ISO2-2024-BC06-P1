package Problema1;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de gestión de personas.");

        try {
            // Leer datos de la persona
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese los apellidos: ");
            String apellidos = scanner.nextLine();

            LocalDate fechaNacimiento = null;
            while (fechaNacimiento == null) {
                try {
                    System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
                    fechaNacimiento = LocalDate.parse(scanner.nextLine());
                } catch (DateTimeParseException e) {
                    System.out.println("Formato de fecha inválido. Use el formato YYYY-MM-DD.");
                }
            }

            System.out.print("Ingrese la nacionalidad: ");
            String nacionalidad = scanner.nextLine();

            System.out.print("Ingrese la titulación académica: ");
            String titulacion = scanner.nextLine();

            System.out.print("Ingrese la certificación de inglés: ");
            String certificacionIngles = scanner.nextLine();

            String telefono = null;
            while (telefono == null) {
                System.out.print("Ingrese el número de teléfono: ");
                telefono = scanner.nextLine();
                if (telefono.length() != 9 || !telefono.matches("\\d+")) {
                    System.out.println("El número de teléfono debe tener exactamente 9 cifras y contener solo números.");
                    telefono = null;
                }
            }

            String correoElectronico = null;
            while (correoElectronico == null) {
                System.out.print("Ingrese el correo electrónico: ");
                correoElectronico = scanner.nextLine();
                if (!correoElectronico.endsWith("@gmail.com")) {
                    System.out.println("El correo electrónico debe terminar en @gmail.com.");
                    correoElectronico = null;
                }
            }

            // Crear el objeto Persona
            Persona persona = new Persona(nombre, apellidos, fechaNacimiento, nacionalidad, titulacion,
                                           certificacionIngles, telefono, correoElectronico);

            // Mostrar resultados
            System.out.println("\nResultados:");
            System.out.println("Es mayor de edad: " + persona.esMayorDeEdad());
            System.out.println("Es europeo: " + persona.esEuropeo());
            System.out.println("Puede matricularse en doctorado: " + persona.puedeMatricularseDoctorado());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
