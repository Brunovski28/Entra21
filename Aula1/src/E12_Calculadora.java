import java.util.Scanner;

public class E12_Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double n1, op, numero;
		
		System.out.println("Qual o n�mero para opera��o");
		n1 = entrada.nextDouble();

		System.out.println("Qual opera��o vai ser feita? 1 para soma, 2 para subra��o, 3 para multiplica��o e 4 para divis�o");
		op = entrada.nextDouble();

		if (op == 1) {
			n1 = n1 + 10;
			System.out.println("A soma � "+ n1);
		} else if (op == 2) {
			n1 = n1 - 10;
			System.out.println("A subtra��o � "+ n1);
		} else if (op == 3) {
			n1 = n1 * 10;
			System.out.println("A multiplica��o � "+n1);
		} else if (op == 4) {
			n1 = n1 / 10;
			System.out.println("A divis�o � "+n1);
		} else {
			System.out.println("Nenhuma opera��o com esse n�mero");
		}
	}

}
