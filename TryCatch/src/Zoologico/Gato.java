package Zoologico;

public class Gato extends Animal{

	private String mancha;
	private String cordapelagem;
	public Gato(int peso, String nomeidentificacao, String porte, Dono dono, String mancha, String cordapelagem) {
		super(peso, nomeidentificacao, porte, dono);
		this.mancha = mancha;
		this.cordapelagem = cordapelagem;
	}
	public String getMancha() {
		return mancha;
	}
	public void setMancha(String mancha) {
		if (mancha.isBlank() || mancha == null) {
			throw new IllegalArgumentException("mancha incorreta!");
		}
		this.mancha = mancha;
	}
	public String getCordapelagem() {
		return cordapelagem;
	}
	public void setCordapelagem(String cordapelagem) {
		if (cordapelagem.isBlank() || cordapelagem == null) {
			throw new IllegalArgumentException("Cor da pelagem incorreta!");
		}
		this.cordapelagem = cordapelagem;
	}
	

	
}
