import java.util.Scanner;

/*Descreva um algoritmo que leia 5 n�meros inteiros e escreva, para cada n�mero 
lido, se o mesmo � par ou �mpar.*/
public class ParOUImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		int numero = 0;
		while (contador < 5) {
			System.out.println("Digite o n�mero");
			numero = entrada.nextInt();
			
			if (numero % 2 == 0) {
				System.out.println("N�mero par");
			} else {
				System.out.println("N�mero impar");
			}
			contador++;
		}

	}

}
