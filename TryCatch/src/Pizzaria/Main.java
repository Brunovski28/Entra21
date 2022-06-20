package Pizzaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Pizza calabresa = new Pizza("Calabresa", "Mortandela", 10, 200);//20
		Pizza queijo4 = new Pizza("4 queijos", "Queijo", 5, 150);//30
		Pizza queijo5 = new Pizza("5 queijos", "Queijo", 4, 120);//40
		Pizza peperone = new Pizza("Peperone", "Calabresa", 9, 180); //20
		Pizza alhoOleo = new Pizza("Alho e Oleo", "Alho e Oleo", 15, 250); // 16

		System.out.println("Deseja mudar algum ingrediente?");
		String SN = entrada.next();
		int vetor[] = new int[5];
		if (SN.equalsIgnoreCase("sim")) {
			calabresa.mudarIngrediente();
		}
		int menor = Integer.MAX_VALUE;
		int id = 0;
		for (int i = 0; i < 5; i++) {
			vetor[i] = Pizza.lista.get(i).getPreco() / Pizza.lista.get(i).getDiametro();
		}
		for (int i = 0; i < 5; i++) {
			if (vetor[i] < menor) {
				menor = vetor[i];
				id = i;
			}
		}
		System.out.println(Pizza.lista.get(id).getNome()+" é a mais barata custando "+menor+" reais.");
	}

}
