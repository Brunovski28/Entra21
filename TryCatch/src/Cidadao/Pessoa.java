package Cidadao;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private LocalDate dataNasc;
	private Endereco endereco;
	static ArrayList<Pessoa> lista = new ArrayList<>();
	public Pessoa(String nome, LocalDate dataNasc, Endereco endereco) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
		this.lista.add(this);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.isBlank()) {
			throw new IllegalArgumentException("Nome inválido!");
		}
		this.nome = nome;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
