package Tema3;

import java.util.Scanner;

public class Gasolinera {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int totalCargas = 0;
            int cargasConDescuento = 0;
            double totalLitros = 0;
            double totalImportesSinDescuento = 0;
            double totalCobrado = 0;
            int opcion = 0;
            do{
                System.out.println("MENU");
                System.out.println(" 1_ Registrar carga: ");
                System.out.println(" 2_ Resumen del dia: ");
                System.out.println(" 3_ Finalizar ");
                System.out.println(" Opcion: ");
                opcion = scanner.nextInt();
                if (opcion == 1) {
                    System.out.println("Litros cargados: ");
                    double litros = scanner.nextDouble();
                    System.out.println("Precio por litro: ");
                    double precio = scanner.nextDouble();
                    if (litros <= 0 || precio <= 0) {
                        System.out.println("Litros y precio deben de ser mayor a cero");
                    } else {
                        double importe = litros * precio;
                        double descuento = 0;
                        double totalPagar = importe;

                        if (litros >= 40) {
                            descuento = importe * 0.05;
                            totalPagar = importe - descuento;
                            cargasConDescuento = cargasConDescuento + 1;
                        }
                        totalCargas = totalCargas + 1;
                        totalLitros = totalLitros + litros;
                        totalImportesSinDescuento = totalImportesSinDescuento;
                        totalCobrado = totalCobrado + totalPagar;

                        System.out.println("Importe: $" + importe);
                        System.out.println("Descuento: $" + descuento);
                        System.out.println("Total a cobrar: $" + totalPagar);
                    }
                }
                if (opcion == 2) {
                    double promedio = 0;
                    if (totalCargas > 0) {
                        promedio = totalCobrado / totalCargas;
                    }
                    System.out.println("RESUMEN DEL DIA");
                    System.out.println("Cargas registradas: " + totalCargas);
                    System.out.println("Cargas con descuento: " + cargasConDescuento);
                    System.out.println("Litros vendidos: " + totalLitros);
                    System.out.println("Importe antes de descuentos: $" + totalImportesSinDescuento);
                    System.out.println("Total cobrado: $" + totalCobrado);
                    System.out.println("Promedio por carga: $" + promedio);
                }
            }  while(opcion !=3);
        }
    }
