package ContaBancaria;

import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		String nome;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe seu nome ");
		nome = entrada.next();

		System.out.println("Informe seu saldo atual");
		double saldo = entrada.nextDouble();

		Conta conta01 = new Conta(nome, saldo);
		// conta01.setNome(nome);
		System.out.println("Quanto você quer sacar?");
		double sacar = entrada.nextDouble();
		conta01.sacar(sacar);

		System.out.println("Você ficou " + conta01.getsaldo() + " de saldo");

		System.out.println("Quanto você quer depositar?");
		double depositar = entrada.nextDouble();
		conta01.setDepositar(depositar);
		System.out.println("Você ficou " + conta01.getsaldo() + " de saldo");

	}

}
