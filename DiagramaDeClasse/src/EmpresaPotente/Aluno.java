package EmpresaPotente;

import java.time.LocalDate;

public class Aluno extends Pessoa{
private int ano;
private LocalDate dataFormatura;
public Aluno(String nome, String id, Endereco endereco, LocalDate dataIngresso, LocalDate dataNasc, int ano) {
	super(nome, id, endereco, dataIngresso, dataNasc);
	this.ano = ano;
	
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public LocalDate getDataFormatura() {
	return dataFormatura;
}
public void setDataFormatura(LocalDate dataFormatura) {
	this.dataFormatura = dataFormatura;
}
public void sair() {
	setAno(0);
	System.out.println("Ano: "+getAno());
}
}
