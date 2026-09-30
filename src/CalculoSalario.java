
import java.util.Scanner;
public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int HORA_MINIMA = 40;
        String nom;
        int hora;
        double pago1, pago2, hora_extra, pago_Doble;

        System.out.println("Escriba su nombre completo: ");
        nom = scanner.nextLine();
        System.out.println("Escriba horas trabajadas: ");
        hora = scanner.nextInt();
        System.out.println("Escriba su pago por hora: $");
        pago1 = scanner.nextDouble();

        if (hora <= HORA_MINIMA) {
            pago2 = hora * pago1;
            System.out.println("Su pago es de manera normal");
            System.out.println(nom + ", su pago es de: $" + pago2);
        } else {
            hora_extra = hora - HORA_MINIMA;
            pago_Doble = pago1 * 2;
            pago2 = (HORA_MINIMA * pago1) + (hora_extra * pago_Doble);
            System.out.println("Ha trabajado horas extras: " + hora_extra);
            System.out.println(nom + ", su pago es de: $" + pago2);
        }
    }
}