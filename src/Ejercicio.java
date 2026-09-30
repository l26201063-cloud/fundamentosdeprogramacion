import jdk.swing.interop.SwingInterOpUtils;
import java.util.Scanner;
/*
 * INSTITUTO TECNOLOGICO DE PACHUCA
 * FUNDAMENTOS DE PROGRAMACION
 * XIMENA ITANDEHUI ESPITIA ZAMORANO
 * 23 DE SEPIEMBRE 2026
 */

public class Ejercicio {
    public static void main(String[] args) {
        String nombre, apellido, edad, carrera, semestre, promedio;
        final String ESCUELA = "Tecnologico Nacional de Mexico";
        Scanner scanner = new Scanner(System.in);
        System.out.println("REGISTRO DE ESTUDIANTE");
        System.out.println("Escribe tu nombre:");
        nombre = scanner.nextLine();
        System.out.println("Escribe tu apellido");
        apellido = scanner.nextLine();
        System.out.println("Escribe tu edad:");
        edad = scanner.nextLine();
        System.out.println("Escribe tu carrera:");
        carrera = scanner.nextLine();
        System.out.println("Escribe tu semestre");
        semestre = scanner.nextLine();
        System.out.println("Escribe tu promedio");
        promedio = scanner.nextLine();
        System.out.println("REGISTRO DE ESTUDIANTE");
        System.out.println(ESCUELA);
        System.out.println("nombre: " + nombre);
        System.out.println("apellido:" + apellido);
        System.out.println("edad:" + edad);
        System.out.println("carrera: " + carrera);
        System.out.println("semestre:" + semestre);
        System.out.println("promedio:" + promedio);
    }
}
