import java.util.Scanner;

public class E41_MaiorQueAMedia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double vetor[] = new double[7];
		double numero = 0;
		double media = 0;
		double somatoria = 0;
		
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Qual o número "+(i+1)+"?");
			numero = entrada.nextDouble();
			vetor[i] = numero;
			
		}
		
		for(int i = 0; i < vetor.length; i++) {
			media = media + vetor[i];
		}
		somatoria = media/7;
		
		for (int i=0; i < vetor.length; i++) {
		if(vetor[i] > somatoria) {
			System.out.println("O vetor "+(i+1)+" é maior que a média, dando "+vetor[i]);
		} else {

		}
		}
		System.out.print("Com a média dando ");
		System.out.format("%.2f", somatoria);
	}

}
