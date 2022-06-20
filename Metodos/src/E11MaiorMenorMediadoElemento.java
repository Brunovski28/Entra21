import java.util.Scanner;

public class E11MaiorMenorMediadoElemento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetor[] = new int[5];
				for (int i = 0; i < vetor.length; i++) {
		System.out.println("Qual o "+(i+1)+" numero?");
		vetor[i] = entrada.nextInt();
		}
				maior(vetor);
				menor(vetor);
				media(vetor);
	}
	public static void maior(int vetor[]) {
		int numeromaior = Integer.MIN_VALUE;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > numeromaior) {
				numeromaior = vetor[i];
			} 
			
		}
	
		System.out.println("Número maior é "+numeromaior);

	}
	public static void menor(int vetor[]) {
		int numeromenor = Integer.MAX_VALUE;
		for (int i = 0; i < vetor.length; i++) {
		if (vetor[i] < numeromenor) {
			numeromenor = vetor[i];
		}
		}
		System.out.println("Número menor é "+numeromenor);
	}
	public static void media(int vetor[]) {
		int somatoria = 0;
		for (int i = 0; i < vetor.length; i++) {
			somatoria = somatoria + vetor[i];
		}
		somatoria = somatoria/vetor.length;
		System.out.println("Média dos números é "+somatoria);
	}
}
