import java.util.Scanner;

public class E04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Qual o primeiro n�mero?");
		double numero1 = entrada.nextDouble();
		
		System.out.println("Qual o segundo n�mero?");
		double numero2 = entrada.nextDouble();
		maiorigual(numero1, numero2);

	}
	public static void maiorigual(double numero1, double numero2) {
		double numeromaior = Integer.MIN_VALUE;
		if (numero1 > numeromaior) {
			numeromaior = numero1;
		} else {
			numeromaior = numero2;
		}
		System.out.println("N�mero maior � "+numeromaior);
		if (numero1 == numero2) {
			System.out.println("N�meros s�o iguais");
		}
	}
			
}
