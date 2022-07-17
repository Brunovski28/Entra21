import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double vetor[] = new double[4];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Qual o "+(i+1)+" numero? ");
			vetor[i] = entrada.nextDouble();
		}
		soma(vetor);
	}
	
	
	public static void soma(double vetor[]) {
		
		double resultado = vetor[0] + vetor[1] + vetor[2] + vetor[3];
		System.out.println("Resultado da soma: "+resultado);
	}


}