import java.util.Scanner;

public class Exam2_1s21 {
    public static void main(String[] args) {

        final double PI = 3.1416;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del ángulo en grados: ");
        double grados = scanner.nextDouble();

        double radianes = grados * (PI / 180);

        System.out.println(grados + " grados son equivalentes a " + radianes + " radianes");

        scanner.close();
    }
}