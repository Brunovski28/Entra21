package Void09;

import java.util.Scanner;

public class BasePerto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String receba = "";
		int vetor[] = new int[2];
		System.out.println("Qual o número da base?");
		int base = entrada.nextInt();
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Qual o "+(i+1)+" vetor?");
			vetor[i] = entrada.nextInt();
		}
		Metodo baso = new Metodo();
		receba = baso.perto(vetor, base);
		System.out.println(receba);
	}

}
