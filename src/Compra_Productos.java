import java.util.Scanner;
public class Compra_Productos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio, total, descuento, totalConDescuento, totalFinal;
        int productos;
        final double PORC_DESCUENTO = 0.10;
        final int COSTO_FIJO = 80;
        System.out.println("===TIENDA===");
        System.out.println("Ponga el precio del producto: ");
        precio = scanner.nextDouble();
        System.out.println("Cual es la cantidad de productos que se desea comprar?");
        productos = scanner.nextInt();
        total = precio * productos;
        totalConDescuento = total; // por defecto sin descuento
        if (total >= 1000) {
            descuento = total * PORC_DESCUENTO;
            totalConDescuento = total - descuento;
            System.out.println("Se le agregara un descuento del 10%");
            System.out.println("Precio total: $" + total);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Precio con descuento: $" + totalConDescuento);
        } else {
            System.out.println("El precio total es de: $" + total);
        }
        if (totalConDescuento >= 1500) {
            totalFinal = totalConDescuento;
            System.out.println("Envío gratis por compra mayor a $1500");
        } else {
            totalFinal = totalConDescuento + COSTO_FIJO;
            System.out.println("Costo fijo de envío: $" + COSTO_FIJO);
        }
        System.out.println("Total a pagar: $" + totalFinal);
    }
}
