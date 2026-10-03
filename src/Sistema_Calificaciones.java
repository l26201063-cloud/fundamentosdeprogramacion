import java.util.Scanner;

public class Sistema_Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      double promedio;
        int MINIMO_APROBATORIO = 70;
        int MINIMO_UNIDAD = 60;
        System.out.println("Ingresa la primera calificacion:");
        double calificacion1 = scanner.nextDouble();
        System.out.println("Ingresa la segunda calificacion:");
        double calificacion2 = scanner.nextDouble();
        System.out.println("Ingresa la tercera calificacion:");
        double calificacion3 = scanner.nextDouble();
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        if (promedio >= 70) {
            System.out.println("Usted a aprobado la materia");
        } else if (promedio < 69) {
            System.out.println("Usted a reprobado la materia");
        }
        if (calificacion1 <= 60) {
            System.out.println("Deberas recursar la unidad 1");
        } else if (calificacion2 <= 60) {
            System.out.println("Deberas recursar la unidad 2");
        } else if (calificacion3 <=60) {
            System.out.println("Deberas recursar la unidad 3");
        }

    }
}