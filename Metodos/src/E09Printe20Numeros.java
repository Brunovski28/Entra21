import java.util.Scanner;

public class E09Printe20Numeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual número?");
		double numero = entrada.nextDouble();
vaindo(numero);
	}
public static void vaindo(double numero) {
	for (int i = 0; i < 20; i++) {
		numero += 1;
		System.out.println(numero);
	}
}
}
