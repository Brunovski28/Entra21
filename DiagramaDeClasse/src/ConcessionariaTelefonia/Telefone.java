package ConcessionariaTelefonia;

import java.util.ArrayList;

public class Telefone {
	private String nome;
	private String endereco;
	private String telefone;
	private double pagar;
	
	
	static ArrayList<Telefone> linha = new ArrayList<>();
	
	
	
	public Telefone(String nome, String endereco, String telefone, double pagar, ArrayList<Telefone> linha) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.pagar = pagar;
		this.linha = linha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public double getPagar() {
		return pagar;
	}
	public void setPagar(double pagar) {
		this.pagar = pagar;
	}
	
}
