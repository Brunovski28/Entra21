import java.util.Scanner;

public class E05_MesmaCoisaQueOexer04SohQueComOU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double idade;
		int permissao;
		
		System.out.println("Qual a sua idade");
		idade = entrada.nextDouble();
		
		System.out.println("Você tem uma permissão judicial? fale 1 se sim e 2 para não");
		permissao = entrada.nextInt();
		
		if (idade > 17 && idade <= 100 || permissao == 1) {
			System.out.println("Bora dirigir");
		} else {
			System.out.println("Não vai dirigir");
		}
	}

}
