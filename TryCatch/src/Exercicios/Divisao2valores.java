package Exercicios;

import java.util.Scanner;

public class Divisao2valores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
			System.out.println("Digite primeiro n�mero");
			double num1 = entrada.nextDouble();
			System.out.println("Digite segundo n�mero");
			double num2 = entrada.nextDouble();
			if (num1 < 0 || num1 > 100) {
				throw new IllegalArgumentException("N�mero fora");
			}
			if (num2 < 0 || num2 > 100) {
				throw new IllegalArgumentException("N�mero fora");
			}
			if (num1 == 0 || num2 == 0) {
				throw new IllegalArgumentException("N�mero 0 n�o � divisivel!");
			}
			System.out.printf("numero 1: "+num1+" | numero 2: "+num2+" | %.2f",(num1/num2));
			System.out.println("");
			System.out.printf("numero 2: "+num2+" | numero 1: "+num1+" | %.2f",(num2/num1));
		

	}

}
