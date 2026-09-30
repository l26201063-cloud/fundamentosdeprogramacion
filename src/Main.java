import java.util.Scanner;
/*
* INSTITUTO TECNOLOGICO DE PACHUCA
* FUNDAMENTOS DE PROGRAMACION
* XIMENA ITANDEHUI ESPITIA ZAMORANO
* 23 DE SEPIEMBRE 2026
 */
public class Main {

    public static void main(String[] args){
        String nombre;
        final String SALUDO = "HOLA, ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        nombre = scanner.nextLine();
        System.out.println("hola, " + nombre);

        System.out.println("HOLA MUNDO :)");
        System.out.printf("Soy Itandehui");
        System.out.println();
    }
}
