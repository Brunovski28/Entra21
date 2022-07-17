package CifraDeCesar;

import java.util.Scanner;

public class Cesar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Decifrar ou cifrar?");
		String SN = entrada.next();

		if (SN.equalsIgnoreCase("cifrar")) {
			System.out.println("Qual palavra?");
			String palavra2 = entrada.nextLine();
			System.out.println("");
			String palavra = entrada.nextLine();
			char alfabeto[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
					'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
			char vetor1[] = new char[palavra.length()];
			for (int i = 0; i < vetor1.length; i++) {
				vetor1[i] = palavra.charAt(i);
			}
			char vetor2[] = new char[palavra.length()];

			for (int i = 0; i < vetor1.length; i++) {

				int j = 0;
				if (vetor1[i] == 'a') {
					j = 0;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'b') {
					j = 1;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'c') {
					j = 2;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'd') {
					j = 3;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'e') {
					j = 4;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'f') {
					j = 5;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'g') {
					j = 6;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'h') {
					j = 7;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'i') {
					j = 8;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'j') {
					j = 9;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'k') {
					j = 10;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'l') {
					j = 11;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'm') {
					j = 12;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'n') {
					j = 13;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'o') {
					j = 14;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'p') {
					j = 15;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'q') {
					j = 16;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'r') {
					j = 17;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 's') {
					j = 18;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 't') {
					j = 19;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'u') {
					j = 20;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'v') {
					j = 21;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'w') {
					j = 22;
					vetor2[i] = alfabeto[j + 3];
				} else if (vetor1[i] == 'x') {
					j = 23;
					vetor2[i] = alfabeto[j - 23];
				} else if (vetor1[i] == 'y') {
					j = 24;
					vetor2[i] = alfabeto[j - 23];
				} else if (vetor1[i] == 'z') {
					j = 25;
					vetor2[i] = alfabeto[j - 23];
				} else {
					vetor2[i] = palavra.charAt(i);
				}

			}
			for (int i = 0; i < vetor2.length; i++) {
				System.out.print(vetor2[i]);
			}
		} else if (SN.equalsIgnoreCase("Decifrar")) {
			System.out.println("Qual palavra?");
			String palavra2 = entrada.nextLine();
			System.out.println("");
			String palavra = entrada.nextLine();
			char alfabeto[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
					'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
			char vetor1[] = new char[palavra.length()];
			for (int i = 0; i < vetor1.length; i++) {
				vetor1[i] = palavra.charAt(i);
			}
			char vetor2[] = new char[palavra.length()];

			for (int i = 0; i < vetor1.length; i++) {

				int j = 0;
				if (vetor1[i] == 'a') {
					j = 0;
					vetor2[i] = alfabeto[j + 23];
				} else if (vetor1[i] == 'b') {
					j = 1;
					vetor2[i] = alfabeto[j + 23];
				} else if (vetor1[i] == 'c') {
					j = 2;
					vetor2[i] = alfabeto[j + 23];
				} else if (vetor1[i] == 'd') {
					j = 3;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'e') {
					j = 4;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'f') {
					j = 5;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'g') {
					j = 6;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'h') {
					j = 7;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'i') {
					j = 8;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'j') {
					j = 9;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'k') {
					j = 10;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'l') {
					j = 11;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'm') {
					j = 12;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'n') {
					j = 13;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'o') {
					j = 14;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'p') {
					j = 15;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'q') {
					j = 16;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'r') {
					j = 17;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 's') {
					j = 18;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 't') {
					j = 19;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'u') {
					j = 20;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'v') {
					j = 21;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'w') {
					j = 22;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'x') {
					j = 23;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'y') {
					j = 24;
					vetor2[i] = alfabeto[j - 3];
				} else if (vetor1[i] == 'z') {
					j = 25;
					vetor2[i] = alfabeto[j - 3];
				} else {
					vetor2[i] = palavra.charAt(i);
				}

			}
			for (int i = 0; i < vetor2.length; i++) {
				System.out.print(vetor2[i]);
			}

		}
	}
}
