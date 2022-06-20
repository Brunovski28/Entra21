package Zoologico;

public class Aves extends Animal{

	private String cordaspenas;
	private String ibama;
	public Aves(int peso, String nomeidentificacao, String porte, Dono dono, String cordaspenas, String ibama) {
		super(peso, nomeidentificacao, porte, dono);
		this.cordaspenas = cordaspenas;
		this.ibama = ibama;
	}
	public String getCordaspenas() {
		return cordaspenas;
	}
	public void setCordaspenas(String cordaspenas) {
		if (cordaspenas.isBlank() || cordaspenas == null) {
			throw new IllegalArgumentException("Cor da pena incorreta!");
		}
		this.cordaspenas = cordaspenas;
	}
	public String getIbama() {
		return ibama;
	}
	public void setIbama(String ibama) {
		if (ibama.isBlank() || ibama == null) {
			throw new IllegalArgumentException("IBAMA incorreto!");
		}
		if (ibama.charAt(0) != 'A' && ibama.charAt(1) != 'V') {
			throw new IllegalArgumentException("IBAMA começo incorreto!");
		}
		this.ibama = ibama;
	}
	
	
}
