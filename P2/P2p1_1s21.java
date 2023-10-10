public class P2p1_1s21{
	public static void main(String[] args) {
		int a=12;
		if (a<10){
			System.out.println("Si ingreso por que es verdadero");

		}
		if (a>10){
			System.out.println("Este segmento si se ejecuta por que se cumple la condicion");
		}
		if (true){
			System.out.println("aqui se ejecuta por que es verdadero");
		}
		if (false){
			System.out.println("Este segmento no se ejecuta por que es falso");
		}
		if((a>10)== true){
			System.out.println("se ejecutara?");
		}
		System.out.println("continuamos con el codigo");

		System.out.println(" ");
		a= 18;

		if (a>17){
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}

		a=2;

		if (a == 1){
			System.out.println("Se evaluo a 1");
		}else if (a == 2){
			System.out.println("Se evaluo a 2");
		}else if (a == 3){
			System.out.println("Se evaluo a 3");
		}else if (a == 4){
			System.out.println("Se evaluo a 4");
		}else if (a == 5){
			System.out.println("Se evaluo a 5");
		}else{
			System.out.println("Se evaluaron los demas digitos");
		}

		//como valido que no puedo realizar una divicion entre 0
		int divisor=0;
		int dividendo=0;

		if (divisor == 0){
			System.out.println("no es posible hacer una division");
		}else{
			System.out.println("Si se pudo realizar la divicion");
		}
	}
}