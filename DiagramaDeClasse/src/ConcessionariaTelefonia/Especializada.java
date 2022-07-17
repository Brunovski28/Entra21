package ConcessionariaTelefonia;

import java.util.ArrayList;

public class Especializada extends Telefone{
private boolean internet;
private int qtd;
private boolean dataantiga;
public Especializada(String nome, String endereco, String telefone, double pagar, 
		boolean internet, int qtd, boolean dataantiga) {
	super(nome, endereco, telefone, pagar, linha);
	this.internet = internet;
	this.qtd = qtd;
	this.dataantiga = dataantiga;
	Telefone.linha.add(this);
}
public boolean isInternet() {
	return internet;
}
public void setInternet(boolean internet) {
	this.internet = internet;
}
public int getQtd() {
	return qtd;
}
public void setQtd(int qtd) {
	this.qtd = qtd;
}
public boolean isDataantiga() {
	return dataantiga;
}
public void setDataantiga(boolean dataantiga) {
	this.dataantiga = dataantiga;
}


}
