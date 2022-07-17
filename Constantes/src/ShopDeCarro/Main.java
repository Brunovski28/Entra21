package ShopDeCarro;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/////////////////////////////////// VARIAVEIS
		String modelo[] = new String[100];
		int peso[] = new int[100];
		String cor[] = new String[100];
		double preco[] = new double[100];
		int i = 0;
		/////////////////////////////////// VARIAVEIS
		System.out.println("Catálogo - Digite Fim para finalizar");
		while (true) {
			System.out.println("Qual modelo do veículo?");
			String Smodelo = entrada.next();
				if (Smodelo.equalsIgnoreCase("fim")) {
					break;
				}
			modelo[i] = Smodelo;
			System.out.println("Qual o peso do veículo?");
			peso[i] = entrada.nextInt();
			System.out.println("Preço do carro?");
			preco[i] = entrada.nextDouble();
			System.out.println("Qual a cor do veículo?\n1 - Azul\n2 - Preto\n3 - Verde\n4 - Branco\n5 - Prata\n6 - Vermelho");
			int corr = entrada.nextInt();
			switch (corr) {
			case 1:
				cor[i] = Cores.AZUL.toString();
				break;
			case 2: 
				cor[i] = Cores.PRETO.toString();
				break;
			case 3:
				cor[i] = Cores.VERDE.toString();
				break;
			case 4:
				cor[i] = Cores.BRANCO.toString();
				break;
			case 5:
				cor[i] = Cores.PRATA.toString();
				break;
			case 6:
				cor[i] = Cores.VERMELHO.toString();
				break;
			default:
				throw new Error("Erro");
			}// fim switch
			Automovel frota = new Automovel(modelo[i], peso[i], null, null, null);//parei aqui
			i++;
		}// fim while
		System.out.println(" ");
		int r = 0;
		for (int j = 0; j < i; j++) {
			System.out.println("Modelo: "+modelo[j]);
			System.out.println("Peso: "+peso[j]+" KG's");
			System.out.println("Cor: "+cor[j]+"\n");
			System.out.println("Preço: "+preco[i]+" reais");
		}System.out.println("\n\n");
		System.out.println("Você deseja comprar Carro do catálogo online ou presencialmente?");
		String SN = entrada.next();
			if (SN.equalsIgnoreCase("Online")) {
				System.out.println("Deseja comprar qual carro?");
				String carri = entrada.next();
				for (int j = 0; j < modelo.length; j++) {
					if (carri.equals(modelo[j])) {
						r = j;
					}
				}
				System.out.println("Modelo: "+modelo[r]);
				System.out.println("Peso: "+peso[r]+" KG's");
				System.out.println("Cor: "+cor[r]);
				System.out.println("Comprado!!!");
				modelo[r] = (modelo[r]+" COMPRADO");
			} else if (SN.equalsIgnoreCase("Presencial")){
				System.out.println("Deseja comprar qual carro?");
				String carri = entrada.next();
				for (int j = 0; j < modelo.length; j++) {
					if (carri.equals(modelo[j])) {
						r = j;
					}
				}
				System.out.println("Modelo: "+modelo[r]);
				System.out.println("Peso: "+peso[r]+" KG's");
				System.out.println("Cor: "+cor[r]);
				System.out.println("Comprado!!!");
				modelo[r] = (modelo[r]+" COMPRADO");
				System.out.println("Nome do vendedor");
				String nmae = entrada.next();
				System.out.println("Nasceu que dia?");
				int dia = entrada.nextInt();
				System.out.println("Nasceu que mês?");
				int mes = entrada.nextInt();
				System.out.println("Nasceu que ano?");
				int ano = entrada.nextInt();
				System.out.println("Qual o UF");
				String uf = entrada.next();
				System.out.println("Qual a cidade?");
				String cidade = entrada.next();
				System.out.println("Número da casa?");
				int nCasa = entrada.nextInt();
				System.out.println("Qual o CEP?");
				String cep = entrada.next();
				System.out.println("Qual o id?");
				int id = entrada.nextInt();
				System.out.println("Qual o salário?");
				double salaro = entrada.nextDouble();
				Vendedor vendedor = new Vendedor(nmae, LocalDate.of(ano, mes, dia), new Endereco(uf, cidade, nCasa, cep), id, salaro);
				
			}
	}

}
