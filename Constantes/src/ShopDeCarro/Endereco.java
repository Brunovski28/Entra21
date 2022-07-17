package ShopDeCarro;

public class Endereco {

	private String uf;
	private String cidade;
	private int nCasa;
	private String cep;
	public Endereco(String uf, String cidade, int nCasa, String cep) {
		super();
		this.uf = uf;
		this.cidade = cidade;
		this.nCasa = nCasa;
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		if (uf.length() != 2) {
			throw new IllegalArgumentException("UF inconsistente");
		} else {
			this.uf = uf;
		}
		
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getnCasa() {
		return nCasa;
	}
	public void setnCasa(int nCasa) {
		this.nCasa = nCasa;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		if (cep.length() != 8) {
			throw new IllegalArgumentException("UF inconsistente");
		} else {
		this.cep = cep;
		}
	}
	
}
