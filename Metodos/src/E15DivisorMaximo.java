import java.util.Scanner;

public class E15DivisorMaximo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("N�mero");
		int numero = entrada.nextInt();
		
		fds(numero);

	}
public static void fds(int numero) {
	for (int i = 9; i > -1; i--) {
		
		if (numero %i == 0) {
			System.out.println("M�ximo divisor comum � "+i);
			break;
		} 
	}
}
}
