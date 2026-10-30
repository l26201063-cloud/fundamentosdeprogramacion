package Tema3;

import java.util.Scanner;

public class numerosPrimos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo N: ");
        int N = scanner.nextInt();
        while (N <= 0){
            System.out.println("Debe de ser mayor que 0, intenta de nuevo");
            N = scanner.nextInt();
        }
        int sumaPares = 0, divisiblesEntre3 = 0, sumaPrimos = 0, cantidadPrimos = 0, divisores = 0;
        String primos = "";
        for (int i = 1; i <= N ; i++){
            divisores = 0;
        for (int j = 1; j <= i; j++){
            if (i % j == 0){
                divisores++;
            }
        }
        if (divisores == 2){
            primos = primos + i + " ";
            sumaPrimos = sumaPrimos + i;
            cantidadPrimos++;
        }
        if (i % 2 == 0){
            sumaPares = sumaPares + i;
        }
        if (i % 3 == 0){
            divisiblesEntre3++;
        }
        }
        System.out.println("\n RESULTADOS (1 a " + N + ")");
        System.out.println("Numeros Primos: " + primos);
        System.out.println("Suma los numeros pares:" + sumaPares);
        System.out.println("Cantidad de numeros divisiblles entre 3: " + divisiblesEntre3);
        if (cantidadPrimos > 0 ){
            double promedio = (double) sumaPrimos / cantidadPrimos;
            System.out.println("Promedio de los numeros primos: " + promedio);
        }else {
            System.out.println("No hay numeros primos, no se puede calcular el promedio");
        }
    }
}