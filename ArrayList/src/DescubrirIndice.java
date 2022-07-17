import java.util.ArrayList;
import java.util.Scanner;

public class DescubrirIndice {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Scanner entrada = new Scanner(System.in);
		boolean b = false;
		for (int i = 0; i < 5; i++) {
			lista.add(i, i + 1);
		}
		while (true) {
			System.out.println("Qual número?");
			int num = entrada.nextInt();
			for (int i = 0; i < 5; i++) {
				if (num == lista.get(i)) {
					System.out.println("Você acertou o número " + lista.get(i) + " e o índice é " + i);
					b = true;
				}
			}
			if (b == true) {
				break;
			}
		}
	}

}
