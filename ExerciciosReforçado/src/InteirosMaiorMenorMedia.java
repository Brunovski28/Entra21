import java.util.Scanner;

/*Descreva um algoritmo que leia vá lendo números inteiros até o usuário entrar com o número 0
a) Qual é o menor valor?
b) Qual é o maior valor?
c) Qual é a média dos valores?*/
public class InteirosMaiorMenorMedia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero, resultado;
		numero = 0;
		resultado = 0;
		int contador = 0;
		int numeromaior = Integer.MIN_VALUE;
		int numeromenor = Integer.MAX_VALUE;
		while (true) {
			System.out.println("Qual o número?");
			numero = entrada.nextInt();

			if (numero == 0) {
				break;
			} else {
				contador++;
				resultado = resultado + numero;
			}
			if (numero > numeromaior) {
				numeromaior = numero;
			} if (numero < numeromenor)
				numeromenor = numero;
		}//while fim
		System.out.println("Menor valor é "+numeromenor);
		System.out.println("Maior valor é "+numeromaior);
		System.out.println("A média é "+resultado/contador);
	}
}