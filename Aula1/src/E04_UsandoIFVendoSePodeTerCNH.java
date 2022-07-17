import java.util.Scanner;

public class E04_UsandoIFVendoSePodeTerCNH {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double idade;
		boolean brasileiro;
		
		System.out.println("Qual a sua idade");
		idade = entrada.nextDouble();
		
		System.out.println("Você é brasileiro?");
		brasileiro = entrada.nextBoolean();
									// OU
		if (idade > 17 && idade < 100 || brasileiro == true) {
			System.out.println("Pode tirar CNH");
		} else if (idade > 10){
			System.out.println("Não pode tirar CNH");
		} else {
			System.out.println("Não");
		}
	}

}