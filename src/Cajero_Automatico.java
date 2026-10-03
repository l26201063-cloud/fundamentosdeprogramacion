import java.util.Scanner;

public class Cajero_Automatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double LIMITE_RETIRO = 5000;

        System.out.println("Escribe tu saldo disponible:");
        double saldo = scanner.nextDouble();

        System.out.println("Escribe la cantidad que deseas retirar:");
        double retiro = scanner.nextDouble();

        if (retiro <= 0) {
            System.out.println("Cantidad inválida, debe ser mayor a cero");
        } else if (retiro > LIMITE_RETIRO) {
            System.out.println("La cantidad ingresada rebasa el límite establecido");
        } else if (retiro > saldo) {
            System.out.println("No tienes fondos suficientes. Tu saldo es: $" + saldo);
        } else {
            saldo = saldo - retiro;
            System.out.println("Retiro exitoso");
            System.out.println("La cantidad retirada fue de: $" + retiro);
            System.out.println("Saldo disponible: $" + saldo);

            if (saldo < 500) {
                System.out.println("Advertencia: tu saldo es menor a $500");
            }
        }


    }
}

