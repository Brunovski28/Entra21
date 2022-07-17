import java.util.Scanner;

public class E39_MaiorMenorMedia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double v[] = new double[100];
		int i = 0;

		double numeroMaior = Integer.MIN_VALUE;
		double numeroMenor = Integer.MAX_VALUE;
		double media = 0;
		char n;
		double numero = 0;
		int c = 0;

		while (i < v.length + 1) {

			System.out.println("Qual número?");
			numero = entrada.nextDouble();

			v[c] = numero;
			if (v[c] < numeroMenor) {
				numeroMenor = v[c];
			}
			if (v[c] > numeroMaior) {
				numeroMaior = v[c];
			}

			media += numero;
			c++;
			System.out.println("Deseja continuar?");
			n = entrada.next().charAt(0);

			if (n == 'n') {
				System.out.println("Você finalizou o programa!");
				break;
			}
		} // fim do while
		System.out.println("Maior elemento " + numeroMaior);
		System.out.println("Menor elemento " + numeroMenor);
		System.out.println("A média é " + media / c);

	}

}