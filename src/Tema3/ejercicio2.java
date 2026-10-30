package Tema3;
import java.util.Scanner;
public class ejercicio2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            final int MINIMO = 1;
            String respuesta;
            do {
                System.out.print("Ingresa un número entero positivo mayor que 0: ");
                int N = scanner.nextInt();
                while (N < MINIMO) {
                    System.out.print("Debe ser mayor que 0. Intenta de nuevo: ");
                    N = scanner.nextInt();
                }
                int sumaPares = 0;
                int sumaImpares = 0;
                int contPares = 0;
                int contImpares = 0;
                for (int i = 1; i <= N; i++) {
                    if (i % 2 == 0) {
                        sumaPares = sumaPares + i;
                        contPares++;
                    } else {
                        sumaImpares = sumaImpares + i;
                        contImpares++;
                    }
                }
                System.out.println("\n RESULTADOS (1 a " + N + ") ");
                System.out.println("Suma de pares: " + sumaPares);
                System.out.println("Suma de impares: " + sumaImpares);
                System.out.println("Cantidad de pares: " + contPares);
                System.out.println("Cantidad de impares: " + contImpares);
                System.out.print("\n¿Deseas realizar otro cálculo? (s/n): ");
                respuesta = scanner.next();
                System.out.println();
            } while (respuesta.equals("s") || respuesta.equals("S"));
            System.out.println("Programa finalizado.");
        }
    }
