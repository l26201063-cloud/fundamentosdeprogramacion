package Tema3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ahorroMensual {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final double TASA_INTERES = 0.01;
        int repetir;
        double inicial;
        do{
            System.out.println("Ingrese la cantidad inicial de dinero: ");
            inicial = scanner.nextDouble();
            while (inicial <= 0){
                System.out.println("Debe de ser mayor que 0, intenta de nuevo");
                inicial = scanner.nextDouble();
            }
        System.out.println("Ingrese la meta de ahorro: ");
        double Meta = scanner.nextDouble();
        while (Meta <= 0){
            System.out.println("Debe de ser mayor que 0, intenta de nuevo");
            Meta = scanner.nextDouble();
        }
        System.out.println("Ingrese el ahorro mensual fijo: ");
        double mensual = scanner.nextDouble();
        while (mensual <= 0){
            System.out.println("Debe de ser mayor que 0, intenta de nuev");
            mensual = scanner.nextInt();
        }
        System.out.println("Plazo de  simulacion: 1)6 meses 2)12 meses 3)24 meses");
        int opcion = scanner.nextInt();
        int plazo = 24;
        switch (opcion){
            case 1:
                plazo = 6;
                break;
            case 2:
                plazo = 12;
                break;
            case 3:
                plazo = 24;
                break;
            default:
                System.out.println(("Opcion no valida, se usaran 24 meses"));
        }
        double saldo = inicial;
        double intereses = 0;
        int mesesMeta = 0;
        for (int mes = 1; mes <= plazo;mes++){
            saldo = saldo + mensual;
            double interes = saldo * TASA_INTERES;
            saldo  = saldo + mensual;
            intereses = intereses + interes;
            if (saldo >= Meta && mesesMeta == 0){
                mesesMeta = mes;
            }
        }
        System.out.println("\n Resultados (" + plazo + "meses)");
        System.out.println("Saldo final: " + intereses);
        System.out.println("Interes generados: " + intereses);
        if (mesesMeta > 0){
            System.out.println("Meta alcanzada en" +  mesesMeta + " meses");
        } else{
            System.out.println("Meta no alcanzada, faltan: " +(Meta - saldo));
    }
        System.out.println("\n Desea realizar otra simulacion? 1)Si 2)No");
         repetir = scanner.nextInt();
    } while (repetir == 1);
        System.out.println("Fin del programa");
    }
}
