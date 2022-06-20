package Zoologico;

public class Cachorro extends Animal{

	private String cordapelagem;

	public Cachorro(int peso, String nomeidentificacao, String porte, Dono dono, String cordapelagem) {
		super(peso, nomeidentificacao, porte, dono);
		this.cordapelagem = cordapelagem;
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
