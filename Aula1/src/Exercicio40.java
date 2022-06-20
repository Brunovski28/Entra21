import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double vetor[] = new double[12];
		int numero = 0;
		int qlqr = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Qual o número "+(i+1)+"°?");
			numero = entrada.nextInt();
			vetor[qlqr] = numero;

			
			if (qlqr %2==0) {
				vetor[qlqr] = vetor[qlqr]+(vetor[qlqr] * 0.02);
			} else {
				vetor[qlqr] = vetor[qlqr]+(vetor[qlqr] * 0.05);
			}
			qlqr++;
		}// fim

for (int i = 0; i < vetor.length; i++) {

	System.out.print(vetor[i]+" ");
	}
		
	}

}
