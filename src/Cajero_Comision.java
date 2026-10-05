import java.util.Scanner;

public class Cajero_Comision {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double COMISION = 10;
        final double LIMITE_RETIRO = 5000;
        System.out.print("Saldo disponible: ");
        double saldo = entrada.nextDouble();
        System.out.print("Cantidad a retirar: ");
        double retiro = entrada.nextDouble();
        if (retiro > 0 && retiro <= LIMITE_RETIRO && saldo >= retiro + COMISION) {
            double totalDescontado = retiro + COMISION;
            double saldoFinal = saldo - totalDescontado;
            System.out.println("\nRETIRO AUTORIZADO");
            System.out.println("Monto retirado: $" + retiro);
            System.out.println("Comisión:       $" + COMISION);
            System.out.println("Saldo final:    $" + saldoFinal);
        } else {
            String motivo;
            if (retiro <= 0) {
                motivo = "La cantidad debe ser mayor a cero.";
            } else if (retiro > LIMITE_RETIRO) {
                motivo = "La cantidad supera el límite de $" + LIMITE_RETIRO + ".";
            } else {
                motivo = "Saldo insuficiente para cubrir el retiro y la comisión de $" + COMISION + ".";
            }
            System.out.println("\nRETIRO DENEGADO ");
            System.out.println(motivo);
        }
        System.out.println("\nSaldo registrado al iniciar: $" + saldo);

    }
}
