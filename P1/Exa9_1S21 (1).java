import java.util.Scanner;

public class Exa9_1S21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULARE LA CAIDA DE POTENCIA PRODUCIDA POR UNA RESISTENCIA..  ");
        System.out.println();
        System.out.println("LA FORMULA SEGUN LA LEY DE OHM: V = I * R . ");
        System.out.println();
        System.out.print("Introduce la intensidad en amperios: ");
        double intensidad = scanner.nextDouble();
        System.out.println();
        System.out.print("Introduce la resistencia en ohmios: ");
        double resistencia = scanner.nextDouble();

        if (resistencia < 0) {
            System.out.println("ERROR: EL VALOR DE LA RESISTENCIA NO PUEDE SER NEGATIVO. ");
        } else if (resistencia > 1000) {
            System.out.println("ERROR: EL VALOR DE LA RESISTENCIA NO PUEDE SER MAYOR QUE 1000. ");
        } else {
            double voltaje = intensidad * resistencia;
            System.out.println();
            System.out.println("LA CAIDA DE POTENCIA ES " + voltaje + " V.");
        }
    }
}