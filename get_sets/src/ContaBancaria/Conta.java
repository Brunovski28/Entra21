package ContaBancaria;

public class Conta {
	private String nome;
	private double saldo;

	public Conta(String nome, double saldo) {

		setNome(nome);
		setSaldo(saldo);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;

	}

	public void sacar(double valor) {
		if (saldo <= valor) {
			System.out.println("tú é pobre");
		} else {
			setSaldo(valor - this.saldo); 
		}

	}

	public void setDepositar(double depositar) {
		this.saldo += depositar;
	}

	public double getsaldo() {
		return this.saldo;
	}
}
