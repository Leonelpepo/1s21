public class P2p4_1s21 {
    public static void main(String[] args) {
        int count = 0; 
        int numero = 2; 

        System.out.println("Los primeros 10 números primos son:");

        while (count < 10) {
            if (esPrimo(numero)) {
                System.out.println(numero);
                count++;
            }
            numero++;
        }
    }

    
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