package Cidadao;

public class Endereco {

	private String uf;
	private String cidade;
	private int nCasa;
	private String rua;
	private String cep;
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		if (uf.length() != 2) {
			throw new IllegalArgumentException("UF inv�lido!");
		}
		this.uf = uf;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		if (cidade.isBlank()) {
			throw new IllegalArgumentException("Cidade inv�lida!");
		}
		this.cidade = cidade;
	}
	public int getnCasa() {
		return nCasa;
	}
	public void setnCasa(int nCasa) {
		if (nCasa < 0) {
			throw new IllegalArgumentException("N�mero inv�lido!");
		}
		this.nCasa = nCasa;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		if (rua.isBlank()) {
			throw new IllegalArgumentException("Rua inv�lida!");
		}
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		if (cep.length() != 8) {
			throw new IllegalArgumentException("CEP inv�lido!");
		}
		this.cep = cep;
	}
	public Endereco(String uf, String cidade, int nCasa, String rua, String cep) {
		this.uf = uf;
		this.cidade = cidade;
		this.nCasa = nCasa;
		this.rua = rua;
		this.cep = cep;
	}
	
}
