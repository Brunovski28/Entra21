import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		while (true) {
		System.out.println("Qual n�mero? 1 a 4");
		numero = entrada.nextInt();
		
		if (numero > 0 & numero < 5) {
			break;
		} else {
			System.out.println("Coloque o n�mero certo!");
		}
		}// fim while
		if (numero == 1) {
			verao();
		} else if (numero == 2) {
			outono();
		} else if (numero == 3) {
			inverno();
		} else if (numero == 4) {
			primavera();
		}
		
	}
	public static void verao(){
		System.out.println("� ver�o");
		System.out.println("E o tempo est� quente");
	}
	public static void outono() {
		System.out.println("� outono");
		System.out.println("E o tempo est� foda");
	}
	public static void inverno() {
		System.out.println("� inverno");
		System.out.println("E o tempo est� friozin");
	}
	public static void primavera() {
		System.out.println("� primavera");
		System.out.println("E o tempo est� voltando a vida");
	}
}
