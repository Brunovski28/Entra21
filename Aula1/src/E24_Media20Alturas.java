import java.util.Scanner;

public class E24_Media20Alturas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int contador = 1;
		double altura = 0;
		double media = 0;
		
		while (contador <= 20) {

			System.out.println("Qual a "+contador+" altura?");
			altura = entrada.nextDouble();
			media = media + altura;
			contador = contador + 1;
			
		}
		media = media / 20;
System.out.print("A média de altura é ");
System.out.format("%.2f", media);
	}

}
