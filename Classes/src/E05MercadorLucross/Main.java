package E05MercadorLucross;

import E02Mercado.Mercado;

public class Main {

	public static void main(String[] args) {
		Mercado unidadeBlumenau = new Mercado();
		Mercado unidadeJoinville = new Mercado();
		Mercado unidadeFlorianopolis = new Mercado();
		double numeromaior = Integer.MIN_VALUE;
		double numeromenor = Integer.MAX_VALUE;
		unidadeBlumenau.laranjavendidas = 6;
		unidadeBlumenau.precolaranja = 5.50; // 33 reais laranja
		unidadeBlumenau.macavendidas = 8; // 36 reais maça
		unidadeBlumenau.precomaca = 4.50;

		unidadeJoinville.laranjavendidas = 9;
		unidadeJoinville.precolaranja = 3.50; // 31,5 reais laranja
		unidadeJoinville.macavendidas = 2; // 17 reais maça
		unidadeJoinville.precomaca = 8.50;

		unidadeFlorianopolis.laranjavendidas = 13;
		unidadeFlorianopolis.precolaranja = 3.50; // 45,5 reais laranja
		unidadeFlorianopolis.macavendidas = 15; // 37,5 reais maca
		unidadeFlorianopolis.precomaca = 2.50;
		//total de vendas de maça
		double macablumenau = (unidadeBlumenau.macavendidas * unidadeBlumenau.precomaca);
		double macajoinville = (unidadeJoinville.macavendidas * unidadeJoinville.precomaca);
		double macaflorianopolis = (unidadeFlorianopolis.macavendidas * unidadeFlorianopolis.precomaca);

		//total de vendas de laranja
		double laranjablumenau = (unidadeBlumenau.laranjavendidas * unidadeBlumenau.precolaranja);
		double laranjajoinville = (unidadeJoinville.laranjavendidas * unidadeJoinville.precolaranja);
		double laranjaflorianopolis = (unidadeFlorianopolis.laranjavendidas * unidadeFlorianopolis.precolaranja);

		//total de vendas
		double lucroblumenau = laranjablumenau + macablumenau;
		double lucrojoinville = laranjajoinville + macajoinville;
		double lucroflorianopolis = laranjaflorianopolis + macaflorianopolis;

		//total de vendas de maça das empresas
		double totalmaca = macablumenau + macajoinville + macaflorianopolis;
		//total de vendas de laranja das empresas
		double totallaranja = laranjablumenau + laranjajoinville + laranjaflorianopolis;
		if (macablumenau > macajoinville && macajoinville > macaflorianopolis) {
			System.out.println("Blumenau teve mais vendas de maça");
		} else if (macablumenau > macaflorianopolis && macaflorianopolis > macajoinville) {
			System.out.println("Blumenau teve mais vendas de maça");
		} else if (macajoinville > macaflorianopolis && macaflorianopolis > macablumenau) {
			System.out.println("Joinville teve mais vendas de maça");
		} else if (macajoinville > macablumenau && macablumenau > macaflorianopolis) {
			System.out.println("Joinville teve mais vendas de maça");
		} else if (macaflorianopolis > macablumenau && macablumenau > macajoinville) {
			System.out.println("Florianopolis teve mais vendas de maça");
		} else if (macaflorianopolis > macajoinville && macajoinville > macablumenau) {
			System.out.println("Florianopolis teve mais vendas de maça");
		} else {
			System.out.println("Deu chabu na venda de maça");
		}

		if (laranjablumenau > laranjajoinville && laranjajoinville > laranjaflorianopolis) {
			System.out.println("Blumenau teve mais vendas de laranja");
		} else if (laranjablumenau > laranjaflorianopolis && laranjaflorianopolis > laranjajoinville) {
			System.out.println("Blumenau teve mais vendas de laranja");
		} else if (laranjajoinville > laranjaflorianopolis && laranjaflorianopolis > laranjablumenau) {
			System.out.println("Joinville teve mais vendas de laranja");
		} else if (laranjajoinville > laranjablumenau && laranjablumenau > laranjaflorianopolis) {
			System.out.println("Joinville teve mais vendas de laranja");
		} else if (laranjaflorianopolis > laranjablumenau && laranjablumenau > laranjajoinville) {
			System.out.println("Florianopolis teve mais vendas de laranja");
		} else if (laranjaflorianopolis > laranjajoinville && laranjajoinville > laranjablumenau) {
			System.out.println("Florianopolis teve mais vendas de laranja");
		} else {
			System.out.println("Deu chabu na venda de laranja");
		}

		if (lucroblumenau > lucrojoinville && lucroblumenau > lucroflorianopolis) {
			System.out.println("Blumenau teve mais lucro");
		} else if (lucrojoinville > lucroblumenau && lucrojoinville > lucroflorianopolis) {
			System.out.println("Joinville teve mais lucro");
		} else if (lucroflorianopolis > lucroblumenau && lucroflorianopolis > lucrojoinville) {
			System.out.println("Florianopolis teve mais lucro");
		} else {
			System.out.println("Deu chabu no lucro");
		}
		if (lucroblumenau < lucrojoinville && lucroblumenau < lucroflorianopolis) {
			System.out.println("Blumenau teve menos lucro");
		} else if (lucrojoinville < lucroblumenau && lucrojoinville < lucroflorianopolis) {
			System.out.println("Joinville teve menos lucro");
		} else if (lucroflorianopolis < lucroblumenau && lucroflorianopolis < lucrojoinville) {
			System.out.println("Florianopolis teve menos lucro");
		} else {
			System.out.println("Deu chabu no lucro");
		}
		if (lucroblumenau > lucrojoinville && lucroblumenau < lucroflorianopolis) {
			System.out.println("Blumenau ficou no meio");
		} else if (lucroblumenau > lucroflorianopolis && lucroblumenau < lucrojoinville) {
			System.out.println("Blumenau ficou no meio");
		} else if (lucrojoinville > lucroblumenau && lucrojoinville < lucroflorianopolis) {
			System.out.println("Joinville ficou no meio");
		} else if (lucrojoinville > lucroflorianopolis && lucrojoinville < lucroblumenau) {
			System.out.println("Joinville ficou no meio");
		} else if (lucroflorianopolis > lucroblumenau && lucroflorianopolis < lucrojoinville) {
			System.out.println("Florianopolis ficou no meio");
		} else if (lucroflorianopolis > lucrojoinville && lucroflorianopolis < lucroblumenau) {
			System.out.println("Florianopolis ficou no meio");
		} else {
			System.out.println("Deu chabu no meio");
		}
		if (totallaranja >totalmaca) {
			System.out.println("Laranja teve mais lucro");
		} else {
			System.out.println("Maçã teve mais lucro");
		}
	}
}
