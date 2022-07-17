package Escola;

public class AlunoFurbista {
	private char formalingresso;
	private String curso;
	public AlunoFurbista(char formalingresso, String curso) {
		
		this.formalingresso = formalingresso;
		this.curso = curso;
	}
	public char getFormalingresso() {
		return formalingresso;
	}
	public void setFormalingresso(char formalingresso) {
		this.formalingresso = formalingresso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void mostra() {
		
	}
}
