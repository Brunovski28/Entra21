package OperacaoSoma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("1� N�mero");
		double num1 = entrada.nextDouble();
		System.out.println("2� N�mero");
		double num2 = entrada.nextDouble();
		
		System.out.println("Qual opera��o?\n1 - adi��o\n2 - subtra��o\n3 - Divis�o\n4 - Multiplica��o");
		int opr = entrada.nextInt();
		
		switch (opr) {
		case 1:
			System.out.println("A soma deu "+(num1+num2));
			break;
		case 2:
			System.out.println("A subtra��o deu "+(num1-num2));
			break;
		case 3:
			System.out.println("A divis�o deu "+num1/num2);
			break;
		case 4:
			System.out.println("A multiplica��o deu "+num1*num2);
			break;
		default:
			System.out.println("Opera��o errada");
		}
	}
}
