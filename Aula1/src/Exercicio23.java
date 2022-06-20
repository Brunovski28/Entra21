import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, n3, n4, n5, contador;
		
		contador = 0;
		System.out.println("De 0 a 1000");
		System.out.println("Qual o primeiro número?");
		n1 = entrada.nextInt();
		
		System.out.println("Qual o segundo número?");
		n2 = entrada.nextInt();
		
		System.out.println("Qual o terceiro número?");
		n3 = entrada.nextInt();
		
		System.out.println("Qual o quarto número?");
		n4 = entrada.nextInt();
		
		System.out.println("Qual o quinto número?");
		n5 = entrada.nextInt();
		
		while (contador < 1001) {
			contador++;
			if (contador == n1 || contador == n2 || contador == n3 || contador == n4 || contador == n5) {

				System.out.print(contador+" ");
			}	else {
				System.out.println("Número inválido");
				break;
			}
		}


	}

}
