package Void08;

public class Metodo {
	public String fds(int vetor[]) {
		int numeromaior = Integer.MIN_VALUE;
		int numeromenor = Integer.MAX_VALUE;
		int somatoria = 0;
		int media = 0;
		String str = "";
		for (int i = 0 ; i < vetor.length; i ++) {
			if (vetor[i] > numeromaior) {
				numeromaior = vetor[i];
			}
			if (vetor[i] < numeromenor) {
				numeromenor = vetor[i];
			}
			somatoria += vetor[i];
		}
		media = somatoria/vetor.length;
		str = ("Número maior: ["+numeromaior+"]. Número menor ["+numeromenor+"]. A média: ["+media+"]");
		return str;
	}
}
