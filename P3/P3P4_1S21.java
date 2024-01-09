import java.util.Scanner;
public class P3P4_1S21{
	public static void elevacion(int a, int repita){
		static int veces;
		System.out.println("Ingrese el numero de repeticiones que desee: ");
		if(!(repita==veces)) elevacion(a*2,repita+1);
		System.out.println("el valor es "+a);
	}
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		System.out.println("cuantas veces desea repetir: ");
		veces=teclado.nextInt();
		int valor=2;
		elevacion(valor,1);
	}
}