package E06Cidade;

public class Cidade {
String nome;
String uf;
int populacaoMasculina;
int populacaoFeminina;
boolean calculado;
public Cidade(String nome, String uf, int populacaoMasculina, int populacaoFeminina, boolean calculado) {
	this.nome = nome;
	this.uf = uf;
	this.populacaoMasculina = populacaoMasculina;
	this.populacaoFeminina = populacaoFeminina;
	this.calculado = calculado;
}

}
