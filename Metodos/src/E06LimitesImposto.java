import java.util.Scanner;

public class E06LimitesImposto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Qual � o limite m�ximo?");
		int limitemaximo = entrada.nextInt();
		System.out.println("Qual � o limite minimo?");
		int limiteminimo = entrada.nextInt();
		System.out.println("Qual o n�mero boy");
		int numero = entrada.nextInt();
		limite(numero, limiteminimo, limitemaximo);
	}
public static void limite(int numero, int limiteminimo, int limitemaximo) {
	if (numero > limiteminimo && numero < limitemaximo) {
		System.out.println(numero+" est� nos limites estabelecidos.");
	} else {
		System.out.println(numero+" est� fora dos limites estabelecidos.");
	}
}
}
