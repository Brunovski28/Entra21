import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	double n;
		System.out.println("Digite o número");
	n = entrada.nextDouble();
	
	if (n > 0) {
		System.out.println("Número positivo!");
	} else if (n < 0) {
		System.out.println("Número negativo!");
	} else {
		System.out.println("Número nulo!");
	}
	

	}

}
