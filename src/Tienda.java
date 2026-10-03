import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        double monto, descuentotipo, porcentajetipo, descuentoadicional, total;
        int tipo;

        final double CLIENTE_NORMAL = 0.00;
        final double CLIENTE_FRECUENTE = 0.10;
        final double CLIENTE_VIP = 0.20;
        final double ADICIONAL = 0.05;
        final double MONTO_MIN_AD = 2000;

        System.out.println("Ingresa tu nombre:");
        nombre = scanner.nextLine();

        System.out.println("Escribe el monto de la compra:");
        monto = scanner.nextDouble();

        System.out.println("Escribe tu tipo de cliente (1 = Normal, 2 = Frecuente, 3 = VIP):");
        tipo = scanner.nextInt();

        if (monto <= 0) {
            System.out.println("El monto debe ser mayor a cero");
        } else if (tipo < 1 || tipo > 3) {
            System.out.println("Tipo de cliente inválido");
        } else {
            porcentajetipo = CLIENTE_NORMAL;

            if (tipo == 2) {
                porcentajetipo = CLIENTE_FRECUENTE;
            } else if (tipo == 3) {
                porcentajetipo = CLIENTE_VIP;
            }

            descuentotipo = monto * porcentajetipo;
            descuentoadicional = 0;

            if (monto > MONTO_MIN_AD) {
                descuentoadicional = monto * ADICIONAL;
            }

            total = monto - descuentotipo - descuentoadicional;

            System.out.println("RESUMEN DE COMPRA");
            System.out.println("Cliente: " + nombre);
            System.out.println("Monto original: $" + monto);
            System.out.println("Descuento por tipo de cliente: $" + descuentotipo);
            System.out.println("Descuento adicional: $" + descuentoadicional);
            System.out.println("Total a pagar: $" + total);
        }
    }
}