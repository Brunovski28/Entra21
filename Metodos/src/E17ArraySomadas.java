import java.util.Scanner;

public class E17ArraySomadas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int vetor1[] = new int [5];
		int vetor2[] = new int [5];
			for (int i = 0; i < vetor1.length; i++) {
				System.out.println("Qual o "+(i+1)+" vetor?");
				vetor1[i] = entrada.nextInt();
			}
			for (int i = 0; i < vetor2.length; i++) {
				System.out.println("Qual o "+(i+1)+" vetor?");
				vetor2[i] = entrada.nextInt();
			}
			ARRAY(vetor1, vetor2);

	}
	public static void ARRAY(int vetor1[], int vetor2[]) {
		int vetor3[] = new int [5];
		for (int i = 0; i < vetor3.length; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
		}
		for (int i = 0; i < vetor3.length; i++) {
			System.out.println("Vetor1 ["+vetor1[i]+"] Vetor2 ["+vetor2[i]+"] Soma ["+vetor3[i]+"]");
		}
	}

}
