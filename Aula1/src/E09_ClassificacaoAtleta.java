import java.util.Scanner;

public class E09_ClassificacaoAtleta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade;
		
		System.out.println("Qual a idade do atleta");
		idade = entrada.nextInt();
		
		if (idade < 5) {
			System.out.println("Desclassicado");
		} else if (idade > 4 && idade < 8) {
			System.out.println("Classificado para Pré-mirim");
		} else if (idade > 7 && idade < 11) {
			System.out.println("Classificado para Mirim");
		} else if (idade > 10 && idade < 14) {
			System.out.println("Classificado para Infantil");
		} else if (idade > 13 && idade < 18) {
			System.out.println("Classificado para Infanto-Juvenil");
		} else if (idade > 17 && idade < 21) {
			System.out.println("Classificado para Juvenil");
		} else if (idade > 20 && idade < 100) {
			System.out.println("Classificado para Adulto maior");
		} else {
			System.out.println("Desclassificado");
		}

	}

}
