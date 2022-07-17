package Planetas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual planeta?\n1 - Mercurio\n2 - Venus\n3 - Terra\n4 - Marte\n5 - Júpiter\n6 - Saturno\n7 - Urano\n8 - Netuno");
		int num = entrada.nextInt();
		
		if (Planetas.Terra.numero == num) {
			System.out.println("Nesse planeta da para morar");
		} else {
			System.out.println("Nesse planeta não da para morar");
		}
	}

}
