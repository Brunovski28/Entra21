import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double n1, n2, n3, ne, media;
		
		System.out.println("Qual foi a primeira nota?");
		n1 = entrada.nextDouble();
		
		System.out.println("Qual foi a segunda nota?");
		n2 = entrada.nextDouble();
		
		System.out.println("Qual foi a terceira nota?");
		n3 = entrada.nextDouble();
		
		System.out.println("Qual foi a nota de exercicios?");
		ne = entrada.nextDouble();
		
		media = ((n1 + n2 * 2 + n3 * 3 + ne) / 7);
		
		if (media >= 9) {
			System.out.print("Nota A com ");
			System.out.format("%.2f", media);
			System.out.print(" de média e foi aprovado");
		} else if (media >= 7.5 && media < 9) {
			System.out.print("Nota B com ");
			System.out.format("%.2f", media);
			System.out.print(" de média e foi aprovado");
		} else if (media >= 6.0 && media < 7.5 ) {
			System.out.print("Nota C com ");
			System.out.format("%.2f", media);
			System.out.print(" de média e foi aprovado");
		} else if (media >= 4.0 && media < 6) {
			System.out.print("Nota D com ");
			System.out.format("%.2f", media);
			System.out.print(" de média e foi reprovado");
		} else	{
			System.out.print("Nota E com ");
			System.out.format("%.2f", media);
			System.out.print(" de média e foi reprovado" );
		} 
	}

}
