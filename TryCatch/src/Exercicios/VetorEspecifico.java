package Exercicios;

import java.util.Scanner;

public class VetorEspecifico {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int vetor[] = new int[5];
		try {
			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = 2 * (8 + i);
			}
			System.out.println("Qual índice você deseja pegar");
			int ve = entrada.nextInt();
			System.out.println(vetor[ve]);
		} catch (Exception e) {
			System.out.println("INDICE ERRADO");
		}

	}

}
