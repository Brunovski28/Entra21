package ZoologicoArrumar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean gatoo = false;
		boolean avee = false;
		boolean primataa = false;
		int g = 0;
		int a = 0;
		int p = 0;
		while (true) {
			System.out.println("Qual animal você quer registrar?");
			String animal = entrada.next();
			if (animal.equalsIgnoreCase("gato")) {
				System.out.println("Nome do bixin");
				String nome = entrada.next();
				System.out.println("Cor do pelo");
				String cor = entrada.next();
				System.out.println("Qual a raça?");
				String raca = entrada.next();
				System.out.println("Qual o porte dele?");
				String porte = entrada.next();
				GatoSelvagem gato = new GatoSelvagem(raca, nome, porte, cor);
				gatoo = true;
				g++;
			} else if (animal.equalsIgnoreCase("Ave")) {
				System.out.println("Nome do bixin");
				String nome = entrada.next();
				System.out.println("Cor da pena");
				String cor = entrada.next();
				System.out.println("Qual a raça?");
				String raca = entrada.next();
				System.out.println("Qual o porte dele?");
				String porte = entrada.next();
				System.out.println("Tipo de alimentação");
				String alimento = entrada.next();
				Aves ave = new Aves(raca, nome, porte, cor, alimento);
				avee = true;
				a++;
			} else if (animal.equals("primata")) {
				System.out.println("Qual o nome do macaco");
				String nome = entrada.next();
				System.out.println("Qual a raça");
				String raca = entrada.next();
				System.out.println("Qual o porte da cria");
				String porte = entrada.next();
				Primata primata = new Primata(raca, nome, porte);
				primataa = true;
				p++;
			}
			System.out.println("Quer continuar?");
			String SN = entrada.next();
			if (SN.equalsIgnoreCase("Sim")) {

			} else {
				break;
			}
		}
		System.out.println(GatoSelvagem.animal.get(0).getNomeIdentificacao());
		int ga = 0;
		int av = 0;
		int pr = 0;
		if (gatoo == true) {
			for (int i = 0; i < g; i++) {
				System.out.println("~~~~~~GATO~" + (i + 1) + "~~~~~");
				System.out.println("Nome: " + GatoSelvagem.animal.get(ga).getNomeIdentificacao());
				System.out.println("Cor: " + GatoSelvagem.cor.get(ga));
				System.out.println("Porte: " + GatoSelvagem.animal.get(ga).getPorte());
				System.out.println("Raça: " + GatoSelvagem.animal.get(ga).getRaca());
				ga++;
			}
		}
		if (avee == true) {
			for (int i = 0; i < a; i++) {
				System.out.println("~~~~~~Ave~" + (i + 1) + "~~~~~");
				System.out.println("Nome: "+Aves.animal.get(av).getNomeIdentificacao());
				System.out.println("Cor da pena: "+Aves.pena.get(av));
				System.out.println("Raça: "+Aves.animal.get(av).getRaca());
				System.out.println("Porte: "+Aves.animal.get(av).getPorte());
				System.out.println("Alimento: "+Aves.tipo.get(av));
				av++;
			}
		}//aqui ta o problema dos if
		if (primataa == true) {
			for (int i = 0; i < p; i++) {
				System.out.println("~~~~~~Primata~"+(i+1)+"~~~~~");
				System.out.println("Nome: "+Primata.animal.get(pr).getNomeIdentificacao());
				System.out.println("Raça: "+Primata.animal.get(pr).getRaca());
				System.out.println("Porte: "+Primata.animal.get(pr).getPorte());
				pr++;
			}
		}
	}

}
