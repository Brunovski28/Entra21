package Funcionario;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		Scanner entrada = new Scanner(System.in);
		Funcionario f1 = new Funcionario("Guilherme Ruivo", 1, 2500);
		Funcionario f2 = new Funcionario("Ana", 2, 5000);
		Funcionario f3 = new Funcionario("Mendes", 3, 7500);
		Funcionario f4 = new Funcionario("Julio", 4, 10000);
		Funcionario f5 = new Funcionario("Brunovski", 5, 12500);

		map.put(f1.getId(), f1.getNome());
		map.put(f2.getId(), f2.getNome());
		map.put(f3.getId(), f3.getNome());
		map.put(f4.getId(), f4.getNome());
		map.put(f5.getId(), f5.getNome());
		System.out.println(map);
		System.out.println("Qual id você deseja mudar?");
		int id = entrada.nextInt();
		System.out.println("Qual o nome do cidadão");
		String nome = entrada.next();
		map.replace(id, nome);
		System.out.println(map);
	}

}
