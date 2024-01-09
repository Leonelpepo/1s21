import java.util.Scanner;
public class P3P9_1S21 {
	static int veces;
	public static void main(String[] args) {
		int c = a + b;
		if (c<veces){
			System.out.println(c);

			f(b,c);
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("cuantas veces deseas repetir:");
		veces = teclado.nextInt();
		System.out.println("0\n1");
		f(0,1);
	}
}