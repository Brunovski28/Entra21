package ConcessionariaTelefonia;

import java.util.ArrayList;

public class Comercial extends Telefone{
	private String ramo;
	private boolean internet;
	private boolean dataantiga;
	public Comercial(String nome, String endereco, String telefone, double pagar, 
			String ramo, boolean internet, boolean dataantiga) {
		super(nome, endereco, telefone, pagar, linha);
		this.ramo = ramo;
		this.internet = internet;
		this.dataantiga = dataantiga;
		Telefone.linha.add(this);
	}
	public String getRamo() {
		return ramo;
	}
	public void setRamo(String ramo) {
		this.ramo = ramo;
	}
	public boolean isInternet() {
		return internet;
	}
	public void setInternet(boolean internet) {
		this.internet = internet;
	}
	public boolean isDataantiga() {
		return dataantiga;
	}
	public void setDataantiga(boolean dataantiga) {
		this.dataantiga = dataantiga;
	}
	
	
}
