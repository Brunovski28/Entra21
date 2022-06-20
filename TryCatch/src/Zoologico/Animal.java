package Zoologico;

import java.util.ArrayList;

public class Animal {

	private int peso;
	private String nomeidentificacao;
	private String porte;
	private Dono dono;
	static ArrayList<Animal> lista = new ArrayList<>();
	public Animal(int peso, String nomeidentificacao, String porte, Dono dono) {
		super();
		this.peso = peso;
		this.nomeidentificacao = nomeidentificacao;
		this.porte = porte;
		this.dono = dono;
		this.lista.add(this);
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		if (peso < 0) {
			throw new IllegalArgumentException("Peso incorreto!");
		}
		this.peso = peso;
	}
	public String getNomeidentificacao() {
		return nomeidentificacao;
	}
	public void setNomeidentificacao(String nomeidentificacao) {
		if (nomeidentificacao.isBlank() || nomeidentificacao == null) {
			throw new IllegalArgumentException("Nome de identificação incorreta!");
		}
		this.nomeidentificacao = nomeidentificacao;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		if (porte.equalsIgnoreCase("pequeno")) {
			
		} else if (porte.equalsIgnoreCase("medio")){

		} else if (porte.equalsIgnoreCase("grande")) {
			
		} else {
			throw new IllegalArgumentException("Porte incorreto!");
		}
		this.porte = porte;
	}
	public Dono getDono() {
		return dono;
	}
	public void setDono(Dono dono) {
		this.dono = dono;
	}
	
	
}
