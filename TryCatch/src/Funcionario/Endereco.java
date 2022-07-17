package Funcionario;

public class Endereco {
	private String uf;
	private String cidade;
	private int nCasa;
	private String rua;
	private String cep;
	public Endereco(String uf, String cidade, int nCasa, String rua, String cep) {
		super();
		this.uf = uf;
		this.cidade = cidade;
		this.nCasa = nCasa;
		this.rua = rua;
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		if (uf.length() != 2) {
			throw new IllegalArgumentException("UF maior que o padrão");
		}
		this.uf = uf;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		if (cidade.isBlank() || cidade == null) {
			throw new IllegalArgumentException("Nome não preenchido!");
		}
		this.cidade = cidade;
	}
	public int getnCasa() {
		return nCasa;
	}
	public void setnCasa(int nCasa) {
		this.nCasa = nCasa;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		if (rua.isBlank() || rua == null) {
			throw new IllegalArgumentException("Nome não preenchido!");
		}
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		if (cep.length() != 8) {
			throw new IllegalArgumentException("CEP passou do limite");
		}
		this.cep = cep;
	}
	
}
