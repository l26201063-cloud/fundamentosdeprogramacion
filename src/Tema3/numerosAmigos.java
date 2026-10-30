package Tema3;

import java.util.Scanner;

public class numerosAmigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repetir;
        do {
            System.out.println("Ingrese el primer numero entero positivo: ");
            int a = scanner.nextInt();
            while (a <= 0) {
                System.out.println("Debe de ser mayor que 0, intenta de nuevo");
                a = scanner.nextInt();
            }
            System.out.println("Ingrese el segundo numero entero positivo: ");
            int b = scanner.nextInt();
            while (b <= 0) {
                System.out.println("Debe de ser mayor que 0, intenta de nuevo");
                b = scanner.nextInt();
            }
            int sumaA = 0, sumaB = 0, cantidadA = 0, cantidadB = 0;
            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    sumaA = sumaA + i;
                    cantidadA++;
                }
            }
            for (int i = 1; i < b; i++) {
                sumaB = sumaB + 1;
                cantidadB++;
            }
            System.out.println("\n Que desea ver? 1)Suma de divisores de cada numero 2)Solo el resultado");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Divisores propios de" + a + ": " + cantidadA + " Suma: " + sumaA);
                    System.out.println("Divisores propios de" + b + ": " + cantidadB + " Suma: " + sumaB);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opcion no valida, se muestra solo el resultado");
            }
            if (sumaA == b && sumaB == a){
                System.out.println("Resultado : " + a + " y " + b + " son numeros amigos");
            } else {
                System.out.println("Resultado : " + a + " y " + b + "  no son numeros amigos");
            }
            System.out.println("\n Desea analizar otra pareja? 1)Si 2)No");
            repetir = scanner.nextInt();
        } while (repetir == 1);
        System.out.println("Fin del programa");
    }
}
