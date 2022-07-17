import java.util.Scanner;

/*Descreva um algoritmo que leia 5 números inteiros e escreva, para cada número 
lido, se o mesmo é par ou ímpar.*/
public class ParOUImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		int numero = 0;
		while (contador < 5) {
			System.out.println("Digite o número");
			numero = entrada.nextInt();
			
			if (numero % 2 == 0) {
				System.out.println("Número par");
			} else {
				System.out.println("Número impar");
			}
			contador++;
		}

	}

}
