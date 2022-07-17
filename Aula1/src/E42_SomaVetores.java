import java.util.Scanner;

public class E42_SomaVetores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int vetor1[] = new int[5];
		int vetor2[] = new int[5];
		double vetor3[] = new double[5];
		int numero = 0;
		int somatoria = 0;

		for (int i = 0; i < vetor1.length; i++) {
			System.out.println((i + 1) + "° número para soma, 1 vetor");
			numero = entrada.nextInt();
			vetor1[i] = numero;
		}
		for (int i = 0; i < vetor2.length; i++) {
			System.out.println((i + 1) + "° número para soma, 2 vetor");
			numero = entrada.nextInt();
			vetor2[i] = numero;
		}
		for (int i = 0; i < vetor3.length; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
		}
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Primeiro vetor: [" + vetor1[i] + "] Segundo vetor: [" + vetor2[i]
					+ "] = [" + vetor3[i]+"]");
		}
	}

}
