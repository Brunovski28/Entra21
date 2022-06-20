package Zoologico;

public class Endereco {

	private String cep;
	private int nCasa;
	public Endereco(String cep, int nCasa) {
		this.cep = cep;
		this.nCasa = nCasa;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		if (cep.length() != 8) {
			throw new IllegalArgumentException("Cep incorreto!");
		}
		this.cep = cep;
	}
	public int getnCasa() {
		return nCasa;
	}
	public void setnCasa(int nCasa) {
		if (nCasa < 0) {
			throw new IllegalArgumentException("Número da casa inválido!");
		}
		this.nCasa = nCasa;
	}
	
}
