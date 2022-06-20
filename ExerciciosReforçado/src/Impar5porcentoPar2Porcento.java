import java.util.Scanner;
/*
 Descreva um algoritmo que leia 12 valores decimais e os coloque em um vetor de 12 posições.
Em seguida, modifique o vetor de modo que os valores das POSIÇÕES ímpares sejam aumentados em 5% e os das posições pares sejam aumentados em 2%.
Imprima o vetor resultante
 * */
public class Impar5porcentoPar2Porcento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numero = 0;
		
		double vetor[] = new double [12];
	for(int i = 0; i < vetor.length; i++) {
		System.out.println("Qual número para o vetor?");
		numero = entrada.nextDouble();
		vetor[i] = numero;
	}
	for(int i = 0; i < vetor.length; i++) {
		if (i %2 ==0) {
			System.out.println("O indice par "+i+" teve um aumento de "+vetor[i]*1.02+" (2%)");
		} else {
			System.out.println("O indice impar "+i+" teve um aumento de "+vetor[i]*1.05+" (5%)");
		}
	}

	}

}
