package Void11;

import java.util.Scanner;

public class MaxDivisor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String str = "";
		System.out.println("Qual o número?");
		int numero = entrada.nextInt();
		
		Metodo GTI = new Metodo();
		str = GTI.fds(numero);
		System.out.println(str);
	}

}
