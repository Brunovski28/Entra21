import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		
		System.out.println("Qual número?");
		n = entrada.nextInt();
		
		if (n >= 0 && n <= 10) {
			System.out.println("VERMELHO");
		} else if (n > 10 && n <= 20) {
			System.out.println("AZUL");
		} else if (n > 20 && n <= 30) {
			System.out.println("VERDE");
		} else {
			System.out.println("N/");
		}

	}

}
