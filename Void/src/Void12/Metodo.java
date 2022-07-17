package Void12;

public class Metodo {
	public String parimpar(String nome) {
		if (nome.length()%2 == 0) {
			return ("A primeira letra da palavra par é "+nome.charAt(0));
		} else {
			return("A segunda letra da palavra impar é "+nome.charAt(1));
		}
	}
}
