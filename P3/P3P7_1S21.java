import java.util.Scanner;
public class P3P7_1S21{
	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n=teclado.nextInt();
        int acomulador=0;

            System.out.println("Introduce un numero: ");


	for (int i=0;i<n;i++){
		acomulador += alcubo(n)/factorial(n);
		System.out.println("El resultado de la sumatoria es: " + acomulador);
	}
    }

    public static double alcubo(int n) {
    	double ac = 1;
    	ac = Math.pow(n,3);
    	return ac;

    }

    public static double factorial(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

}

