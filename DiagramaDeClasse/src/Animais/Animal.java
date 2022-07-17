package Animais;

public class Animal {
String raca;
boolean estimacao;
int peso;
public String getEspecie() {
	return raca;
}
public void setEspecie(String especie) {
	this.raca = especie;
}
public boolean isEstimacao() {
	return estimacao;
}
public void setEstimacao(boolean estimacao) {
	this.estimacao = estimacao;
}
public int getPeso() {
	return peso;
}
public void setPeso(int peso) {
	this.peso = peso;
}
public void barulho() {
	
}
}
