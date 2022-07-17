import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		while (true) {
		System.out.println("Qual número? 1 a 4");
		numero = entrada.nextInt();
		
		if (numero > 0 & numero < 5) {
			break;
		} else {
			System.out.println("Coloque o número certo!");
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
		System.out.println("É verão");
		System.out.println("E o tempo está quente");
	}
	public static void outono() {
		System.out.println("É outono");
		System.out.println("E o tempo está foda");
	}
	public static void inverno() {
		System.out.println("É inverno");
		System.out.println("E o tempo está friozin");
	}
	public static void primavera() {
		System.out.println("É primavera");
		System.out.println("E o tempo está voltando a vida");
	}
}
