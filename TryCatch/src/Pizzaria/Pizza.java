package Pizzaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizza {
	private String nome;
	private String ingrediente;
	private int diametro;
	private int preco;
	static ArrayList<Pizza> lista = new ArrayList<>();
	public Pizza(String nome, String ingrediente, int diametro, int preco) {
		this.nome = nome;
		setIngrediente (ingrediente);
		this.diametro = diametro;
		this.preco = preco;
		this.lista.add(this);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.isBlank()) {
			throw new IllegalArgumentException("Nome inválido!");
		}
		this.nome = nome;
	}
	public String getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(String ingrediente) {
		if (ingrediente.isBlank()) {
			throw new IllegalArgumentException("Ingrediente inválido!");
		}
		this.ingrediente = ingrediente;
	}
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		if (diametro < 0) {
			throw new IllegalArgumentException("Diametro não pode ser menor que zero!");
		}
		this.diametro = diametro;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		if (preco < 0) {
			throw new IllegalArgumentException("Preço não pode ser menor que zero!");
		}
		this.preco = preco;
	}
	Scanner entrada = new Scanner(System.in);
	public void mudarIngrediente() {
		System.out.println("1 - Calabresa\n2 - 4 Queijo\n3 - 5 Queijo\n4 - Peperone\n5 - Alho e Óleo");
		int opc = entrada.nextInt();
		System.out.println("Qual o ingrediente novo?");
		String ingre = entrada.next();
		System.out.print("Passou de "+lista.get(opc-1).getIngrediente());
		lista.get(opc-1).setIngrediente(ingre);
		System.out.print(" para "+lista.get(opc-1).getIngrediente());
	}
}
