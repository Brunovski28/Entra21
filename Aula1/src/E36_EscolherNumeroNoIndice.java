import java.util.Scanner;

public class E36_EscolherNumeroNoIndice {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n[] = new int[5];

		n[0] = 1;
		n[1] = 1;
		n[2] = 1;
		n[3] = 1;
		n[4] = 1;
		int num, ind;
		for (int i = 0; i < n.length; i++) {
			System.out.println("Qual número?");
			num = entrada.nextInt();
			System.out.println("Qual índice?");
			ind = entrada.nextInt();
			n[i] = num;
		}
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n[3]);
		System.out.println(n[4]);
	}

}
