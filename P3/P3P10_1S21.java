import java.util.Scanner;
public class P3P10_1S21{
	public static double factorial(double n){
		double fac=1;
		for (int i=0;i<n;i++) {
			fac*=i+1;
		}
		return fac;
	}
	public static double alcubo(double n){
		double resu=1;
		for (int i=0;i<n;i++) {
			resu=Math.pow(n,3);
		}
		return resu;
	}
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingrese el valor de N: ");
		double n=teclado.nextInt();
		double resu=0;
		for (int i=0;i<n;i++) {
			double dividiendo=alcubo(n)*factorial(i);
			resu+=dividiendo/factorial(n);
		}
		System.out.println(resu);
	}
}