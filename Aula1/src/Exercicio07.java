import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int data, mes;

		System.out.println("Informe o dia:");
		data = entrada.nextInt();
		System.out.println("Informe o m�s");
		mes = entrada.nextInt();
		boolean correto = false;

		if (data > 0 && data <= 30 && mes <= 12 && mes > 0) {
			correto = true;

			if (mes == 2 && data > 29) {
				System.out.println("Data inv�lida");
			} else {
				System.out.println("Data v�lida");

			}

		} else if (correto == false) {
			System.out.println("Data inv�lida");
		}

	}

}
