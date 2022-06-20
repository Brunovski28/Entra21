package Mercado;

public class Main {

	public static void main(String[] args) {
		Mercado unidadeBlumenau = new Mercado(50, 3, 30, 2.00); // maca = 150 | laranja = 60 || 210
		Mercado unidadeJoinville = new Mercado(40, 3, 40, 2.00);// maca = 120 | laranja = 80 || 200
		Mercado unidadeFlorianopolis = new Mercado(45, 3, 50, 2.00); // maca=135|laranja=100|| 235

		double maca[] = new double[3];
		double laranja[] = new double[3];
		double totalvenda[] = new double[3];
		double maiormaca = Integer.MIN_VALUE;
		double maiorlaranja = Integer.MIN_VALUE;
		double maiortotal = Integer.MIN_VALUE;
		int idmaca = 0;
		int idlaranja = 0;
		int idtotal = 0;

		for (int i = 0; i < maca.length; i++) {
			maca[i] = Mercado.lista.get(i).getMacavendida() * Mercado.lista.get(i).getPrecovendamaca();
		}
		for (int i = 0; i < laranja.length; i++) {
			laranja[i] = Mercado.lista.get(i).getLaranjavendida() * Mercado.lista.get(i).getPrecovendalaranja();
		}

		if (maca[0] == maca[1] && maca[1] == maca[2]) {
			idmaca = 404;
		} else {
			for (int i = 0; i < 3; i++) {
				if (maca[i] > maiormaca) {
					maiormaca = maca[i];
					idmaca = i;
				}
			}
		}
		if (laranja[0] == laranja[1] && laranja[1] == laranja[2]) {
			idlaranja = 404;
		} else {
			for (int i = 0; i < 3; i++) {
				if (laranja[i] > maiorlaranja) {
					maiorlaranja = laranja[i];
					idlaranja = i;
				}
			}

		}

		if (idmaca == 0) {
			System.out.println("Blumenau teve a maior vendas de maçã");
		} else if (idmaca == 1) {
			System.out.println("Joinville teve a maior vendas de maçã");
		} else if (idmaca == 2) {
			System.out.println("Florianopolis teve a maior vendas de maçã");
		} else {
			System.out.println("Todas as unidades maçãs teve a mesma receita!");
		}
		if (idlaranja == 0) {
			System.out.println("Blumenau teve a maior vendas de laranjas");
		} else if (idlaranja == 1) {
			System.out.println("Joinville teve a maior vendas de laranjas");
		} else if (idlaranja == 2) {
			System.out.println("Florianopolis teve a maior vendas de laranjas");
		} else {
			System.out.println("Todas as unidades laranjas teve a mesma receita!");
		}

		for (int i = 0; i < totalvenda.length; i++) {
			totalvenda[i] = maca[i] + laranja[i];
		}

		for (int i = 0; i < totalvenda.length; i++) {
			if (totalvenda[i] > maiortotal) {
				maiortotal = totalvenda[i];
				idtotal = i;
			}
		}

		if (idtotal == 0) {
			System.out.println("A franquia Blumenau teve mais vendas com " + maiortotal + " reais.");
		} else if (idtotal == 1) {
			System.out.println("A franquia Joinville teve mais vendas com " + maiortotal + " reais.");
		} else if (idtotal == 2) {
			System.out.println("A franquia Florianopolis teve mais vendas com " + maiortotal + " reais.");
		}
		if (totalvenda[0] > totalvenda[1] && totalvenda[0] < totalvenda[2]) {
			System.out.println("Blumenau ficou no meio das receitas");
		} else if (totalvenda[0] > totalvenda[2] && totalvenda[0] < totalvenda[1]) {
			System.out.println("Blumenau ficou no meio das receitas");
		} else if (totalvenda[1] > totalvenda[0] && totalvenda[1] < totalvenda[2]) {
			System.out.println("Joinville ficou no meio das receitas");
		} else if (totalvenda[1] > totalvenda[2] && totalvenda[1] < totalvenda[0]) {
			System.out.println("Joinville ficou no meio das receitas");
		} else if (totalvenda[2] > totalvenda[0] && totalvenda[2] < totalvenda[1]) {
			System.out.println("Florianopolis ficou no meio das receitas");
		} else if (totalvenda[2] > totalvenda[1] && totalvenda[2] < totalvenda[0]) {
			System.out.println("Florianopolis ficou no meio das receitas");
		} else {
			System.out.println("Tem a mesma receita!");
		}
		double totalmaca = 0;
		double totallaranja = 0;

		for (int i = 0; i < totalvenda.length; i++) {
			totalmaca += maca[i];
			totallaranja += laranja[i];
		}
		if (totalmaca > totallaranja) {
			System.out.println("Maçã teve mais receitas!");
		} else {
			System.out.println("Laranja teve mais receitas!");
		}
	}//

}
