package Tema3;

import java.util.Scanner;

public class VentasDiasFor {
    public static void main(String[] args){
        int numeroDias,ventaDia, acumuladorVentas = 0, contadorDiasBuenos = 0,respuesta ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero de dias");
        numeroDias = scanner.nextInt();
        for (int i = 0; i < numeroDias; i++){
            System.out.println("Ingresa la venta del dia" + i);
            ventaDia = scanner.nextInt();
            acumuladorVentas += ventaDia;
            System.out.println("acumuladorVentas = " + acumuladorVentas);
            if (ventaDia >= 1000){
                contadorDiasBuenos++;
            }
            if (ventaDia >=5000){
                break;
            }
        }
        System.out.println("Dias buenos" + contadorDiasBuenos);
        System.out.println("acumuladorVentas = " + acumuladorVentas);
        System.out.println("¿Desea repetir la operacion?\n 1)si 2)no ");
        respuesta = scanner.nextInt();
    }
}
