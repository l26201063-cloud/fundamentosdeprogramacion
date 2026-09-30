import java.util.Scanner;

public class jubilacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EDAD_JUBILACION = 65;
        String nombre;
        int edad = 0;
        System.out.println("Escribe tu nombre");
        nombre = scanner.nextLine();
        System.out.println("Escribe tu edad");
        edad = scanner.nextInt();

        if (edad >= EDAD_JUBILACION) {//SI edad >= 65 entonces...
            System.out.println(nombre + " tiene " + edad + " años y esta listo para jubilarse");
        }
        else if(edad>=18){
                System.out.printf(nombre + " es mayor de edad");
        }
        else { //si no
            System.out.println(nombre + " tiene " + edad + " años y aun no se puede jubilar");
            System.out.println("le faltan " + (EDAD_JUBILACION - edad) + " años para jubilarse");
        }
    }
}
