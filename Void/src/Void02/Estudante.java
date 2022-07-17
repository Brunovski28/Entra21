package Void02;

import java.util.Scanner;

public class Estudante {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o nome?");
		String nome = entrada.next();
				
		Metodo Marea = new Metodo();
		String receba = "";
		receba = Marea.fds(nome);
		System.out.println(receba);
	}

}
