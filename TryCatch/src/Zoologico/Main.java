package Zoologico;

public class Main {

	public static void main(String[] args) {
		Animal aNemal = new Animal(50, "Pastor", "Grande", new Dono("Bruno Camilo", "12345678911", new Endereco("12345678", 165)));

		Cachorro cachorro = new Cachorro(50, "Bob", "Pequeno", new Dono("Paulo", "12345678910", new Endereco("23455678", 5)), "Preto");
		Gato gato = new Gato(20, "gator", "media", new Dono("Leo", "12345678910", new Endereco("123456789", 6)), "preta", "branca");
		Aves ave = new Aves(10, "Aguia", "grande", new Dono("Brunovski", "21212121211", new Endereco("22222222", 63)), "33434", "AV");
	}

}
