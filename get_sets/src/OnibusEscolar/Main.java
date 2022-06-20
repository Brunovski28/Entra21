package OnibusEscolar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos");
		int aluno = entrada.nextInt();
		System.out.println("Quantos professores");
		int professor = entrada.nextInt();
		
		OnibusEscolar Bus = new OnibusEscolar(aluno, professor);
		Bus.setEstudantes(aluno);
		Bus.setProfessor(professor);
		System.out.println(Bus.getEstudantes()+" Alunos");
		System.out.println(Bus.getProfessor()+" Professores");
		System.out.println("Quer tirar quantos alunos?");
		int remover = entrada.nextInt();
	remover = Bus.removerEstudantes(remover);
		System.out.println("Foram removidos " + remover + " alunos ficando "+Bus.getEstudantes());
	}

}
