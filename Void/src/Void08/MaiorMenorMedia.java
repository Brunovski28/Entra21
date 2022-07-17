package Void08;

import java.util.Scanner;

public class MaiorMenorMedia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetor[] = new int[5];
		String receba = "";
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Qual o "+(i+1)+"° valor?");
			vetor[i] = entrada.nextInt();
		}
		Metodo tudo = new Metodo();
		receba = tudo.maiormenormedia(vetor);
		System.out.println(receba);
		
	}

}
