package Tema3;
/*
*Instituto Tecnológico de Pachuca
* Espitia Zamorano Ximena Itandehui 26201063
* 2026-10-14
* Programa que evalua en una serie de numeros si es par o impar
 */
import java.util.Scanner;

public class ParimparWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        do {
            int n, contador = 1;
            System.out.println("Ingrese el numero");
            n = scanner.nextInt();
            while (contador <= n) {
                if (contador % 2 == 0) { // ¿residuo de cero al dividir entre 2?
                    System.out.println("El numero " + contador + " es par");
                } else {
                    System.out.println("El numero " + contador + " es impar");
                }
                contador++; // contador = contador + 1
            }
            System.out.println("¿Desea ingresar otro numero? 1) Si 2)No");
            res = scanner.nextInt();
        } while (res == 1);
    }
}
