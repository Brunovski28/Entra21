package Void10;

public class Metodo {
	public String fds(int numero1, int numero2) {
		if (numero1 == 5 || numero2 == 5) {
			return ("Números ao cubo [" + (numero1 * numero1 * numero1) + "] [" + (numero2 * numero2 * numero2) + "]");
		} 
		else if (numero1 + numero2 == 5) {
			return ("Números ao cubo [" + (numero1 * numero1 * numero1) + "] [" + (numero2 * numero2 * numero2) + "]");
		} 
		else if ((numero1 - numero2) == 5) {
			return ("Números ao cubo [" + (numero1 * numero1 * numero1) + "] [" + (numero2 * numero2 * numero2) + "]");
		} 
		else {
			return ("Números ao quadrado [" + (numero1 * numero1) + "] [" + (numero2 * numero2) + "]");
		}
	}
}
