package Empresa;

public class Trabalhador {
	private String nome;
	private double salario;
	private int dataingresso;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getDataingresso() {
		return dataingresso;
	}
	public void setDataingresso(int dataingresso) {
		this.dataingresso = dataingresso;
	}
	public void demitir() {
		this.salario = 0;
		System.out.println(getNome()+" se demitiu e seu salario foi zerado!");
	}
}
