package Funcionario;

import java.time.LocalDate;

public class Funcionario {

	private String nome;
	private int id;
	private double salario;
	private LocalDate dataNasc;
	private Endereco endereco;
	public Funcionario(String nome, int id, double salario, LocalDate dataNasc, Endereco endereco) {
		super();
		this.nome = nome;
		this.id = id;
		this.salario = salario;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.isBlank() || nome == null) {
			throw new IllegalArgumentException("Nome não preenchido!");
		}
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
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
