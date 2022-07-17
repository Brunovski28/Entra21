package Void03;

import java.util.Scanner;

public class Soma4Numeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetor[] = new int[4];
		int receba = 0;
				
				for (int i = 0; i < vetor.length; i++) {
					System.out.println("Qual o "+(i+1)+"° número?");
					vetor[i] = entrada.nextInt();
				}
				Metodo Golf = new Metodo();
				receba = Golf.fds(vetor);
				
				System.out.println("A soma deu "+receba);
	}

}
