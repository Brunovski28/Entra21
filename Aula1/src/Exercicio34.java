import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double n[] = new double[5];
		
		n[0] = 1;
		n[1] = 2;
		n[2] = 3;
		n[3] = 4;
		n[4] = 5;
		int v = 0;
		int i = 4;
		
		while (i < n.length) {
			System.out.println("Qual número?");
			v = entrada.nextInt();
			
			if (v == n[0] || v == n[1] || v == n[2] || v == n[3] || v == n[4]) {
				System.out.println("Acertou o número! com o número "+v);
			} else {
				System.out.println("Errou cabas");
			}
			i++;
		}
		
		
	}

}
