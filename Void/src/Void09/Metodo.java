package Void09;

public class Metodo {
	public String perto(int vetor[], int base) {
		int c1 = 0;
		int c2 = 0;
		c1 = vetor[0] - base;
		c2 = vetor[1] - base;
		int value1 = Math.abs(c1);
		int value2 = Math.abs(c2);
		if (value1>value2) {
			return ("Valor "+vetor[1]+" é mais perto da base: "+base);
		} else {
			return ("Valor "+vetor[0]+" é mais perto da base: "+base);
		}
	}
}
