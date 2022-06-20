package BusaoEscolar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos estudantes?");
		int estudantes = entrada.nextInt();
		System.out.println("Quantos professores?");
		int professores = entrada.nextInt();
		OnibusEscolar classe = new OnibusEscolar(estudantes, professores);
		
		System.out.println("Deseja remover alunos?");
		String SN = entrada.next();
		
		if (SN.equalsIgnoreCase("sim")) {
			classe.removerAluno();
		}

	}

}
