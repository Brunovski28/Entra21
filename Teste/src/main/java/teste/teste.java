package teste;
import java.util.Scanner;


class teste {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		double n1, n2, n3, n4, media; 
		System.out.println("Qual a primeira nota?");
		n1 = entrada.nextDouble();
		
		System.out.println("Qual a segunda nota?");
		n2 = entrada.nextDouble();
		
		System.out.println("Qual a terceira nota?");
		n3 = entrada.nextDouble();
		
		System.out.println("Qual a quarta nota?");
		n4 = entrada.nextDouble();
		
		media = ((n1+n2+n3+n4)/4);
		
		System.out.println("A sua média é "+media);
		if (media >= 6 ) {
			System.out.println("Aprovado");
		}	else {
			System.out.println("Reprovado");
		}
		
	}

}
