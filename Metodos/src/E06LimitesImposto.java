import java.util.Scanner;

public class E06LimitesImposto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Qual é o limite máximo?");
		int limitemaximo = entrada.nextInt();
		System.out.println("Qual é o limite minimo?");
		int limiteminimo = entrada.nextInt();
		System.out.println("Qual o número boy");
		int numero = entrada.nextInt();
		limite(numero, limiteminimo, limitemaximo);
	}
public static void limite(int numero, int limiteminimo, int limitemaximo) {
	if (numero > limiteminimo && numero < limitemaximo) {
		System.out.println(numero+" está nos limites estabelecidos.");
	} else {
		System.out.println(numero+" está fora dos limites estabelecidos.");
	}
}
}
