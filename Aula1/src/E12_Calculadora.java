import java.util.Scanner;

public class E12_Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double n1, op, numero;
		
		System.out.println("Qual o número para operação");
		n1 = entrada.nextDouble();

		System.out.println("Qual operação vai ser feita? 1 para soma, 2 para subração, 3 para multiplicação e 4 para divisão");
		op = entrada.nextDouble();

		if (op == 1) {
			n1 = n1 + 10;
			System.out.println("A soma é "+ n1);
		} else if (op == 2) {
			n1 = n1 - 10;
			System.out.println("A subtração é "+ n1);
		} else if (op == 3) {
			n1 = n1 * 10;
			System.out.println("A multiplicação é "+n1);
		} else if (op == 4) {
			n1 = n1 / 10;
			System.out.println("A divisão é "+n1);
		} else {
			System.out.println("Nenhuma operação com esse número");
		}
	}

}
