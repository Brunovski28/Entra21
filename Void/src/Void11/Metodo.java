package Void11;

public class Metodo {
	public String fds(int numero) {
		String str = "";
		for (int i = 9; i > 0; i--) {

			if (numero % i == 0) {
				str = ("M�ximo divisor comum � " + i);
				break;
			}
		}
		return str;
	}
}