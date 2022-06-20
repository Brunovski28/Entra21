package Mercado;

import java.util.ArrayList;

public class Mercado {

	private int macavendida;
	private double precovendamaca;
	private int laranjavendida;
	private double precovendalaranja;
	static ArrayList<Mercado> lista = new ArrayList<Mercado>();
	public Mercado(int macavendida, double precovendamaca, int laranjavendida, double precovendalaranja) {
		super();
		this.macavendida = macavendida;
		this.precovendamaca = precovendamaca;
		this.laranjavendida = laranjavendida;
		this.precovendalaranja = precovendalaranja;
		this.lista.add(this);
	}
	public int getMacavendida() {
		return macavendida;
	}
	public void setMacavendida(int macavendida) {
		if (macavendida < 0) {
			throw new IllegalArgumentException("Quantidade de maçã errada!");
		}
		this.macavendida = macavendida;
	}
	public double getPrecovendamaca() {
		return precovendamaca;
	}
	public void setPrecovendamaca(double precovendamaca) {
		if (precovendamaca < 0) {
			throw new IllegalArgumentException("preço de venda da maçã errada!");
		}
		this.precovendamaca = precovendamaca;
	}
	public int getLaranjavendida() {
		return laranjavendida;
	}
	public void setLaranjavendida(int laranjavendida) {
		if (laranjavendida < 0) {
			throw new IllegalArgumentException("Quantidade de laranja errada!");
		}
		this.laranjavendida = laranjavendida;
	}
	public double getPrecovendalaranja() {
		return precovendalaranja;
	}
	public void setPrecovendalaranja(double precovendalaranja) {
		if (precovendalaranja < 0) {
			throw new IllegalArgumentException("Preço de venda da laranja errada!");
		}
		this.precovendalaranja = precovendalaranja;
	}
	
	
}
