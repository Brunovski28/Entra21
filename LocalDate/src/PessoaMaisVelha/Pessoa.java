package PessoaMaisVelha;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private LocalDate dataNasc;
	int c = 0;
	static ArrayList<Pessoa> gente = new ArrayList<Pessoa>();

	public Pessoa(String nome, LocalDate dataNasc) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.gente = gente;
		this.gente.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public ArrayList<Pessoa> getGente() {
		return gente;
	}

	public void setGente(ArrayList<Pessoa> gente) {
		this.gente = gente;
	}

	public void setC(int c) {
		this.c = c;
	}

	public static String fds() {
		int maior = 0;
		int menor = 0;
		for (int i = 0; i < Pessoa.gente.size(); i++) {

			if (gente.get(i).getDataNasc().compareTo(gente.get(maior).getDataNasc()) < 0) {
				maior = i;
			}
			if (gente.get(i).getDataNasc().compareTo(gente.get(menor).getDataNasc()) > 0) {
				menor = i;
			}
		}
		String EMaior;
		String EMenor;
		if (gente.get(maior).getDataNasc().getMonthValue() > 2 && gente.get(maior).getDataNasc().getMonthValue() < 7) {
			EMaior = "Outono";
		} else if (gente.get(maior).getDataNasc().getMonthValue() > 5
				&& gente.get(maior).getDataNasc().getMonthValue() < 10) {
			EMaior = "Inverno";
		} else if (gente.get(maior).getDataNasc().getMonthValue() > 8
				&& gente.get(maior).getDataNasc().getMonthValue() < 13) {
			EMaior = "Primavera";
		} else {
			EMaior = "Verão";
		}
		if (gente.get(menor).getDataNasc().getMonthValue() > 2 && gente.get(menor).getDataNasc().getMonthValue() < 7) {
			EMenor = "Outono";
		} else if (gente.get(menor).getDataNasc().getMonthValue() > 5
				&& gente.get(menor).getDataNasc().getMonthValue() < 10) {
			EMenor = "Inverno";
		} else if (gente.get(menor).getDataNasc().getMonthValue() > 8
				&& gente.get(menor).getDataNasc().getMonthValue() < 13) {
			EMenor = "Primavera";
		} else {
			EMenor = "Verão";
		}
		int estacao = 0;
		for (int i = 0; i < gente.size(); i++) {
			if (gente.get(i).getDataNasc().getYear() % 4 == 0) {
				estacao++;
			}
		}
		return ("O mais velho é " + gente.get(maior).getNome() + " com "
				+ LocalDate.now().compareTo(gente.get(maior).getDataNasc()) + " anos." + " Na "
				+ gente.get(maior).getDataNasc().getDayOfWeek() + ". Estação " + EMenor
				+ ("\nO mai novo é " + gente.get(menor).getNome() + " com "
						+ LocalDate.now().compareTo(gente.get(menor).getDataNasc()) + " anos." + " Na "
						+ gente.get(menor).getDataNasc().getDayOfWeek() + ". Estação " + EMenor)
				+ ".\nTeve " + estacao + " anos bissextos");
	}
}
