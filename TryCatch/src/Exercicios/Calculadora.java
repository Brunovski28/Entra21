package Exercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		try {
		System.out.println("Primeiro n�mero");
		double num1 = entrada.nextDouble();
		System.out.println("Segundo n�mero");
		double num2 = entrada.nextDouble();
		
		System.out.println("Qual opera��o?\n1 - Soma\n2 - Subtrac�o\n3 - Multiplica��o\n4 - Divis�o");
		int opr = entrada.nextInt();
		
		if (opr == 1) {
			System.out.println("Soma deu "+num1+num2);
		} else if (opr == 2) {
			System.out.println("Subtra��o deu "+(num1-num2));
		} else if (opr == 3) {
			System.out.println("Multiplica��o deu "+num1*num2);
		} else if (opr == 4) {
			System.out.println("Divis�o deu "+num1/num2);
		} else {
			throw new IllegalAccessException("Opera��o inv�lida");
		}
		} catch (Exception e) {
			System.out.println("ERRO");
		}

		

	}

}
