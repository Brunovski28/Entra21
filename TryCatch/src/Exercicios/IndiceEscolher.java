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
			System.out.println("Voc� quer mudar qual �ndice?");
			int qual = entrada.nextInt();
			if (qual < 0 || qual > tamanho) {
				throw new IllegalArgumentException();
			}
			System.out.println("Qual n�mero voc� quer mudar?");
			double mudanca = entrada.nextDouble();
			lista.set(qual, mudanca);
			System.out.println(lista);
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		

	}

}
