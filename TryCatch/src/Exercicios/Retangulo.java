package Exercicios;

import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a largura?");
		double largura = entrada.nextDouble();
		System.out.println("Qual a altura");
		double altura = entrada.nextDouble();

		if (largura < 0 || altura < 0) {
			throw new IllegalArgumentException("Dado fora");
		}
		area(largura, altura);
		perimetro(largura, altura);
		

	}
public static void area(double largura, double altura) {
	double area = largura * altura;
	System.out.println("A área é "+area);
}
public static void perimetro(double largura, double altura) {
	double perimetro = ((largura*2)+(2*altura));
	System.out.println("A área é "+perimetro);
}
}
