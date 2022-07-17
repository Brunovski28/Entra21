package Funcionario;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Bruno Camilo", 1, 50000, LocalDate.of(2004, 5, 6), new Endereco("SC", "Blumenau", 165, "R.Ricardo Paul", "89003745"));
		Funcionario f2 = new Funcionario("Julio Cesar Adao", 2, 25000, LocalDate.of(1995, 6, 4), new Endereco("SC", "Blumenau", 567, "R.Garcia Mendes", "76003775"));
		Funcionario f3 = new Funcionario("Lucas Mendes", 3, 12500, LocalDate.of(2004, 8, 9), new Endereco("SC", "Blumenau", 45, "R.Kombi Adao", "43003745"));
		Funcionario f4 = new Funcionario("Yuri Sparta", 4, 6250, LocalDate.of(2000, 7, 6), new Endereco("SC", "Blumenau", 24, "R.Florianopolis", "29888845"));
		Funcionario f5 = new Funcionario("Wellington", 5, 3175, LocalDate.of(1999, 3, 9), new Endereco("SC", "Blumenau", 575, "R.Ricardo", "89003745"));

		HashMap<Integer, String> hash = new HashMap<>();
		
		hash.put(1, "Bruno");
		hash.put(2, "Julio");
		hash.put(3, "Lucas");
		hash.put(4, "Yuri");
		hash.put(5, "Wellington");
		
	}

}
