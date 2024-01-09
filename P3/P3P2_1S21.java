import java.util.Scanner;
public class P3P2_1S21{
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
		System.out.println("La resta fue: "+c);
	}
	public static void division(){
		System.out.println("Suma de 2 numeros");
		System.out.println("Ingresa el primer numero ");
		int a=teclado.nextInt();
		System.out.println("Ingrese el segundo numero ");
		int b=teclado.nextInt();
		int c=a/b;
		System.out.println("La division fue: "+c);	
	}
	public static void multiplicacion(){
		System.out.println("Suma de 2 numeros");
		System.out.println("Ingresa el primer numero ");
		int a=teclado.nextInt();
		System.out.println("Ingrese el segundo numero ");
		int b=teclado.nextInt();
		int c=a*b;
		System.out.println("La multiplicacion fue: "+c);	
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
		boolean sig=true;
		String opc;
		while(sig){
			menu();
		opc=teclado.nextLine().toUpperCase();
		switch (opc){
		case "A": suma(); break;
		case "B": resta(); break;
		case "C": division(); break;
		case "D": multiplicacion(); break;
		case "S": System.out.println("Programa finalizado");
			sig=false;
			break;
		default:
			System.out.println("Opcion no disponible");
			break;
		}
	}
}
}