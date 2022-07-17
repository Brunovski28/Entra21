package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class IndiceEscolher {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Double> lista = new ArrayList<Double>();
		try {
			System.out.println("Qual o tamanho da array?");
			int tamanho = entrada.nextInt();
			for (int i = 0; i < tamanho; i++) {
				double b = 0;
				lista.add(i, b+10);
				b++;
			}
			System.out.println("Você quer mudar qual índice?");
			int qual = entrada.nextInt();
			if (qual < 0 || qual > tamanho) {
				throw new IllegalArgumentException();
			}
			System.out.println("Qual número você quer mudar?");
			double mudanca = entrada.nextDouble();
			lista.set(qual, mudanca);
			System.out.println(lista);
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		

	}

}
