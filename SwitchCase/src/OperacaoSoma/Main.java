package OperacaoSoma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("1° Número");
		double num1 = entrada.nextDouble();
		System.out.println("2° Número");
		double num2 = entrada.nextDouble();
		
		System.out.println("Qual operação?\n1 - adição\n2 - subtração\n3 - Divisão\n4 - Multiplicação");
		int opr = entrada.nextInt();
		
		switch (opr) {
		case 1:
			System.out.println("A soma deu "+(num1+num2));
			break;
		case 2:
			System.out.println("A subtração deu "+(num1-num2));
			break;
		case 3:
			System.out.println("A divisão deu "+num1/num2);
			break;
		case 4:
			System.out.println("A multiplicação deu "+num1*num2);
			break;
		default:
			System.out.println("Operação errada");
		}
	}
}
