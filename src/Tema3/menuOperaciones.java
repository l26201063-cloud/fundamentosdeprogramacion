package Tema3;

import java.util.Scanner;

public class menuOperaciones {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int SALIR = 5;
        int opcion;
        int numero;
        do {
            System.out.println("\nMENU");
            System.out.println("1) Cuadrado de un numero");
            System.out.println("2) Cubo de un numero");
            System.out.println("3) Par o impar");
            System.out.println("4) Suma de 1 hasta un numero");
            System.out.println("5) Salir");
            System.out.println("Elige una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese un numero: ");
                    numero = scanner.nextInt();
                    System.out.println("El cuadrado de " + numero + " es " + ((long) numero * numero));
                    break;
                case 2:
                    System.out.println("Ingrese un numero: ");
                    numero = scanner.nextInt();
                    System.out.println("El cubo de " + numero + " es " + ((long) numero * numero * numero));
                    break;
                case 3:
                    System.out.println("Ingrese un numero: ");
                    numero = scanner.nextInt();
                    if (numero % 2 == 0){
                        System.out.println(numero + " es par");
                    } else {
                        System.out.println(numero + " es impar");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese un numero positivo: ");
                    numero = scanner.nextInt();
                    if (numero > 0){
                        long suma = 0;
                        for (int i = 1; i <= numero; i++){
                            suma = suma + i;
                        }
                        System.out.println("La suma de 1 a " + numero + " es " + suma);
                    } else {
                        System.out.println("Error: el numero debe ser positivo");
                    }
                    break;
                case SALIR:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Error: la opcion no existe, intenta de nuevo");
            }
        } while (opcion != SALIR);
    }
}
