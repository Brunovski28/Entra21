package Exercicios;

import java.util.Scanner;

public class Estacoes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("1 - Ver�o\n2 - Inverno\n3 - Outono\n4 - Primavera");
		int estacao = entrada.nextInt();
		
		if (estacao == 1) {
			System.out.println("Ver�o est� quente");
		} else if (estacao == 2) {
			System.out.println("Inverno est� gelado demais");
		} else if (estacao == 3) {
			System.out.println("Outono est� gelado");
		} else if (estacao == 4) {
			System.out.println("Que porra � essa");
		} else {
			throw new IllegalArgumentException("Esta��o errada");
		}

	}

}
