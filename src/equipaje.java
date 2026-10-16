import java.util.Scanner;

public class equipaje {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            final double PESO_MAXIMO = 30;
            final double CARGO_LIGERO = 150;
            final double CARGO_MEDIO = 300;
            final double CARGO_PESADO = 500;
            System.out.println("Escribe tu nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingresa el peso de tu equipaje: ");
            double peso = scanner.nextDouble();
            System.out.println("Pasajero: " + nombre);
            if (peso <= 15) {
                System.out.println("Sin cargo adicional.El peso de tu equipaje es correcto");
            } else if (peso <= 20) {
                System.out.println("A tu equipaje se le aplicará un cargo de $" + CARGO_LIGERO);
            } else if (peso <= PESO_MAXIMO) {
                System.out.println("A tu equipaje se le aplicará un cargo de $" + CARGO_MEDIO);
            } else {
                System.out.println("ADVERTENCIA: el equipaje excede el peso permitido (" + PESO_MAXIMO + " kg).");
                System.out.println("Cargo de $" + CARGO_PESADO);
            }
        }
    }

