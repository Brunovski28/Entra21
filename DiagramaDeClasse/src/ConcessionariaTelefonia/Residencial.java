package ConcessionariaTelefonia;

import java.util.ArrayList;

public class Residencial extends Telefone{

	boolean internet;

	public Residencial(String nome, String endereco, String telefone, double pagar, boolean internet) {
		super(nome, endereco, telefone, pagar, linha);
		this.internet = internet;
		Telefone.linha.add(this);
	}

	public boolean isInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {
		this.internet = internet;
	}
	
	
	
	
	
	
}
