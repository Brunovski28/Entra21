import java.util.Scanner;

public class E26_MaiorMenor {

	public static void main(String[] args) {
		Scanner BS = new Scanner(System.in);

		int s, a;
		s = 0;
		a = 0;
		double nm, nme;
		nme = 1000;
		nm = -1000;
		// ou integer.MIN_VALUE;
		// ou integer.MAX_VALUE;
		while (true) {
			System.out.println("Qual o número?");
			s = BS.nextInt();
			if (s == 0) {
				break;
			}

			if (s > nm) { // Aqui ele pega o numero maior possivel
				nm = s; // Aqui ele vai salvando o número maior
			}
			if (s < nme) { // Aqui ele pega o numero menor possivel e salva logo abaixo
				nme = s;
			}
		}
		System.out.println("O maior valor é " + nm + " e o menor é " + nme);

	}

}
