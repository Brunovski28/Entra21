package CalculoCirculo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o raio do circulo?");
		double raio = entrada.nextDouble();
		System.out.println("Qual a cor do circulo?");
		String cor = entrada.next();
		
		Circulo raior = new Circulo(cor, raio);
		
		raior.setRaio(raio);
		System.out.println("Qual a altura do cilindro?");
		double altura = entrada.nextDouble();
		System.out.println("Qual a cor do cilindro?");
		String corc = entrada.next();
		System.out.println("Qual o raio?");
		double raiorr = entrada.nextDouble();
		Cilindro alturar = new Cilindro(corc, raiorr, altura);
		System.out.println("O volume é "+alturar.getArea());
	}

}
