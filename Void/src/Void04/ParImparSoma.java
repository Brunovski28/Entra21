package Void04;

import java.util.Scanner;

public class ParImparSoma {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual n�mero?");
		int numero = entrada.nextInt();
		Metodo gti = new Metodo();
		int numeroaux = 0;
		numeroaux = gti.fds(numero);
		System.out.println("N�mero digitado foi "+numero+". N�mero fodase "+numeroaux);
	}

}
