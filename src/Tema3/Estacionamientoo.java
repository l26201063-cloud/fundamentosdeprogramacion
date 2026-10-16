package Tema3;

import java.util.Scanner;

public class Estacionamientoo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        final double TARIFA_AUTO = 20;
        final double TARIFA_CAMIONETA = 30;
        final double TARIFA_MOTOCICLETA= 10;
        int contadorAutos = 0, contadorCamionetas = 0, contadorMotocicletas = 0;
        double totalRecaudado = 0;
        int opcion;
        do{
            System.out.println("\n ESTACIONAMIENTO");
            System.out.println("1. Registrar vehiculo");
            System.out.println("2.Resumen del dia");
            System.out.println("3.Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("\nTipo de vehiculo: ");
                    System.out.println("1. Automóvil ($20 por hora)");
                    System.out.println("2. Camioneta ($30 por hora)");
                    System.out.println("3. Motocicleta ($10 por hora)");
                    System.out.print("Seleccione el tipo: ");
                    int tipo = scanner.nextInt();
                    if (tipo >= 1 && tipo <= 3) {
                        System.out.print("Horas estacionado: ");
                        int horas = scanner.nextInt();
                        if (horas > 0) {
                            String nombre;
                            double costo;
                            if (tipo == 1) {
                                nombre = "Automóvil";
                                costo = horas * TARIFA_AUTO;
                                contadorAutos++;
                            } else if (tipo == 2) {
                                nombre = "Camioneta";
                                costo = horas * TARIFA_CAMIONETA;
                                contadorCamionetas++;
                            } else {
                                nombre = "Motocicleta";
                                costo = horas * TARIFA_MOTOCICLETA;
                                contadorMotocicletas++;
                            }
                            totalRecaudado += costo;
                            System.out.println("\nTipo de vehículo: " + nombre);
                            System.out.println("Horas: " + horas);
                            System.out.printf("Total a pagar:$" + costo);
                        } else {
                            System.out.println("Las horas deben ser mayores a 0.");
                        }
                    } else {
                        System.out.println("Tipo de vehículo no válido.");
                    }
                    break;
                case 2:
                    System.out.println("\n RESUMEN DEL DÍA");
                    System.out.println("Automóviles atendidos: " + contadorAutos);
                    System.out.println("Camionetas atendidas: " + contadorCamionetas);
                    System.out.println("Motocicletas atendidas: " + contadorMotocicletas);
                    System.out.printf("Total recaudado:$" + totalRecaudado);
                    break;
                case 3:
                    System.out.println("Usted esta saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }
}

