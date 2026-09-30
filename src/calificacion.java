import java.util.Scanner;

public class calificacion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int CALIFICACION = 70;
        String nombre;
        int calificacion = 0;
        System.out.println("Escribe tu nombre");
        nombre = scanner.nextLine();
        System.out.println("Escribe tu calificacion");
        calificacion = scanner.nextInt();
        if(calificacion>= CALIFICACION){
            System.out.println(nombre + " has aprobado la materia");
        }
        else
            System.out.println(nombre + " has reprobado la materia");


    }
}
