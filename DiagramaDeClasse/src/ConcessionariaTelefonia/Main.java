package ConcessionariaTelefonia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		while (true) {
			boolean internet = false;
			System.out.println("Qual linha você quer contratar?\nResidencial\n Comercial\n  Especializado");
			String operacao = entrada.next();
			if (operacao.equalsIgnoreCase("fim")) {
				break;
			}
			if (operacao.equalsIgnoreCase("Residencial")) {
				System.out.println("Qual seu nome?");
				String nome = entrada.next();
				System.out.println("Qual seu endereço?");
				String endereco = entrada.next();
				System.out.println("Qual seu número?");
				String numero = entrada.next();
				System.out.println("Tem internet?");
				String SN = entrada.next();
				if (SN.equalsIgnoreCase("Sim")) {
					internet = true;
				} else {
					internet = false;
				}
				Residencial r1 = new Residencial(nome, endereco, numero, 15.00, internet);
				
					System.out.println("Nome: " + Residencial.linha.get(i).getNome());
					System.out.println("Endereço: " + Residencial.linha.get(i).getEndereco());
					System.out.println("Telefone: " + Residencial.linha.get(i).getTelefone());
					System.out.println("Total: " + Residencial.linha.get(i).getPagar() + " reais");

					if (internet == true) {
						System.out.println("Tem internet");
					} else {
						System.out.println("Não tem internet");
					}

				
			} else if (operacao.equalsIgnoreCase("Comercial")) {
				double taxa = 0;
				boolean dataantiga = false;
				System.out.println("Qual seu nome?");
				String nome = entrada.next();
				System.out.println("Qual seu endereço?");
				String endereco = entrada.next();
				System.out.println("Qual seu número?");
				String numero = entrada.next();
				System.out.println("Tem internet?");
				String SN = entrada.next();
				System.out.println("A data passa de 01/01/2017 ?");
				String SNR = entrada.next();
				if (SNR.equalsIgnoreCase("Sim")) {
					dataantiga = true;
					taxa = 37.50;
				} else {
					dataantiga = false;
					taxa = 25.00;
				}
				System.out.println("Qual o ramo de atividade?");
				String atividade = entrada.next();
				Comercial r2 = new Comercial(nome, endereco, numero, taxa, atividade, internet, dataantiga);
				System.out.println("Nome: " + Comercial.linha.get(i).getNome());
				System.out.println("Endereço: " + Comercial.linha.get(i).getEndereco());
				System.out.println("Telefone: " + Comercial.linha.get(i).getTelefone());
				System.out.println("Ramo da atividade: "+atividade);
				System.out.println("Total: " + Comercial.linha.get(i).getPagar() + " reais");
				if (internet == true) {
					System.out.println("Tem internet");
				} else {
					System.out.println("Não tem internet");
				}
			} else if (operacao.equalsIgnoreCase("Especializado")) {
				double taxa = 0;
				boolean dataantiga = false;
				System.out.println("Qual seu nome?");
				String nome = entrada.next();
				System.out.println("Qual seu endereço?");
				String endereco = entrada.next();
				System.out.println("Qual seu número?");
				String numero = entrada.next();
				System.out.println("Tem internet?");
				String SN = entrada.next();
				System.out.println("A data passa de 01/01/2017 ?");
				String SNR = entrada.next();
				if (SNR.equalsIgnoreCase("Sim")) {
					dataantiga = true;
					taxa = 37.50;
				} else {
					dataantiga = false;
					taxa = 25.00;
				}
				System.out.println("Quantas ocorrências?");
				int ocorrencia = entrada.nextInt();
				if (ocorrencia > 0 && ocorrencia < 1001) {
					taxa += 50.00;
				} else if (ocorrencia > 1000 && ocorrencia < 5001) {
					taxa += 67.80;
				} else if (ocorrencia > 5000 && ocorrencia < 10001) {
					taxa += 98.50;
				} else if (ocorrencia > 10000 && ocorrencia < 50000) {
					taxa += 123.90;
				} else if (ocorrencia > 50000) {
					taxa += 187.82;
				}
				Especializada r3 = new Especializada(nome, endereco, numero, taxa, internet, ocorrencia, dataantiga);
				System.out.println("Nome: " + Especializada.linha.get(i).getNome());
				System.out.println("Endereço: " + Especializada.linha.get(i).getEndereco());
				System.out.println("Telefone: " + Especializada.linha.get(i).getTelefone());
				System.out.println("Total: " + Especializada.linha.get(i).getPagar() + " reais");
				if (internet == true) {
					System.out.println("Tem internet");
				} else {
					System.out.println("Não tem internet");
				}
			} else {
				System.out.println("Não existe essa linha!");
			}
			i++;
			System.out.println("------------------------------------------------------------------------------------");
		}
	}

}
