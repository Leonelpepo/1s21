public class P2p4_1s21 {
    public static void main(String[] args) {
        int count = 0; // Contador de números primos encontrados
        int numero = 2; // Empezamos con el primer número primo

        System.out.println("Los primeros 10 números primos son:");

        while (count < 10) {
            if (esPrimo(numero)) {
                System.out.println(numero);
                count++;
            }
            numero++;
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }
}