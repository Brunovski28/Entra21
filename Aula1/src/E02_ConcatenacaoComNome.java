import java.util.Scanner;
public class E02_ConcatenacaoComNome {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome, sobrenome;
		System.out.println("Qual o seu nome");
		nome = entrada.nextLine();
		System.out.println("Qual o seu sobrenome");
		sobrenome = entrada.nextLine();
		
		System.out.println("Seu nome é "+nome+" "+sobrenome);

	}

}
