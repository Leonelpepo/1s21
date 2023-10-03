import java.util.Scanner;
import java.lang.Math;

public class Exam6_1s21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int X;
        int Y;
        int A;
        int B;
        int C;
        double distancia;

        System.out.println("Calcular el valor de la distancia entre un punto y una línea.");
        System.out.println("Introduce las coordenadas del punto X: ");
        X = teclado.nextInt();
        System.out.println("Introduce las coordenadas del punto Y: ");
        Y = teclado.nextInt();
        System.out.println("Introduce el valor de A:");
        A = teclado.nextInt();
        System.out.println("Introduce el valor de B: ");
        B = teclado.nextInt();
        System.out.println("Introduce el valor de C: ");
        C = teclado.nextInt();
        double abs = Math.abs(A * X + B * Y + C);
        double raizAB = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
        distancia = abs / raizAB;

        System.out.println("El valor de la distancia es: " + distancia);
    }
}