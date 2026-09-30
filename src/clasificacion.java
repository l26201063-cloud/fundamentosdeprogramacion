import java.util.Scanner;

public class clasificacion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int calificacion;
        System.out.println("Escribe tu nombre");
        nombre = scanner.nextLine();
        System.out.println("Escribe tu calificacion");
        calificacion = scanner.nextInt();
        if (calificacion <= 59 ){
            System.out.println("Reprobado");
        }
        else if (calificacion >=60 && calificacion < 70){
            System.out.println("Suficiente");
        }
        else if (calificacion >=70 && calificacion < 80){
            System.out.println("Bien");
        }
        else if (calificacion >=80 && calificacion < 90){
            System.out.println("Muy bien");
        }
        else if (calificacion >=90 && calificacion <= 100) {
            System.out.println("Excelente");
        }
    }

}
