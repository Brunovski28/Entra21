package Void06;

import java.util.Scanner;

public class Perimetro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String receba = "";
		System.out.println("Qual altura?");
		int altura = entrada.nextInt();
		System.out.println("Qual largura?");
		int largura = entrada.nextInt();
		
		Metodo str = new Metodo();
		
		
		receba = str.calc(largura, altura);
		

		System.out.println(receba);
	
	}

}
