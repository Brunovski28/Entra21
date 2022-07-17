package ShopDeCarro;

import java.time.LocalDate;

public class Pessoa {
	
	private String nome;
	private LocalDate dataNasc;
	private Endereco endereco;
	public Pessoa(String nome, LocalDate dataNasc, Endereco endereco) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.isBlank() || nome == null) {
			throw new IllegalArgumentException("Nome não colocado!");
		} else {
		this.nome = nome;
		}
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
