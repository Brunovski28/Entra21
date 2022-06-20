package teste;

import java.util.Scanner;

public class Testeee {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade;
		String perm;
		System.out.println("Qual a sua idade");
		idade = entrada.nextInt();
		
		System.out.println("Você tem uma permissão judicial? sim ou não?");
		perm = entrada.next();
		
		if (idade > 17 && idade <= 100) {			
			System.out.println("Pode dirigir");
		} else if (perm.equals("sim") || idade < 15){			
			System.out.println("Você não tem capacidade para dirigir");			
		} else {
			System.out.println("Pode dirigir");
		}
		
	}

}
