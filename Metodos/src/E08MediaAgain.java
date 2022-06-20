import java.util.Scanner;

public class E08MediaAgain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Qual a primeira nota? ");
		double nota1 = entrada.nextDouble();
		
		System.out.print("Qual a segunda nota? ");
		double nota2 = entrada.nextDouble();
		
		System.out.print("Qual a terceira nota? ");
		double nota3 = entrada.nextDouble();
		media(nota1, nota2, nota3);
	}
public static void media(double nota1, double nota2, double nota3) {
	double media = (nota1+nota2+nota3)/3;
	System.out.print("Sua nota é ");
	System.out.format("%.2f", media);
}
}
