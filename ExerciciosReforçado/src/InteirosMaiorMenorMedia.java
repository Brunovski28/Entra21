import java.util.Scanner;

/*Descreva um algoritmo que leia v� lendo n�meros inteiros at� o usu�rio entrar com o n�mero 0
a) Qual � o menor valor?
b) Qual � o maior valor?
c) Qual � a m�dia dos valores?*/
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
			System.out.println("Qual o n�mero?");
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
		System.out.println("Menor valor � "+numeromenor);
		System.out.println("Maior valor � "+numeromaior);
		System.out.println("A m�dia � "+resultado/contador);
	}
}