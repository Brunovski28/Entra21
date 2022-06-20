package Exercicios;

import java.util.Scanner;

public class TryMedia {

	public static void main(Data[] args) {
		Scanner entrada = new Scanner(System.in);
				int c = 0;
			double soma = 0;
			double nota = 0;	
		try {

			while (true) {
				
				System.out.println("Qual a "+(c+1)+"° nota?");
				nota = entrada.nextDouble();
				if (nota == 0) {
					break;
				}
				soma += nota;
				c++;
			}
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		System.out.println("A média é "+soma/c);
	}

}
