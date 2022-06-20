import java.util.Scanner;

public class E12StarWars {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		String nome = entrada.next();
		System.out.println("Qual o seu sobrenome?");
		String sobrenome = entrada.next();
		System.out.println("Qual o sobrenome de sua mãe?");
		String sobrenomemae = entrada.next();
		System.out.println("Qual o nome da cidade que você nasceu?");
		String cidade = entrada.next();
generateStarWarsName(nome, sobrenome, sobrenomemae, cidade);
		

	}
public static void generateStarWarsName(String nome, String sobrenome, String sobrenomemae, String cidade) {
	System.out.print(sobrenome.charAt(0));
	System.out.print(sobrenome.charAt(1));
	System.out.print(sobrenome.charAt(2));
	System.out.print(nome.charAt(0));
	System.out.print(nome.charAt(1));
	System.out.print(" ");
	System.out.print(sobrenomemae.charAt(0));
	System.out.print(sobrenomemae.charAt(1));
	System.out.print(cidade.charAt(0));
	System.out.print(cidade.charAt(1));
	System.out.print(cidade.charAt(2));
}
}
