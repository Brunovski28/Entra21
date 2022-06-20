package BusaoEscolar;

import java.util.Scanner;

public class OnibusEscolar {
	private int estudante;
	private int professor;
	public OnibusEscolar(int estudante, int professor) {
		setEstudante (estudante);
		setProfessor (professor);
	}
	public int getEstudante() {
		return estudante;
	}
	public void setEstudante(int estudante) {
		if (estudante < 0) {
			throw new IllegalArgumentException("Número de estudantes impossível");
		} else if (estudante > 40) {
			setEstudante(40);
		}
		this.estudante = estudante;
	}
	public int getProfessor() {
		return professor;
	}
	public void setProfessor(int professor) {
		if (professor < 0) {
			throw new IllegalArgumentException("Número de professores impossível");
		} else if (professor == 0) {
			setEstudante(0);
			System.out.println("Estudantes: "+getEstudante());
		}
		this.professor = professor;
	}
	Scanner entrada = new Scanner(System.in);
	public void removerAluno() {
		System.out.println("Deseja remover quantos alunos?");
		int rem = entrada.nextInt();
		if (rem > getEstudante()) {
			throw new IllegalArgumentException("Pedido de remoção maior do que o número de alunos");
		}
		System.out.println("Tinha "+getEstudante()+" alunos, passou para "+(getEstudante()-rem)+" alunos.");
	}
}
