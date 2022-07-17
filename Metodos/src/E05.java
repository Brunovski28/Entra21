import java.util.Scanner;

public class E05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Qual o número?");
		double numero = entrada.nextDouble();
		imparpar(numero);
		
	}
	public static void imparpar(double numero) {
		if (numero %2 == 0) {
			System.out.println("O quadrado do número par: "+(numero * numero));
		} else {
			System.out.println("O dobro do número impar: "+(numero*2));
		}
	}
}
