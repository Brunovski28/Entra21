package Void01;

import java.util.Scanner;

public class Estacoes {

	public static void main(String[] args) {
		String receba = "";
		Scanner entrada = new Scanner(System.in);
		System.out.println("1 - Verão");
		System.out.println("2 - Inverno");
		System.out.println("3 - Primavera");
		System.out.println("4 - Outono");
		System.out.println("Qual número?");
		int numero = entrada.nextInt();
		Metodo Golf = new Metodo();
		receba = Golf.fds(numero);
		System.out.println(receba);
	}

}
