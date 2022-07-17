package Exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Data {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		LocalDate datal;
		
		
		System.out.println("Qual dia?");
		int dia = entrada.nextInt();
		if (dia < 0 || dia > 30) {
		throw new IllegalArgumentException("Dia inválido!");
		}

		System.out.println("Qual mês");
		int mes = entrada.nextInt();
		if (mes < 1 || mes > 12) {
		throw new IllegalArgumentException("Mês inválido!");
		}
		System.out.println("Qual ano");
		int ano = entrada.nextInt();
		if (ano %4 == 0 && mes == 2) {
			if (dia < 1 || dia > 29) {
				throw new IllegalArgumentException("Fevereiro inválido!");
			}
		} else if (mes == 2) {
			if (dia < 1 && dia > 28) {
				
			} else {
				throw new IllegalArgumentException("Fevereiro inválido!");
				
			}
		}

	}

}
