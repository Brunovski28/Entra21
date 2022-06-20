import java.util.Scanner;

public class AudienciaTV {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double vetor[] = new double[5];
		int salvador = 0;
		int contador = 0;
		int totalpessoas = 0;
		boolean canal4 = false;
		boolean canal5 = false;
		boolean canal9 = false;
		boolean canal12 = false;
		while (true) {
			System.out.println("Quantas casas foi visitada?");
			int casa = entrada.nextInt();
			if (casa == 0) {
				break;
			}
			for (int i = 0; i < casa; i++) {
				System.out.println("Qual canal da " + (i + 1) + " casa?");
				int canal = entrada.nextInt();
				System.out.println("Quantas pessoas assistindo?");
				int pessoa = entrada.nextInt();
				totalpessoas = totalpessoas + pessoa;
				if (canal == 4) {
					vetor[0] = pessoa;
					canal4 = true;
				} else if (canal == 5) {
					vetor[1] = pessoa;
					canal5 = true;
				} else if (canal == 9) {
					vetor[2] = pessoa;
					canal9 = true;
				} else if (canal == 12) {
					vetor[3] = pessoa;
					canal12 = true;
				}
				contador++;
			}
		}

		if (canal4 == true) {
			System.out.print("Percentual do canal 4: ");
			System.out.format("%.2f ", (vetor[0] / totalpessoas) * 100);
			System.out.print("% porcento. ");
		}
		if (canal5 == true) {
			System.out.print("Percentual do canal 5: ");
			System.out.format("%.2f ", (vetor[1] / totalpessoas) * 100);
			System.out.print("% porcento. ");
		}
		if (canal9 == true) {
			System.out.print("Percentual do canal 9: ");
			System.out.format("%.2f ", (vetor[2] / totalpessoas) * 100);
			System.out.print("% porcento. ");
		}
		if (canal12 == true) {
			System.out.print("Percentual do canal 12: ");
			System.out.format("%.2f ", (vetor[3] / totalpessoas) * 100);
			System.out.print("% porcento. ");

		}
	}

}
