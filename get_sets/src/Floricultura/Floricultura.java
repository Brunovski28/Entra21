package Floricultura;

public class Floricultura {
String nome;
double preco;
String nomecliente;
boolean comprada;
boolean presente;
public Floricultura(String nome, double preco, String nomecliente, boolean comprada, boolean presente) {

	this.nome = nome;
	this.preco = preco;
	this.nomecliente = nomecliente;
	this.comprada = comprada;
	this.presente = presente;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public String getNomecliente() {
	return nomecliente;
}
public void setNomecliente(String nomecliente) {
	this.nomecliente = nomecliente;
}
public boolean isComprada() {
	return comprada;
}
public void setComprada(boolean comprada) {
	this.comprada = comprada;
}
public boolean isPresente() {
	return presente;
}
public void setPresente(boolean presente) {
	this.presente = presente;
}

}
