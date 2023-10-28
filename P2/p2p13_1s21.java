import java.util.Scanner;

public class RestaM p2p13_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int f,c;
		System.out.println("Ingresa el numero de filas");
		f = teclado.nextLine();
		System.out.println("Ingresa el numero de columnas");
		c = teclado.nextLine();
		int [][] MA = new int[f][c];
		int [][] MB = new int[f][c];
		int [][] MC = new int[f][c];
		int ff,fc;
			for (ff=0; ff<f; ff++){
				for (fc=0; fc<c; fc++){
					System.out.println("Ingrese el valor para la posicion["+ff+"]["+fc+"]");
					MA [ff][fc] = teclado.nextLine();
				}
			}
			for (ff=0; ff<f; ff++){
				for (fc=0; fc<c; fc++){
					System.out.println("Ingrese el valor para la posicion["+ff+"]["+fc+"]");
					MB [ff][fc] = teclado.nextLine();
				}
			}
			for (ff=0; ff<f; ff++){
				for (fc=0; fc<c; fc++){
					MC [ff][fc] = MA [ff][fc] - MB [ff][fc];
				}
			}
			for (ff=0; ff<f; ff++){
				for (fc=0; fc<c; fc++){
					System.out.println("El resultado de la resta de la matriz en suposicion ["+ff+"]["+fc+"] es" + MC [ff][fc]);
				}
			}		
	}
}	