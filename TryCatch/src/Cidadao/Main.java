package Cidadao;

import java.time.LocalDate;


public class Main {

	public static void main(String[] args) {
		
		
		Pessoa bruno = new Pessoa("Bruno Camilo", LocalDate.of(2004, 5, 6), new Endereco("SC", "Blumenau", 165, "RicardoPaul", "12345678"));
		Pessoa julio = new Pessoa("Julio Cesar Adao", LocalDate.of(1995, 6, 4), new Endereco("SC", "Blumenau", 298, "Antapolis", "87654321"));
		Pessoa paulo = new Pessoa("Paulo Cesar da Silva", LocalDate.of(2003, 10, 20), new Endereco("SC", "Blumenau", 207, "ArthurMantau", "12345678"));
			int maior = 0;
			int menor = 0;
			for (int i = 0; i < Pessoa.lista.size(); i++) {

				if (Pessoa.lista.get(i).getDataNasc().compareTo(Pessoa.lista.get(maior).getDataNasc()) < 0) {
					maior = i;
				}
				if (Pessoa.lista.get(i).getDataNasc().compareTo(Pessoa.lista.get(menor).getDataNasc()) > 0) {
					menor = i;
				}
			}
			String EMaior;
			String EMenor;
			if (Pessoa.lista.get(maior).getDataNasc().getMonthValue() > 2 && Pessoa.lista.get(maior).getDataNasc().getMonthValue() < 7) {
				EMaior = "Outono";
			} else if (Pessoa.lista.get(maior).getDataNasc().getMonthValue() > 5
					&& Pessoa.lista.get(maior).getDataNasc().getMonthValue() < 10) {
				EMaior = "Inverno";
			} else if (Pessoa.lista.get(maior).getDataNasc().getMonthValue() > 8
					&& Pessoa.lista.get(maior).getDataNasc().getMonthValue() < 13) {
				EMaior = "Primavera";
			} else {
				EMaior = "Verão";
			}
			if (Pessoa.lista.get(menor).getDataNasc().getMonthValue() > 2 && Pessoa.lista.get(menor).getDataNasc().getMonthValue() < 7) {
				EMenor = "Outono";
			} else if (Pessoa.lista.get(menor).getDataNasc().getMonthValue() > 5
					&& Pessoa.lista.get(menor).getDataNasc().getMonthValue() < 10) {
				EMenor = "Inverno";
			} else if (Pessoa.lista.get(menor).getDataNasc().getMonthValue() > 8
					&& Pessoa.lista.get(menor).getDataNasc().getMonthValue() < 13) {
				EMenor = "Primavera";
			} else {
				EMenor = "Verão";
			}
			int estacao = 0;
			for (int i = 0; i < Pessoa.lista.size(); i++) {
				if (Pessoa.lista.get(i).getDataNasc().getYear() % 4 == 0) {
					estacao++;
				}
			}
			System.out.println("O mais velho é " + Pessoa.lista.get(maior).getNome() + " com "
					+ LocalDate.now().compareTo(Pessoa.lista.get(maior).getDataNasc()) + " anos." + " Na "
					+ Pessoa.lista.get(maior).getDataNasc().getDayOfWeek() + ". Estação " + EMenor
					+ ("\nO mais novo é " + Pessoa.lista.get(menor).getNome() + " com "
							+ LocalDate.now().compareTo(Pessoa.lista.get(menor).getDataNasc()) + " anos." + " Na "
							+ Pessoa.lista.get(menor).getDataNasc().getDayOfWeek() + ". Estação " + EMenor)
					+ ".\nTeve " + estacao + " ano(s) bissextos");
		
	}

}
