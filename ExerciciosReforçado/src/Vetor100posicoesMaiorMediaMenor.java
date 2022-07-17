import java.util.Scanner;

/*Crie um vetor de 100 posi��es
O usu�rio vai colocando valores decimais at� ele colocar o char n
Calcular:
a) Qual o menor n�mero
b) Qual o maior n�mero
c) Calcular a m�dia
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
			System.out.println("Qual o n�mero?");
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
		System.out.println("Menor n�mero � "+menorvalor);
		System.out.println("Maior n�mero � "+maiorvalor);
		System.out.println("A m�dia dos n�meros � " + resultado / contador);
	}

}
