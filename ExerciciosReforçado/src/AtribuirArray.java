import java.util.Scanner;

public class AtribuirArray {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int vetor[] = new int [5];
		int numero = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Qual o número para atribuir?");
			numero = entrada.nextInt();
			vetor[i] = numero;
		}
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("No vetor "+(i+1)+" receberá "+vetor[i]);
		}
	}

}
