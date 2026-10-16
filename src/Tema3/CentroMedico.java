package Tema3;

import java.util.Scanner;

public class CentroMedico {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int niños = 0, adolescentes = 0, adultos = 0, adultosMayores = 0;
        double totalRecaudado = 0;
        double totalDescuentos = 0;
        int totalPacientes = 0;
        int continuar;

        do {
            System.out.println("\nEdad del paciente:");
            int edad = scanner.nextInt();

            if (edad < 0) {
                System.out.println("Edad inválida. Intenta de nuevo.");
                continuar = 1;
                continue;
            }

            System.out.println("Costo de la consulta:");
            double costo = scanner.nextDouble();

            double descuento = 0;
            String categoria = "";

            if (edad < 12) {
                categoria = "Niño";
                niños++;
            } else if (edad >= 12 && edad <= 17) {
                categoria = "Adolescente";
                adolescentes++;
            } else if (edad >= 18 && edad <= 59) {
                categoria = "Adulto";
                adultos++;
            } else if (edad >= 60) {
                categoria = "Adulto Mayor";
                adultosMayores++;
                descuento = costo * 0.15;
            }
            double aPagar = costo - descuento;
            totalRecaudado += aPagar;
            totalDescuentos += descuento;
            totalPacientes++;

            System.out.println("Categoría: " + categoria);
            System.out.println("Descuento aplicado: $" + descuento);
            System.out.println("Total a pagar: $" + aPagar);

            System.out.print("\n¿Deseas registrar otro paciente? 1 = Sí, 0 = No: ");
            continuar = scanner.nextInt();
        } while (continuar == 1);

        System.out.println("\nRESUMEN DEL DÍA");
        System.out.println("Total de pacientes: " + totalPacientes);
        System.out.println("\nCATEGORÍAS");
        System.out.println("Niños: " + niños);
        System.out.println("Adolescentes: " + adolescentes);
        System.out.println("Adultos: " + adultos);
        System.out.println("Adultos mayores: " + adultosMayores);
        System.out.println("Dinero recaudado: $" + totalRecaudado);
        System.out.println("Descuentos aplicados: $" + totalDescuentos);

        if (totalPacientes > 0) {
            double promedio = totalRecaudado / totalPacientes;
            System.out.println("Promedio pagado por paciente: $" + promedio);
        }
    }
}