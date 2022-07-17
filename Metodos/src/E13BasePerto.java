import java.util.Scanner;
import java.lang.Math;
public class E13BasePerto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int vetor[] = new int [2];
		System.out.println("Digite o n�mero base!");
		int base = entrada.nextInt();
		for (int i = 0; i < vetor.length; i++) {
		System.out.println("Qual o "+(i+1)+" n�mero?");
		vetor[i] = entrada.nextInt();

		}
		perto(vetor, base);
		
	}
public static void perto(int vetor[], int base) {
	int c1;
	int c2; 
			c1 = vetor[0] - base;// 45 - 50 = -5
			c2 = vetor[1] - base;// 56 - 50 = 6
			int value1 = Math.abs(c1);
			int value2 = Math.abs(c2);
			if(value1>value2) {
				System.out.println("O n�mero "+vetor[1]+" � mais perto do n�mero base");
			} else {
				System.out.println("O n�mero "+vetor[0]+" � mais perto do n�mero base");
			}
		}
}

