package Void13;

public class Metodo {
	public int[] soma(int vetor1[], int vetor2[]) {
		int vetor3[] = new int[5];
		for (int i = 0; i < vetor1.length; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
		}
		return vetor3;
	}
}
