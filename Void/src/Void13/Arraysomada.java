package Void13;

import java.util.Scanner;

public class Arraysomada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetor1[] = new int[5];
		int vetor2[] = new int[5];
		int vetor3[] = new int[5];
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Qual o " + (i + 1) + "° número?");
			vetor1[i] = entrada.nextInt();
		}
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Qual o " + (i + 1) + "° número?");
			vetor2[i] = entrada.nextInt();
		}
		Metodo GTI = new Metodo();
		
			vetor3 = GTI.fds(vetor1, vetor2);
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Vetor1 ["+vetor1[i]+"] Vetor2 ["+vetor2[i]+"] Vetor3 Resultado ["+vetor3[i]+"]");
		}
	}

}
