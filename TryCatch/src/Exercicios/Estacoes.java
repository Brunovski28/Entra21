package Exercicios;

import java.util.Scanner;

public class Estacoes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("1 - Verão\n2 - Inverno\n3 - Outono\n4 - Primavera");
		int estacao = entrada.nextInt();
		
		if (estacao == 1) {
			System.out.println("Verão está quente");
		} else if (estacao == 2) {
			System.out.println("Inverno está gelado demais");
		} else if (estacao == 3) {
			System.out.println("Outono está gelado");
		} else if (estacao == 4) {
			System.out.println("Que porra é essa");
		} else {
			throw new IllegalArgumentException("Estação errada");
		}

	}

}
