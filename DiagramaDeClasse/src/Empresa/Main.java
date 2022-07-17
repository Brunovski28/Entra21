package Empresa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Funcionario funcionario = new Funcionario(220, "123.456.789");
		funcionario.setNome("Brunovski");
		funcionario.setSalario(25000);
		funcionario.setDataingresso(06052004);
		boolean var = false;
		Chefe boss = new Chefe(60);
		boss.setNome("Boss");
		boss.setSalario(15000);
		System.out.println("Você quer entrar como?\n1 para funcionario\n2 Para chefe");
		int CoF = entrada.nextInt();
		if (CoF == 1) {
			var = true;
			System.out.println("Funcionario " + funcionario.getNome() + ", salário: " + funcionario.getSalario());
			while (true) {
				System.out.println("Deseja se demitir?");
				String fds = entrada.next();

				if (fds.equalsIgnoreCase("Nao")) {
					System.out.println("Continua a trampar");
				} else {
					funcionario.demitir();
					break;
				}
				System.out.println("Deseja sair do sindicato?");
				String fds2 = entrada.next();

				if (fds2.equalsIgnoreCase("Sim")) {
					funcionario.sairDoSindicato();
					break;
				} else {
					System.out.println("Ok");
				}
			}
		} else {
			System.out.println("Chefe " + boss.getNome() + ", você tem " + boss.getQuantSubordinados()
					+ " de subordinados" + " e seu salário é " + boss.getSalario());
			while (true) {
				System.out.println("Deseja se demitir?");
				String fds = entrada.next();

				if (fds.equalsIgnoreCase("Nao")) {
					System.out.println("Continua a trampar");
				} else {
					boss.demitir();
					break;
				}
				System.out.println("Você quer dobrar o seu salario?");
				String fds3 = entrada.next();
				if (fds3.equalsIgnoreCase("Sim")) {
					boss.dobrarSalario();
					break;
				} else {
					System.out.println("Pobre");
				}
			}

		}
	}
}
