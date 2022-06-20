/*Crie uma array de 5 elementos e printe os últimos elementos por primeiro*/
public class Array5elementos {

	public static void main(String[] args) {
		int vetor[] = new int [5];
		int i = 4;
		vetor [0] = 1;
		vetor [1] = 2;
		vetor [2] = 3;
		vetor [3] = 4;
		vetor [4] = 5;
		
		while(i < vetor.length && i >= 0 ) {
			System.out.println(vetor[i]);
			i--;
		}

	}

}
