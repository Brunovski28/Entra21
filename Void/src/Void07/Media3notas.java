package Void07;

import java.util.Scanner;

public class Media3notas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String str = "";
		double vetor[] = new double[3];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Qual a "+(i+1)+"° nota?");
			vetor[i] = entrada.nextDouble();
		}
		Metodo calc = new Metodo();
		str = calc.calc(vetor);
		System.out.println(str);

	}

}
