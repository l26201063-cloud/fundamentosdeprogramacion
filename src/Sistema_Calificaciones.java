import java.util.Scanner;

public class Sistema_Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double MINIMO_APROBATORIO = 70;
        final double MINIMO_UNIDAD = 60;
        System.out.println("Ingresa la primera calificación:");
        double calificacion1 = scanner.nextDouble();
        System.out.println("Ingresa la segunda calificación:");
        double calificacion2 = scanner.nextDouble();
        System.out.println("Ingresa la tercera calificación:");
        double calificacion3 = scanner.nextDouble();

        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        System.out.println("Sus calificaciones obtenidas son: "
                + calificacion1 + ", " + calificacion2 + ", " + calificacion3);
        System.out.println("Su promedio es: " + promedio);

        if (promedio >= MINIMO_APROBATORIO) {
            System.out.println("Usted ha aprobado la materia");
        } else {
            System.out.println("Usted ha reprobado la materia");
        }

        if (calificacion1 < MINIMO_UNIDAD) {
            System.out.println("Deberás recursar la unidad 1");
        }
        if (calificacion2 < MINIMO_UNIDAD) {
            System.out.println("Deberás recursar la unidad 2");
        }
        if (calificacion3 < MINIMO_UNIDAD) {
            System.out.println("Deberás recursar la unidad 3");
        }
    }

}