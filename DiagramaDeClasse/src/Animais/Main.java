package Animais;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cachorro, Gato, Pato e Gaviao");
		System.out.println("Você tem qual animal?");
		String animal = entrada.next();
		boolean estimacao = false;
		if (animal.equalsIgnoreCase("Cachorro")) {
			System.out.println("Qual o peso dele?");
			int peso = entrada.nextInt();
			System.out.println("Qual a raça dele?");
			String raca = entrada.next();
			System.out.println("Ele é de estimação?");
			String SN = entrada.next();
			Cachorro cachorro = new Cachorro(raca);			
			cachorro.setPeso(peso);
			if (SN.equalsIgnoreCase("Sim")) {
				estimacao = true;
				cachorro.setEstimacao(estimacao);
				System.out.println("Então ele tem " + cachorro.getPeso() + "kg, a raça é " + cachorro.raca
						+ "\nEle é de estimação e faz:");
				cachorro.barulho();
			} else {
				cachorro.setEstimacao(estimacao);
				System.out.println("Então ele tem " + cachorro.getPeso() + ", a raça é " + cachorro.raca
						+ "\nEle não é de estimação e faz:");
				cachorro.barulho();
			}

		} else if (animal.equalsIgnoreCase("Gato")) {
			System.out.println("Qual o peso dele?");
			int peso = entrada.nextInt();
			System.out.println("Qual a raça dele?");
			String raca = entrada.next();
			System.out.println("Ele é de estimação?");
			String SN = entrada.next();
			Gato gato = new Gato(raca);
			gato.setPeso(peso);
			if (SN.equalsIgnoreCase("Sim")) {
				estimacao = true;
				gato.setEstimacao(estimacao);
				System.out.println("Então ele tem " + gato.getPeso() + "kg, a raça é " + gato.raca
						+ "\nEle é de estimação e faz:");
				gato.barulho();
			} else {
				gato.setEstimacao(estimacao);
				System.out.println("Então ele tem " + gato.getPeso() + ", a raça é " + gato.raca
						+ "\nEle não é de estimação e faz:");
				gato.barulho();
			}
		} else if (animal.equalsIgnoreCase("Pato")) {
			System.out.println("Qual o peso dele?");
			int peso = entrada.nextInt();
			System.out.println("Qual a raça dele?");
			String raca = entrada.next();
			System.out.println("Ele é de estimação?");
			String SN = entrada.next();
			Pato pato = new Pato(raca);
			pato.setPeso(peso);
			if (SN.equalsIgnoreCase("Sim")) {
				estimacao = true;
				pato.setEstimacao(estimacao);
				System.out.println("Então ele tem " + pato.getPeso() + "kg, a raça é " + pato.raca
						+ "\nEle é de estimação e faz:");
				pato.barulho();
			} else {
				pato.setEstimacao(estimacao);
				System.out.println("Então ele tem " + pato.getPeso() + ", a raça é " + pato.raca
						+ "\nEle não é de estimação e faz:");
				pato.barulho();
			}
		} else if (animal.equalsIgnoreCase("Gaviao")) {
			System.out.println("Qual o peso dele?");
			int peso = entrada.nextInt();
			System.out.println("Qual a raça dele?");
			String raca = entrada.next();
			System.out.println("Ele é de estimação?");
			String SN = entrada.next();
			Gaviao GAVIAO = new Gaviao(raca);
			GAVIAO.setPeso(peso);
			if (SN.equalsIgnoreCase("Sim")) {
				estimacao = true;
				GAVIAO.setEstimacao(estimacao);
				System.out.println("Então ele tem " + GAVIAO.getPeso() + "kg, a raça é " + GAVIAO.raca
						+ "\nEle é de estimação e faz:");
				GAVIAO.barulho();
			} else {
				GAVIAO.setEstimacao(estimacao);
				System.out.println("Então ele tem " + GAVIAO.getPeso() + ", a raça é " + GAVIAO.raca
						+ "\nEle não é de estimação e faz:");
				GAVIAO.barulho();
			}
		}
	}

}
