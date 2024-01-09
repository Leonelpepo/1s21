import java.util.Scanner;
public class P3P1_1S21{
	static Scanner teclado=new Scanner (System.in);
	public static void suma(){
		System.out.println("Suma de 2 numeros");
		System.out.println("Ingresa el primer numero ");
		int a=teclado.nextInt();
		System.out.println("Ingrese el segundo numero ");
		int b=teclado.nextInt();
		int c=a+b;
		System.out.println("La suma fue: "+c);
	}
	public static void resta(){
		System.out.println("Suma de 2 numeros");
		System.out.println("Ingresa el primer numero ");
		int a=teclado.nextInt();
		System.out.println("Ingrese el segundo numero ");
		int b=teclado.nextInt();
		int c=a-b;
		System.out.println("La suma fue: "+c);
	}
	public static void division(){
		System.out.println("Suma de 2 numeros");
		System.out.println("Ingresa el primer numero ");
		int a=teclado.nextInt();
		System.out.println("Ingrese el segundo numero ");
		int b=teclado.nextInt();
		int c=a/b;
		System.out.println("La suma fue: "+c);
	}
	public static void multiplicacion(){
		System.out.println("Suma de 2 numeros");
		System.out.println("Ingresa el primer numero ");
		int a=teclado.nextInt();
		System.out.println("Ingrese el segundo numero ");
		int b=teclado.nextInt();
		int c=a*b;
		System.out.println("La suma fue: "+c);
	}
	public static void menu(){
		System.out.println("Operaciones basicas");
		System.out.println("\nA)Suma");
		System.out.println("B)Resta");
		System.out.println("C)Division");
		System.out.println("D)Multiplicacion");
		System.out.println("S)Salir");
		System.out.println("\n¿Que opcion desea?");
	}
	public static void main(String[] args) {
		menu();
		String opc=teclado.nextLine();
		if (opc.equals("A")) suma();
		if (opc.equals("B")) resta();
		if (opc.equals("C")) division();
		if (opc.equals("D")) multiplicacion();
		if (opc.equals("S"));
	}
}
