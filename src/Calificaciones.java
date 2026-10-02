
import java.util.Scanner;
import java.util.InputMismatchException;
public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cali1, cali2, cali3, prom;

        try {
            System.out.println("Escriba la primer calificacion");
            cali1 = scanner.nextDouble();
            System.out.println("Escriba la segunda calificacion");
            cali2 = scanner.nextDouble();
            System.out.println("Escriba la tercer calificacion");
            cali3 = scanner.nextDouble();

            prom = (cali1 + cali2 + cali3) / 3;
            System.out.println("El promedio es: " + prom);

        } catch (InputMismatchException ie) {
            System.out.println("Ingresa una calificacion numerica");
        }
    }
}