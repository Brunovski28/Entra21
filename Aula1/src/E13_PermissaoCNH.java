import java.util.Scanner;

public class E13_PermissaoCNH {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double idade;
		String brasileiro;
		
		System.out.println("Qual a sua idade");
		idade = entrada.nextDouble();
		
		System.out.println("Voc� � brasileiro? sim ou n�o");
		brasileiro = entrada.next();
									
		if (idade > 17 && idade < 100 && brasileiro.equals("sim")) {
			System.out.println("Pode tirar CNH");
		} else if (idade > 10){
			System.out.println("N�o pode tirar CNH");
		} else {
			System.out.println("N�o");
		}
	}

}
