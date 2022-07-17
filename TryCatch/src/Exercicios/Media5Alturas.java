package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Media5Alturas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		ArrayList<Double> altura = new ArrayList<Double>();
		try {
			double soma = 0;
			for (int i = 0; i < 5; i++) {
				System.out.println("Qual a " + (i + 1) + " altura?");
				double alturaa = entrada.nextDouble();
				altura.add(i, alturaa);

			}
			for (int j = 0; j < 5; j++) {
				soma += altura.get(j);
			}
			System.out.println(soma);
			System.out.println("A média das alturas é " + (soma / 5));
		} catch (Exception e) {
			System.out.println("ERROR");
		}

	}

}
