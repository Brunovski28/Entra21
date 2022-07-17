package NRainhas;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Digite um número entre 4 e 25.");
		int numero = entrada.nextInt();

		if (numero < 4 || numero > 25) {
			throw new IllegalArgumentException("ERRADO");
		}
		int num[][] = new int[numero][numero];
		boolean ver[][] = new boolean[numero][numero];


		while (true) {

			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < ver.length; j++) {
					num[i][j] = 0;
				}

			}

			for (int i = 0; i < ver.length; i++) {
				for (int j = 0; j < ver.length; j++) {
					ver[i][j] = true;
				}
			}

			int aleatorio1 = random.nextInt(numero);
			num[aleatorio1][0] = 1;
			ver[aleatorio1][0] = false;

			for (int i = 0; i < ver.length; i++) {
				ver[aleatorio1][i] = false;
				ver[i][0] = false;
			}
			int col1 = 0;
			int cima = 0;
			int baixo = 0;
			for (int i = 0; i < numero; i++) {
				if (num[i][0] == 1) {
					col1 = i;
				}
			}
			cima = col1;
			baixo = (numero - col1) - 1;
			int c = 0;
			int b = 1;
			int r = 0;
			r = cima;

			while (true) {
				if (cima == -1) {
					break;
				} else {

					ver[cima][c] = false;
				}
				c++;
				cima--;
			}

			for (int i = 0; i < baixo + 1; i++) {

				ver[r][b - 1] = false;

				b++;
				r++;
			}

			for (int i = 1; i < ver.length; i++) {

				boolean kc = false;

				for (int j = 0; j < ver.length; j++) {
					if (ver[j][i] == true) {
						kc = true;
						break;
					}

				}
				if (kc == true) {

					while (true) {
						int lns = random.nextInt(numero);
						if (ver[lns][i] == true) {
							num[lns][i] = 1;
							break;
						}
					}
				} else {
					break;
				}
				int cols = 0;
				for (int j = 0; j < numero; j++) {
					if (num[j][i] == 1) {
						cols = j;
					}
				}
				int cimaa = cols;
				int re = cimaa;
				for (int j2 = 0; j2 < ver.length; j2++) {
					ver[cols][j2] = false;
					ver[j2][i] = false;
				} 
				int m = i;

				while (true) {
					m++;
					cimaa--;
					if (cimaa == -1) {
						break;
					} else {
						if (m == numero) {
							break;
						} else {
							ver[cimaa][m] = false;
						}
					}
				}
				try {
					int li = i;
					while (true) {
						li++;
						re++;
						ver[re][li] = false;
					}
				} catch (Exception e) {
					
				}

				cimaa = 0;

			}
			boolean o = false;
			for (int j = 0; j < ver.length; j++) {
				if (num[j][numero - 1] == 1) {
					o = true;
				}
			}

			if (o == true) {
				break;
			}

		}
		for (int j = 0; j < (numero*2)-1; j++) {
			System.out.print("=");
		}
				System.out.println("");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();

		} 
		System.out.println("\n");

	}

}