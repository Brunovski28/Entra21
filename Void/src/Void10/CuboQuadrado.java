package Void10;

import java.util.Scanner;

public class CuboQuadrado {

	public static void main(String[] args) {
		String str = "";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o primeiro número?");
		int numero1 = entrada.nextInt();
		System.out.println("Qual o segundo número?");
		int numero2 = entrada.nextInt();
		Metodo Golf = new Metodo();
		str = Golf.fds(numero1, numero2);
		System.out.println(str);
	}

}
