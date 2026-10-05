import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TARIFA_MOTOCICLETA = 10;
        final double TARIFA_AUTOMOVIL = 20;
        final double TARIFA_CAMIONETA = 30;
        final double DESCUENTO_5_HORAS = 0.10;
        final double DESCUENTO_10_HORAS = 0.20;
        final int LIMITE_HORAS_1 = 5;
        final int LIMITE_HORAS_2 = 10;
        System.out.println("Tipo de vehículo: 1) Motocicleta  2) Automóvil  3) Camioneta");
        System.out.print("Elige una opción: ");
        int tipo = scanner.nextInt();
        System.out.print("Horas estacionado: ");
        int horas = scanner.nextInt();
        if (tipo < 1 || tipo > 3) {
            System.out.println("\nTipo de vehículo no válido.");
        } else if (horas <= 0) {
            System.out.println("\nLa cantidad de horas no es válida.");
        } else {
            String nombreVehiculo;
            double tarifa;
            if (tipo == 1) {
                nombreVehiculo = "Motocicleta";
                tarifa = TARIFA_MOTOCICLETA;
            } else if (tipo == 2) {
                nombreVehiculo = "Automóvil";
                tarifa = TARIFA_AUTOMOVIL;
            } else {
                nombreVehiculo = "Camioneta";
                tarifa = TARIFA_CAMIONETA;
            }
            double subtotal = tarifa * horas;
            double porcentajeDescuento = 0;
            if (horas > LIMITE_HORAS_2) {
                porcentajeDescuento = DESCUENTO_10_HORAS;
            } else if (horas > LIMITE_HORAS_1) {
                porcentajeDescuento = DESCUENTO_5_HORAS;
            }
            double descuento = subtotal * porcentajeDescuento;
            double total = subtotal - descuento;
            System.out.println("\n COMPROBANTE ");
            System.out.println("Vehículo:  " + nombreVehiculo);
            System.out.println("Horas:     " + horas);
            System.out.println("Tarifa:    $" + tarifa + " por hora");
            System.out.println("Subtotal:  $" + subtotal);
            System.out.println("Descuento: $" + descuento + " (" + (int) (porcentajeDescuento * 100) + "%)");
            System.out.println("Total:     $" + total);
        }
    }
}