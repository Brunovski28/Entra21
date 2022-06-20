import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner BS = new Scanner (System.in);
		
		
		System.out.println("Qual o número para fatoração");
		int numero = BS.nextInt();
		int Fatorial = 1;
		
		for (int i = 1; i <= numero; i++) {
			Fatorial*=i;
		}
		
		System.out.println("Fatorial : "+Fatorial);
		
	}	

}
