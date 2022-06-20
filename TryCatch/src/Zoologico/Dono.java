package Zoologico;

public class Dono {

	private String nome;
	private String cpf;
	private Endereco endereco;
	public Dono(String nome, String cpf, Endereco endereco) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.isBlank()) {
			throw new IllegalArgumentException("Nome incorreto!");
		}
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if (cpf.length() != 11) {
			throw new IllegalArgumentException("CPF incorreto!");
		}
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
