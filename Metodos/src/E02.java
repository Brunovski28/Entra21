import java.util.Scanner;

public class E02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String nome;
		System.out.println("Qual o nome?");
		nome = entrada.next();
		if (nome.equalsIgnoreCase("Bruno")) {
			bruno();
		} else 	if (nome.equalsIgnoreCase("Guilherme")) {
			guilherme();
		} else 	if (nome.equalsIgnoreCase("Mayra")) {
			mayra();
		} else 	if (nome.equalsIgnoreCase("julio")) {
			julio();
		} else {
			System.out.println("Nome errado");
		}
	}
	public static void bruno() {
		System.out.println("Nome do maromba � Brunovski");
		System.out.println("Ele tem 18 anos");
		System.out.println("O estudante mai bombado do Entra21");
	}
	public static void julio() {
		System.out.println("Nome do cabas � J�lio Adao");
		System.out.println("Ele tem 26 anos");
		System.out.println("Ele � estudante do Entra21");
	}
	public static void guilherme() {
		System.out.println("Nome do cabas � Guilherme Macedo");
		System.out.println("Ele tem 16 anos");
		System.out.println("Ele � estudante do Entra21");
	}
	public static void mayra() {
		System.out.println("Nome da gata � Mayra Becker");
		System.out.println("Ela tem 17 anos");
		System.out.println("� a mais gata do cedup");
	}
}
