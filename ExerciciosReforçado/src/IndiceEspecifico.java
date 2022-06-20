import java.util.Scanner;
/*Faça um algoritmo em que o usuário insere um número em um índice específico que ele mesmo informo*/
public class IndiceEspecifico {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int vetor[] = new int [5];
		int i = 0;
		vetor [0] = 1;
		vetor [1] = 2;
		vetor [2] = 3;
		vetor [3] = 4;
		vetor [4] = 5;
		
		while (true) {
			System.out.println("Qual índice você quer ver?");
			i = entrada.nextInt();
			
			if (i >= 0 && i < 5) {
				System.out.println("Seu indice é "+i+" e vetor "+vetor[i]);
				break;
			} else {
				System.out.println("Índice inválido");
			}
		}

	}

}
