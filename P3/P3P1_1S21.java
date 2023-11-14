import java.util.Scanner;
public class P3P1_1S21{	
	static Scanner teclado=new Scanner(System.in);
	public static void suma(){
	System.out.println("Suma de 2 num");
	System.out.println("Ingrese el 1er num");
	int a=teclado.nextInt();
	System.out.println("Ingrese el 2do num");
int b=teclado..nextInt();
int c=a+b;
System.out.println("La suma fue" +c);
}
public static void Resta(){
	System.out.println("Resta de 2 num");
	System.out.println("Ingrese el 1er num");
int a=teclado.nextInt();
System.out.println("Ingrese el 2do num");
int b=teclado.nextInt();
int c=a-b;
System.out.println("La resta fue" +c);
}
public static void menu(){
System.out.println("Operaciones Basicas");
System.out.println("\n A)Suma");
System.out.println("B)Resta");
System.out.println("C)Division");
System.out.println("D)Multiplicacion");
System.out.println("\n Que opcionn deseas");
}
public static void main(String[]args){
	menu();
	String opc=teclado.nextInt();
	if(opc.equals("A"))suma();
	if(opc.equals("B"))Resta();
}
}
