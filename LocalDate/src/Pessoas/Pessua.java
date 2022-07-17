package Pessoas;

import java.time.LocalDate;

public class Pessua {
private String nome;
private char sexo;
private LocalDate dataNasc;
private String estadoCivil;
public Pessua(String nome, char sexo, LocalDate dataNasc, String estadoCivil) {
	super();
	this.nome = nome;
	this.sexo = sexo;
	this.dataNasc = dataNasc;
	this.estadoCivil = estadoCivil;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public char getSexo() {
	return sexo;
}
public void setSexo(char sexo) {
	this.sexo = sexo;
}
public LocalDate getDataNasc() {
	return dataNasc;
}
public void setDataNasc(LocalDate dataNasc) {
	this.dataNasc = dataNasc;
}
public String getEstadoCivil() {
	return estadoCivil;
}
public void setEstadoCivil(String estadoCivil) {
	this.estadoCivil = estadoCivil;
}

}
