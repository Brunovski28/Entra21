package Escola;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Voc� � furbista ou est� no ensino m�dio?");
		String bagui = entrada.next();
		if (bagui.equalsIgnoreCase("Furbista")) {
		System.out.println("Qual o nome do infeliz?");
		String nome = entrada.next();
		System.out.println("Qual a idade do infeliz?");
		int idade = entrada.nextInt();
		System.out.println("Qual curso voc� deseja fazer?\n(V)estibular\n(E)nem\n(S)eletivo especial\n(T)Transfer�ncia externa\nTransf�rencia (I)nterna");
		char curso = entrada.next().charAt(0);
		AlunoFurbista furb = new AlunoFurbista(curso, nome);
		} else if (bagui.equalsIgnoreCase("EnsinoMedio")) {
			System.out.println("Que ano est�?");
			int ano = entrada.nextInt();
			AlunoEnsinoMedio ens = new AlunoEnsinoMedio(ano);
		}
	}

}
