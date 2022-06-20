import java.util.Scanner;

public class E16StringParImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Qual palavra?");
		String palavra = entrada.next();
		
		palavra(palavra);

	}
public static void palavra(String palavra) {
	if (palavra.length()%2 == 0) {
		System.out.println("A primeira letra da palavra par é "+palavra.charAt(0));
	} else {
		System.out.println("A segunda letra da palavra impar é "+palavra.charAt(1));
	}
}
}
