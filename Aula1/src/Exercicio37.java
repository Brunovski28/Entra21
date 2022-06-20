import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n[] = new int[5];

		n[0] = 1;
		n[1] = 1;
		n[2] = 1;
		n[3] = 1;
		n[4] = 1;
		int num, ind;
		for (; true;) {
			System.out.println("Qual número?");
			num = entrada.nextInt();
			System.out.println("Qual índice?");
			ind = entrada.nextInt();
			if (ind > 4 || ind < 0) {
				System.out.println("Esse índice não existe!");
				System.out.println("Vetor foi mantido!");
			} else {

				n[ind] = num;
				break;
			}

		} // fim do for
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n[3]);
		System.out.println(n[4]);

	}

}