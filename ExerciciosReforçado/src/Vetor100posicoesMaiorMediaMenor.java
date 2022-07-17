import java.util.Scanner;

/*Crie um vetor de 100 posições
O usuário vai colocando valores decimais até ele colocar o char n
Calcular:
a) Qual o menor número
b) Qual o maior número
c) Calcular a média
*/
public class Vetor100posicoesMaiorMediaMenor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double vetor[] = new double[100];
		int contador = 0;
		double resultado = 0;
		double numero = 0.01;
		char para;
		double maiorvalor = Integer.MIN_VALUE;
		double menorvalor = Integer.MAX_VALUE;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Qual o número?");
			numero = entrada.nextDouble();
			vetor[i] = numero;
			System.out.println("Deseja continuar?");
			para = entrada.next().charAt(0);
			contador++;
			resultado = resultado + numero;
			if (vetor[i] > maiorvalor) {
				maiorvalor = vetor[i];
			}
			if (vetor[i] < menorvalor) {
				menorvalor = vetor[i];
			}
			if (para == 'n') {
				break;
			}

		}
		System.out.println("Menor número é "+menorvalor);
		System.out.println("Maior número é "+maiorvalor);
		System.out.println("A média dos números é " + resultado / contador);
	}

}
