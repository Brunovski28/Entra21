package teste;

import java.util.Scanner;

public class Testeee {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade;
		String perm;
		System.out.println("Qual a sua idade");
		idade = entrada.nextInt();
		
		System.out.println("Voc� tem uma permiss�o judicial? sim ou n�o?");
		perm = entrada.next();
		
		if (idade > 17 && idade <= 100) {			
			System.out.println("Pode dirigir");
		} else if (perm.equals("sim") || idade < 15){			
			System.out.println("Voc� n�o tem capacidade para dirigir");			
		} else {
			System.out.println("Pode dirigir");
		}
		
	}

}
