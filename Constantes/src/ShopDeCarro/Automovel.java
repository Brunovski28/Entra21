package ShopDeCarro;

import java.util.ArrayList;

public class Automovel {

	private String modelo;
	private int peso;
	private Dono dono;
	private Vendedor vendedor;
	private Cores cor;
	static ArrayList<Automovel> lista = new ArrayList<Automovel>();
	public Automovel(String modelo, int peso, Dono dono, Vendedor vendedor, Cores cor) {
		super();
		this.modelo = modelo;
		this.peso = peso;
		this.dono = dono;
		this.vendedor = vendedor;
		this.cor = cor;
		this.lista.add(this);
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if (modelo.isBlank() || modelo == null) {
			throw new IllegalArgumentException("Modelo não colocado!");
		} else {
		this.modelo = modelo;
		}
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		if (peso < 0) {
			throw new IllegalArgumentException("Peso inconsistente!");
		} else {
			this.peso = peso;
		}
		
	}
	public Dono getDono() {
		return dono;
	}
	public void setDono(Dono dono) {
		this.dono = dono;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Cores getCor() {
		return cor;
	}
	public void setCor(Cores cor) {
		this.cor = cor;
	}
	
	
}
