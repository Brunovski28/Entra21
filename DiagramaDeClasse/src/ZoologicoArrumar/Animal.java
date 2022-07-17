package ZoologicoArrumar;

import java.util.ArrayList;

import ConcessionariaTelefonia.Telefone;

public class Animal {
private String raca;
private String nomeIdentificacao;
private String porte;
static ArrayList<Animal> animal = new ArrayList<Animal>();
public Animal(String raca, String nomeIdentificacao, String porte, ArrayList<Animal> animal) {
	super();
	this.raca = raca;
	this.nomeIdentificacao = nomeIdentificacao;
	this.porte = porte;
	this.animal = animal;
}
public String getRaca() {
	return raca;
}
public void setRaca(String raca) {
	this.raca = raca;
}
public String getNomeIdentificacao() {
	return nomeIdentificacao;
}
public void setNomeIdentificacao(String nomeIdentificacao) {
	this.nomeIdentificacao = nomeIdentificacao;
}
public String getPorte() {
	return porte;
}
public void setPorte(String porte) {
	this.porte = porte;
}

}
