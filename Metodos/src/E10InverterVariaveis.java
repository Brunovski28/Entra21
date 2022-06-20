import java.util.Scanner;

public class E10InverterVariaveis {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o primeiro numero?");
		int numero1 = entrada.nextInt();
		
		System.out.println("Qual o segundo numero?");
		int numero2 = entrada.nextInt();

		inversao(numero1, numero2);
	}
public static void inversao(int numero1, int numero2) {
	int c = numero2;
	int d = numero1;
	
	System.out.println("O primeiro numero virou "+c);
	System.out.println("O segundo numero virou "+d);
}
}
