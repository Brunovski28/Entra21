import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	double n;
		System.out.println("Digite o n�mero");
	n = entrada.nextDouble();
	
	if (n > 0) {
		System.out.println("N�mero positivo!");
	} else if (n < 0) {
		System.out.println("N�mero negativo!");
	} else {
		System.out.println("N�mero nulo!");
	}
	

	}

}
