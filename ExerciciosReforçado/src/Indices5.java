import java.util.Scanner;

/*Fa�a um algoritmo que descubra se uma array de 5 elementos possui o n�mero que o usu�rio entrou
Printe tamb�m o seu �ndice*/
public class Indices5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int vetor[] = new int [5];

		vetor [0] = 1;
		vetor [1] = 2;
		vetor [2] = 3;
		vetor [3] = 4;
		vetor [4] = 5;
		
		System.out.println("Qual o n�mero?");
		numero = entrada.nextInt();
		
		for (int i = 0; i < vetor.length; i++) {

			if (numero == vetor[i]) {
				System.out.println("Voc� acertou o n�mero "+vetor[i]+" e o indice � "+i);
			} 
			}
		}

	}


