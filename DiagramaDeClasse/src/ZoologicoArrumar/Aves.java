package ZoologicoArrumar;

import java.util.ArrayList;

public class Aves extends Animal{
private String corDaPena;
private String tipoAlimentacao;
static ArrayList<String> tipo = new ArrayList<>();
static ArrayList<String> pena = new ArrayList<>();
public Aves(String raca, String nomeIdentificacao, String porte, String corDaPena, String tipoAlimentacao) {
	super(raca, nomeIdentificacao, porte, animal);
	this.corDaPena = corDaPena;
	this.tipoAlimentacao = tipoAlimentacao;
	this.animal.add(this);
	this.tipo.add(getTipoAlimentacao());
	this.pena.add(getCorDaPena());
}
public String getCorDaPena() {
	return corDaPena;
}
public void setCorDaPena(String corDaPena) {
	this.corDaPena = corDaPena;
}
public String getTipoAlimentacao() {
	return tipoAlimentacao;
}
public void setTipoAlimentacao(String tipoAlimentacao) {
	this.tipoAlimentacao = tipoAlimentacao;
}

}
