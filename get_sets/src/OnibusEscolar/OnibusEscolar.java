package OnibusEscolar;

import java.util.Scanner;

public class OnibusEscolar {
private int estudantes;
private int professor;
private int remover;
public OnibusEscolar(int estudantes, int professor) {
	setEstudantes(estudantes);
	setProfessor(professor);
}
public int getEstudantes() {
	return estudantes;
}
public void setEstudantes(int estudantes) {
	if (estudantes > 40) {
		System.out.println("Limite excedido!");
		this.estudantes = 40;
	} else {
		this.estudantes = estudantes;
	}
}
public int getProfessor() {
	return professor;
}
public void setProfessor(int professor) {
	if (professor == 0) {
		this.estudantes = 0;
	} else {
		this.professor = professor;
	}
}
Scanner etr = new Scanner(System.in);
public int removerEstudantes(int remover) {
	while (true) {
		if (remover > this.estudantes) {
			System.out.println("Não possível!");
			System.out.println("Coloque o número novamente!");
			remover = etr.nextInt();
		} else {
	this.estudantes -= remover;
	break;
	
		}
	}
	return remover;

}


}
