package Pessoas;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Pessua bruno = new Pessua("Bruno", 'M', LocalDate.of(2004, 5, 6), "Solteiro");
		Pessua julio = new Pessua("Júlio", 'M', LocalDate.of(1995, 6, 4), "Casado");
		Pessua guilherme = new Pessua("Guilherme", 'M', LocalDate.of(2005, 5, 27), "Solteiro");

		System.out.println(bruno.getNome()+" "+bruno.getSexo()+" "+bruno.getDataNasc()+" "+bruno.getEstadoCivil());
		System.out.println(julio.getNome()+" "+julio.getSexo()+" "+julio.getDataNasc()+" "+julio.getEstadoCivil());
		System.out.println(guilherme.getNome()+" "+guilherme.getSexo()+" "+guilherme.getDataNasc()+" "+guilherme.getEstadoCivil());
	}

}
