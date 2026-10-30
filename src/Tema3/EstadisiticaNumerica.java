package Tema3;

import java.util.Scanner;

public class EstadisiticaNumerica {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int DIVISOR = 4;
        final int MULTIPLO1 = 3;
        final int MULTIPLO2 = 5;
        int repetir;
        do {
            System.out.println("Ingrese un numero  entero positivo N: ");
            int N = scanner.nextInt();
            while (N <= 0) {
                System.out.println("Debe de ser mayor que 0, intenta de nuevo");
                N = scanner.nextInt();
            }
            int suma = 0, multiplos3 = 0, ambos = 0;
            int pares = 0, sumaPares = 0, impares = 0, sumaImpares = 0;
            int multiplos5 = 0, sumaMultiplos = 0;
            for (int i = 1; i <= N; i++) {
                if (i % DIVISOR == 0) {
                    suma = suma + 1;
                }
                if (i % MULTIPLO2 == 0) {
                    multiplos3++;
                }
                if (i % DIVISOR == 0 && i % MULTIPLO2 == 0) {
                    ambos++;
                }
                if (i % 2 == 0) {
                    pares++;
                    sumaPares = sumaPares + i;
                } else {
                    impares++;
                    sumaImpares = sumaImpares + i;
                }
            }
            System.out.println("\n Resultados (1 a " + N + ")");
            System.out.println("Suma de los  divisibles entre 4:" + suma);
            System.out.println("Cantidad de multiplos de 3:" + multiplos3);
            System.out.println("Divisibles entre 3 y 4 a la vez: " + ambos);
            System.out.println("\n Que estadistica desea ver? 1)Pares 2)Impares 3)Multiplos de 5");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Pares: " + pares + " Suma: " + sumaPares);
                    break;
                case 2:
                    System.out.println("Impares: " + impares + " Suma: " + sumaImpares);
                    break;
                case 3:
                    System.out.println("Multiplos de 5: " + multiplos5 + " Suma: " + sumaMultiplos);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("\n Desea realizar otro analisis? 1)Si 2)No");
            repetir = scanner.nextInt();
        }while (repetir == 1);
        System.out.println("Fin del programa");
        }
}
