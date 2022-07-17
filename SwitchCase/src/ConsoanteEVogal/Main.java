package ConsoanteEVogal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual letra?");
		char letra = entrada.next().charAt(0);
		
		switch (letra) {
		case 'a':
			System.out.println("VOGAL");
			break;
		case 'e':
			System.out.println("VOGAL");
			break;
		case 'i':
			System.out.println("VOGAL");
			break;
		case 'o':
			System.out.println("VOGAL");
			break;
		case 'u':
			System.out.println("VOGAL");
			break;
		default:
			System.out.println("CONSOANTE");
		}
	}

}
