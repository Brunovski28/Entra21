package ShopDeCarro;

import java.time.LocalDate;

public class Vendedor extends Pessoa{

	private int id;
	private double salario;

	public Vendedor(String nome, LocalDate dataNasc, Endereco endereco, int id, double salario) {
		super(nome, dataNasc, endereco);
		this.id = id;
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id < 0) {
			throw new IllegalArgumentException("Id inconsistente");
		} else {
			this.id = id;
		}
		
	}
	
}
