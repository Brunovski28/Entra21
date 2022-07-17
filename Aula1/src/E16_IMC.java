import java.util.Scanner;

public class E16_IMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double massa, altura, imc;

		System.out.println("Qual o seu peso?");
		massa = entrada.nextDouble();
		
		System.out.println("Qual a sua altura");
		altura = entrada.nextDouble();
		
		imc = massa / (altura*altura);
		
		if (imc < 18.5) {
			System.out.println("Hiper Frango de magreza com");
			System.out.format("%.2f", imc);
			System.out.print(" de IMC");
		} else if (imc > 18.4 && imc < 25) {
			System.out.println("Saudável, tá na média com");
			System.out.format("%.2f", imc);
			System.out.print(" de IMC");
		} else if ( imc > 24.9 && imc < 30) {
			System.out.println("Sobrepeso com ");
			System.out.format("%.2f", imc);
			System.out.print(" de IMC");
		} else if (imc > 29.9 && imc < 35) {
			System.out.println("Obesidade I Grau, começando a ficar potente com");
			System.out.format("%.2f", imc);
			System.out.print(" de IMC");
		} else if (imc > 34.9 && imc < 40) {
			System.out.println("Obesidade II Grau, potente com");
			System.out.format("%.2f", imc);
			System.out.print(" de IMC");
		} else {
			System.out.println("Obesidade III Grau, hiper potente com");
			System.out.format("%.2f", imc);
			System.out.print(" de IMC");
		}
	}

}
