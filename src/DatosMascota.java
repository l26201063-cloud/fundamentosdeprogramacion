import java.util.Scanner;

public class DatosMascota{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nombre del animal: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingresa edad: ");
            int edad = scanner.nextInt();
            System.out.print("Ingresa su peso en kilogramos: ");
            double peso = scanner.nextDouble();
            System.out.print("¿Es hembra? (true = hembra, false = macho): ");
            boolean esHembra = scanner.nextBoolean();
            String sexo = esHembra ? "Hembra" : "Macho";
            System.out.println("\nResumen de datos ingresados");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad + " años");
            System.out.println("Peso: " + peso + " kilogramos");
            System.out.println("Sexo: " + sexo);
    }
}

