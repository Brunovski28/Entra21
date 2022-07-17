import java.util.Scanner;

public class E14CINCOESCOLHIDO {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Número 1 ");
		int numero1 = entrada.nextInt();
		System.out.println("Número 2 ");
		int numero2 = entrada.nextInt();
		operacao(numero1, numero2);
		

	}
public static void operacao(int numero1, int numero2) {
	if (numero1 == 5 || numero2 == 5) {
		numero1 = numero1 * numero1 * numero1;
		numero2 = numero2 * numero2 * numero2;
	}else if ((numero1 + numero2)== 5) {
		numero1 = numero1 * numero1 * numero1;
		numero2 = numero2 * numero2 * numero2;
	}else if ((numero1 - numero2)== 5) {
		numero1 = numero1 * numero1 * numero1;
		numero2 = numero2 * numero2 * numero2;
	} else {
		numero1 = numero1 * numero1;
		numero2 = numero2 * numero2;
	}
	System.out.println("Número 1 ["+numero1+"] Número 2 ["+numero2+"]");
	
}
}
