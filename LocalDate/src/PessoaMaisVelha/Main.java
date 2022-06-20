package PessoaMaisVelha;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Pessoa bruno = new Pessoa("Bruno camilo", LocalDate.of(2004, 5, 6));
		Pessoa julio = new Pessoa("Julio Adao", LocalDate.of(2005, 6, 5));
		Pessoa guilherme = new Pessoa("Guilherme", LocalDate.of(1998, 6, 4));
		// Pessoa metodo = new Pessoa(null, null);
		// String feei = bruno.fds();
		
		String feei = Pessoa.fds();
		System.out.println(feei);
		
		
		
		
		
	}

}
