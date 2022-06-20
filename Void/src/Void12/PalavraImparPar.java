package Void12;

import java.util.Scanner;

public class PalavraImparPar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String str = "";
		System.out.println("Nome do infeliz");
		String nome = entrada.next();
		
		Metodo Golf = new Metodo();
		
		str = Golf.fds(nome);
		
		System.out.println(str);

	}

}
