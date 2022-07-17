package Planetas;

public enum Planetas {

	Mercurio(1), Venus(2), Terra(3), Marte(4), Jupiter(5), Saturno(6), Urano(7), Netuno(8);
	
	final int numero;

	private Planetas(int numero) {
		this.numero = numero;
	}
	
}
