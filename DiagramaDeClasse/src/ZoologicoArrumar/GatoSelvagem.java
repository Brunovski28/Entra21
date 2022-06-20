package ZoologicoArrumar;

import java.util.ArrayList;

public class GatoSelvagem extends Animal{
private String CorDaPelagem;
static ArrayList<String> cor = new ArrayList<>();
public GatoSelvagem(String raca, String nomeIdentificacao, String porte, String corDaPelagem) {
	super(raca, nomeIdentificacao, porte, animal);
	CorDaPelagem = corDaPelagem;
	this.animal.add(this);
	this.cor.add(getCorDaPelagem());
}

public String getCorDaPelagem() {
	return CorDaPelagem;
}

public void setCorDaPelagem(String corDaPelagem) {
	CorDaPelagem = corDaPelagem;
}
 
}
