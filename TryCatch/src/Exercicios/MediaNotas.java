package Exercicios;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double media = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("Qual a "+(i+1)+"° nota?");
			double nota = entrada.nextDouble();
			if (nota < 0 || nota > 10) {
				throw new IllegalArgumentException("Nota fora do limite 0-10");
			}
			media += nota;
		}
		System.out.println("A média das notas: "+media/3);
	}

}
