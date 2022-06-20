package ReceitaFederal;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Pessoa bruno = new Pessoa("Bruno Camilo" , "111.222.333-03", "SC", 30000, LocalDate.of(2004, 5, 6), "R.Ricardo Paul 165");
		Pessoa pai = new Pessoa("Emerson Camilo" , "112.456.335-76", "SC", 56000, LocalDate.of(1979, 8, 29), "R.Ricardo Paul 165");
		Pessoa julio = new Pessoa("Julio Adão"   , "113.236.235-35", "SC", 10000, LocalDate.of(1995, 6, 4), "R.BelaVista");
		Pessoa guilherme = new Pessoa("Guilherme M", "114.467.147-47", "SC", 2467, LocalDate.of(2005, 5, 29), "R.Garcia");
		Pessoa ana = new Pessoa("Ana", "115.567.356-06", "SC", 24000, LocalDate.of(2005, 7, 12), "R.");
				bruno.conta();
	}

}
