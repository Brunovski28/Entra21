package Animais;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cachorro, Gato, Pato e Gaviao");
		System.out.println("Voc� tem qual animal?");
		String animal = entrada.next();
		boolean estimacao = false;
		if (animal.equalsIgnoreCase("Cachorro")) {
			System.out.println("Qual o peso dele?");
			int peso = entrada.nextInt();
			System.out.println("Qual a ra�a dele?");
			String raca = entrada.next();
			System.out.println("Ele � de estima��o?");
			String SN = entrada.next();
			Cachorro cachorro = new Cachorro(raca);			
			cachorro.setPeso(peso);
			if (SN.equalsIgnoreCase("Sim")) {
				estimacao = true;
				cachorro.setEstimacao(estimacao);
				System.out.println("Ent�o ele tem " + cachorro.getPeso() + "kg, a ra�a � " + cachorro.raca
						+ "\nEle � de estima��o e faz:");
				cachorro.barulho();
			} else {
				cachorro.setEstimacao(estimacao);
				System.out.println("Ent�o ele tem " + cachorro.getPeso() + ", a ra�a � " + cachorro.raca
						+ "\nEle n�o � de estima��o e faz:");
				cachorro.barulho();
			}

		} else if (animal.equalsIgnoreCase("Gato")) {
			System.out.println("Qual o peso dele?");
			int peso = entrada.nextInt();
			System.out.println("Qual a ra�a dele?");
			String raca = entrada.next();
			System.out.println("Ele � de estima��o?");
			String SN = entrada.next();
			Gato gato = new Gato(raca);
			gato.setPeso(peso);
			if (SN.equalsIgnoreCase("Sim")) {
				estimacao = true;
				gato.setEstimacao(estimacao);
				System.out.println("Ent�o ele tem " + gato.getPeso() + "kg, a ra�a � " + gato.raca
						+ "\nEle � de estima��o e faz:");
				gato.barulho();
			} else {
				gato.setEstimacao(estimacao);
				System.out.println("Ent�o ele tem " + gato.getPeso() + ", a ra�a � " + gato.raca
						+ "\nEle n�o � de estima��o e faz:");
				gato.barulho();
			}
		} else if (animal.equalsIgnoreCase("Pato")) {
			System.out.println("Qual o peso dele?");
			int peso = entrada.nextInt();
			System.out.println("Qual a ra�a dele?");
			String raca = entrada.next();
			System.out.println("Ele � de estima��o?");
			String SN = entrada.next();
			Pato pato = new Pato(raca);
			pato.setPeso(peso);
			if (SN.equalsIgnoreCase("Sim")) {
				estimacao = true;
				pato.setEstimacao(estimacao);
				System.out.println("Ent�o ele tem " + pato.getPeso() + "kg, a ra�a � " + pato.raca
						+ "\nEle � de estima��o e faz:");
				pato.barulho();
			} else {
				pato.setEstimacao(estimacao);
				System.out.println("Ent�o ele tem " + pato.getPeso() + ", a ra�a � " + pato.raca
						+ "\nEle n�o � de estima��o e faz:");
				pato.barulho();
			}
		} else if (animal.equalsIgnoreCase("Gaviao")) {
			System.out.println("Qual o peso dele?");
			int peso = entrada.nextInt();
			System.out.println("Qual a ra�a dele?");
			String raca = entrada.next();
			System.out.println("Ele � de estima��o?");
			String SN = entrada.next();
			Gaviao GAVIAO = new Gaviao(raca);
			GAVIAO.setPeso(peso);
			if (SN.equalsIgnoreCase("Sim")) {
				estimacao = true;
				GAVIAO.setEstimacao(estimacao);
				System.out.println("Ent�o ele tem " + GAVIAO.getPeso() + "kg, a ra�a � " + GAVIAO.raca
						+ "\nEle � de estima��o e faz:");
				GAVIAO.barulho();
			} else {
				GAVIAO.setEstimacao(estimacao);
				System.out.println("Ent�o ele tem " + GAVIAO.getPeso() + ", a ra�a � " + GAVIAO.raca
						+ "\nEle n�o � de estima��o e faz:");
				GAVIAO.barulho();
			}
		}
	}

}
