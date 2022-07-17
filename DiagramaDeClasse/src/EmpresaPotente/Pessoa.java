package EmpresaPotente;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private String id;
	private Endereco endereco;
	private LocalDate dataIngresso;
	private LocalDate dataNasc;
	public Pessoa(String nome, String id, Endereco endereco, LocalDate dataIngresso, LocalDate dataNasc) {
		
		this.nome = nome;
		this.id = id;
		this.endereco = endereco;
		this.dataIngresso = dataIngresso;
		this.dataNasc = dataNasc;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public LocalDate getDataIngresso() {
		return dataIngresso;
	}
	public void setDataIngresso(LocalDate dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
}
