package Void12;

public class Metodo {
	public String parimpar(String nome) {
		if (nome.length()%2 == 0) {
			return ("A primeira letra da palavra par � "+nome.charAt(0));
		} else {
			return("A segunda letra da palavra impar � "+nome.charAt(1));
		}
	}
}
