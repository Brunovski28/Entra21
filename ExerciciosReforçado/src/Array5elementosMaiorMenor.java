/*Crie uma array de 5 elementos e descubra:
a) Qual o maior elemento
b) Qual o menor elemento
c) A m�dia dos elementos*/
public class Array5elementosMaiorMenor {

	public static void main(String[] args) {
		int vetor[] = new int[5];
		vetor[0] = 1;
		vetor[1] = 2;
		vetor[2] = 3;
		vetor[3] = 4;
		vetor[4] = 5;
		int media = 0;
		int maiorvalor = Integer.MIN_VALUE;
		int menorvalor = Integer.MAX_VALUE;

		for (int i = 0; i < vetor.length; i++) {
			media = media + vetor[i];
			if (vetor[i] > maiorvalor) {
				maiorvalor = vetor[i];
			}
			if (vetor[i] < menorvalor) {
				menorvalor = vetor[i];
			}
		}
		System.out.println("Maior elemento � "+maiorvalor);
		System.out.println("Menor elemento � "+menorvalor);
		System.out.println("A m�dia dos elementos � "+media/vetor.length);
		
	}

}
