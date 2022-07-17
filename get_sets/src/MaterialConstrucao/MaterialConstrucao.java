package MaterialConstrucao;

import java.util.Scanner;

public class MaterialConstrucao {
private String nome;
private String descricao;
private double preco;
private double peso;
private double estoque;
public MaterialConstrucao(String nome, String descricao, double preco, double peso, double estoque) {
	setNome(nome);
	setDescricao(descricao);
	setPreco(preco);
	setPeso(peso);
	setEstoque(estoque);
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}
public double getEstoque() {
	return estoque;
}
public void setEstoque(double estoque) {
	this.estoque = estoque;
}
Scanner entrada = new Scanner(System.in);
public double vendaEstoque(double receba) {
	double est;
	while(true) {
	if ((receba-1) > estoque) {
		System.out.println("Não tem isso tudo de estoque!");
		System.out.println("Qual o estoque?");
		receba = entrada.nextInt();
	} else {
		est = estoque-receba;
		break;
	}
	}
	return est;
}

}
