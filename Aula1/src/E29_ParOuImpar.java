import java.util.Scanner;

public class E29_ParOuImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int i = 1;
		
		while (i <= 5) {
			System.out.println("Qual número?");
			numero = entrada.nextInt();
			
			if (numero % 2 == 0 ) {
				System.out.println("PAR");
			} else {
				System.out.println("IMPAR");
			}
			i++;
		}

	}

}
