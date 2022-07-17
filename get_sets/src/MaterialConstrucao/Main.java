package MaterialConstrucao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		MaterialConstrucao item1 = new MaterialConstrucao("Martelo", "Serve pra bater nos outros", 20.90, 5, 81);
		MaterialConstrucao item2 = new MaterialConstrucao("Picareta", "Serve para achar ouro", 19.90, 4, 45);
		MaterialConstrucao item3 = new MaterialConstrucao("P�", "Serve pra cavar e achar carv�o", 25.75, 3, 76);
		double vender;
		while (true) {
			System.out.println("Voc� quer vender algo?");
			String fds = entrada.next();
			if (fds.equalsIgnoreCase("Nao")) {
				break;
			}
			System.out.println("Voc� quer vender qual produto?");
			String produto = entrada.next();
			if (produto.equalsIgnoreCase("martelo")) {
				System.out.println("Quantos voc� quer vender?");
				vender = entrada.nextDouble();
				item1.vendaEstoque(vender);
				System.out.println("Voc� vendeu e ficou com " + item1.vendaEstoque(vender));
			} else if (produto.equalsIgnoreCase("Picareta")) {
				System.out.println("Quantos voc� quer vender?");
				vender = entrada.nextDouble();
				item2.vendaEstoque(vender);
				System.out.println("Voc� vendeu e ficou com " + item2.vendaEstoque(vender));
			} else if (produto.equalsIgnoreCase("P�")) {
				System.out.println("Quantos voc� quer vender?");
				vender = entrada.nextDouble();
				item3.vendaEstoque(vender);
				System.out.println("Voc� vendeu e ficou com " + item3.vendaEstoque(vender));
			} else {
				System.out.println("N�o tem nenhum item com esse nome");
			}

		}
		if (item1.getPreco() > item2.getPreco() && item1.getPreco() > item3.getPreco()) {
			System.out.println("Martelo � mais caro");
		} else if (item2.getPreco() > item1.getPreco() && item2.getPreco() > item3.getPreco()) {
			System.out.println("Picareta � mais caro");
		} else if (item3.getPreco() > item1.getPreco() && item3.getPreco() > item2.getPreco()) {
			System.out.println("P� � mais caro");
		}
		if (item1.getPeso() < item2.getPeso() && item1.getPeso() < item3.getPeso()) {
			System.out.println("Martelo � mais leve");
		} else if (item2.getPeso() < item1.getPeso() && item2.getPeso() < item3.getPeso()) {
			System.out.println("Picareta � mais leve");
		} else if (item3.getPeso() < item1.getPeso() && item3.getPeso() < item2.getPeso()) {
			System.out.println("P� � mais leve");
		}
	}
}
