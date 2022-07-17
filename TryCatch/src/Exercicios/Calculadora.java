package Exercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		try {
		System.out.println("Primeiro número");
		double num1 = entrada.nextDouble();
		System.out.println("Segundo número");
		double num2 = entrada.nextDouble();
		
		System.out.println("Qual operação?\n1 - Soma\n2 - Subtracão\n3 - Multiplicação\n4 - Divisão");
		int opr = entrada.nextInt();
		
		if (opr == 1) {
			System.out.println("Soma deu "+num1+num2);
		} else if (opr == 2) {
			System.out.println("Subtração deu "+(num1-num2));
		} else if (opr == 3) {
			System.out.println("Multiplicação deu "+num1*num2);
		} else if (opr == 4) {
			System.out.println("Divisão deu "+num1/num2);
		} else {
			throw new IllegalAccessException("Operação inválida");
		}
		} catch (Exception e) {
			System.out.println("ERRO");
		}

		

	}

}
