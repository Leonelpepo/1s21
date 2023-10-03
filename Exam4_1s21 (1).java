import java.util.Scanner;

public class Exam4_1s21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar al usuario que ingrese el radio
        System.out.print("Ingrese el radio del círculo: ");
        double radio = input.nextDouble();

        // Calcular el área del círculo
        double area = Math.PI * Math.pow(radio, 2);

        // Calcular la longitud de la circunferencia
        double circunferencia = 2 * Math.PI * radio;

        // Imprimir los resultados
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
        System.out.println("La longitud de la circunferencia con radio " + radio + " es: " + circunferencia);

        input.close(); // Cerrar el scanner cuando hayas terminado de usarlo
    }
}