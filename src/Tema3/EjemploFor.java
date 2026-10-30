package Tema3;

import java.util.Scanner;

public class EjemploFor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int iteraciones;
        System.out.println("Ingresa el numero de iteraciones");
        iteraciones = scanner.nextInt();
        for (int i = 1; i<=10; i++){///inicio de for
            System.out.println(i);
        }/// fin del for
        System.out.println("continua operacion");
    }
}
