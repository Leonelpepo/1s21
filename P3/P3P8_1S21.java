import java.util.Scanner;
public class P3P8_1S21 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        System.out.println("Cuantos valores desea ingresar: ");
        int fin=teclado.nextInt();
        int a=0;
        int b=1;
        int sum;
        for (int i=1;i<=fin;i++){
            sum = a; 
            a = b + a;
            b = sum;
            System.out.println(b);
        }
    }  
}