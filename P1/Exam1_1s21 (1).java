import java.util.Scanner;

public class Exam1_1s21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el ancho del rectángulo: ");
        int ancho = sc.nextInt();

        System.out.println("Dime el alto del rectángulo: ");
        int alto = sc.nextInt();

        for (int columna = 1; columna <= ancho; columna++) {
            System.out.print("*");
        }
        System.out.println();

        for (int fila = 2; fila <= alto - 1; fila++) {
            System.out.print("*");

            for (int columna = 2; columna <= ancho - 1; columna++) {
                if (fila == alto || columna == ancho) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("*");
        }

        if (alto > 1) {
            for (int columna = 1; columna <= ancho; columna++) {
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
    }
}