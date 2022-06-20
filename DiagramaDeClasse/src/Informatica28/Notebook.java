package Informatica28;

public class Notebook extends Computador {
	private double peso;

	public Notebook(double peso) {

		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean ehPesado() {
		if (peso > 3) {
			return true;
		} else {
		return false;
		}
		
	}
}
