package Transportadora;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double totalcusto[] = new double[100];
		String descricao[][] = new String[100][100];
		double custo[][] = new double[100][100];
		int tempo[][] = new int[100][100];
		boolean vetor[] = new boolean[100];
		
		
		int contador = 0;
		int totalcustocontador = 0;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = false;
		}
		while (true) {
			
			System.out.println("Tem caminhão?");
			String SN = entrada.next();
			if (SN.equalsIgnoreCase("Sim")) {
				
			} else {
				break;
			}
			System.out.println("Qual o modelo do caminhão?");
			String modelo = entrada.next();
			System.out.println("Qual a placa do caminhão?");
			String placa = entrada.next();
			System.out.println("Dia aquisitivo?");
			int dia = entrada.nextInt();
			System.out.println("Mês aquisitivo?");
			int mes = entrada.nextInt();
			System.out.println("Ano aquisitivo?");
			int ano = entrada.nextInt();
			System.out.println("Necessita de reparo?");
			String SNR = entrada.next();
			if (SNR.equalsIgnoreCase("sim")) {
				System.out.println("Quantas peças precisando de reparo?");
				int qtdreparo = entrada.nextInt();
				for (int i = 0; i < qtdreparo; i++) {
					System.out.println("Descrição do item quebrado");//linha // coluna
					descricao[totalcustocontador][contador] = entrada.next();
					System.out.println("Custo deste item");
					custo[totalcustocontador][contador] = entrada.nextDouble();
					System.out.println("Quantos dias para ser arrumado?");
					tempo[totalcustocontador][contador] = entrada.nextInt();
					totalcustocontador++;
				} 
			}else {
				vetor[contador] = true;
				}
			contador++;
			Caminhao frota = new Caminhao(placa, modelo, LocalDate.of(ano, mes, dia));
		}
		for (int i = 0; i < contador; i++) {
			if (vetor[i] == true) {
				System.out.println("=======================================");
				System.out.println("=");
				System.out.println("=  "+Caminhao.lista.get(i).getModelo());
				System.out.println("=  "+Caminhao.lista.get(i).getPlaca());
				System.out.println("=  "+Caminhao.lista.get(i).getDataAq());
				System.out.println("=");
				System.out.println("=======================================");
			} else {
			System.out.println("=======================================");
			System.out.println("=");
			System.out.println("=  "+Caminhao.lista.get(i).getModelo());
			System.out.println("=  "+Caminhao.lista.get(i).getPlaca());
			System.out.println("=  "+Caminhao.lista.get(i).getDataAq());
			System.out.println("=");//19             //20
			System.out.println("================Reparos================");
			System.out.println("=");
			System.out.println("=  "+);//coloca as matrizes
			}
			}
	}

}
