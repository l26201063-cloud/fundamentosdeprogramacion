package Tema3;

import java.util.Scanner;

public class competenciaResistencia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int RONDAS = 5;
        final double LIMITE_BAJO = 2.0;
        final double LIMITE_ALTO = 4.0;
        int repetir;
        do {
            System.out.println("Ingrese la cantidad de participantes: ");
            int participantes = scanner.nextInt();
            while (participantes <= 0) {
                System.out.println("Debe de ser mayor que 0, intenta de nuevo");
                participantes = scanner.nextInt();
            }
            double totalGeneral = 0, mayorDistancia = -1;
            int mejorParticipante = 0, bajo = 0, medio = 0, alto = 0;
            for (int p = 1; p <= participantes; p++) {
                double totalParticipantes = 0;
                for (int r = 1; r <= RONDAS; r++) {
                    System.out.println("Participante: " + p + " , ronda" + r + " (km): ");
                    double distancia = scanner.nextDouble();
                    while (distancia < 0) {
                        System.out.println("Debe ser mayor o igual a 0, intenta de nuevo");
                        distancia = scanner.nextDouble();
                    }
                    totalParticipantes = totalParticipantes + distancia;
                    if (distancia < LIMITE_BAJO) {
                        System.out.println("Rendimiento:BAJO");
                        bajo++;
                    } else if (distancia <= LIMITE_ALTO) {
                        System.out.println("Rendimiento: MEDIO");
                        medio++;
                    } else {
                        System.out.println("Rendimiento:ALTO");
                        alto++;
                    }
                }
                System.out.println("Participante: " + p + " - Total: " + totalParticipantes + "km | Promedio por ronda: " + (totalParticipantes / RONDAS) + "km");
                totalGeneral = totalGeneral + totalParticipantes;
                if (totalParticipantes > mayorDistancia) {
                    mayorDistancia = totalParticipantes;
                    mejorParticipante = p;
                }
            }
            System.out.println("\n Que estadistica desea?");
            System.out.println("1)Distancia total 2) Promedio por participante 3) Rondas por categoria 4)Mejor categoria");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Distancia total: " + totalGeneral + "km");
                    break;
                case 2:
                    System.out.println("Promedio por participante: " + (totalGeneral / participantes) + "km");
                    break;
                case 3:
                    System.out.println("Bajo: " + bajo + " | Medio: " + medio + " | Alto: " + alto);
                    break;
                case 4:
                    System.out.println("Mayor distancia:  participante " + mejorParticipante + " con " + mayorDistancia + "km");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("\n Desea registrar otra competencia? 1)Si 2)No");
            repetir = scanner.nextInt();
        }while (repetir == 1);
        System.out.println("Fin del programa");
    }
}
