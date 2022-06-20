import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double altura, massa, imc;
		
		while(true) {
		System.out.println("Qual a altura?");
		altura = entrada.nextDouble();
		System.out.println("Qual a sua massa?");
		massa = entrada.nextDouble();
		if (massa > 0 && massa < 300 && altura > 0) {
		break;
		} else {
			System.out.println("Valor impossivel!");
		}
		}
		imc = massa / (altura * altura);
		System.out.print("Seu imc é ");
		System.out.format("%.2f e está ", imc);
		
		if (imc < 18.5) {
			System.out.println("magro! seu frango. (< 18.5)");
		} else if (imc > 18.4 && imc < 25) {
			System.out.println("saudável, é tá na média, pato. (> 18.4 & < 25)");
		} else if (imc > 24.9 && imc < 30) {
			System.out.println("sobrepeso ou tá muito potente de força. (> 24.9 & < 30)");
		} else if (imc > 29.9 && imc < 35) {
			System.out.println("Obesidade Grau I. (> 24.9 & < 30)");
		} else if (imc > 34.9 && imc < 40) {
			System.out.println("Obesidade Grau II. (> 34.9 & < 40)");
		} else {
			System.out.println("Obesidade Grau III. (> 40)");
		}
		/* 

IMC = Massa / Altura²

Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, 
de acordo com a seguinte tabela:

< 18.5 Magreza
18.5 – 24.9 Saudável
25.0 – 29.9 Sobrepeso
30.0 – 34.9 Obesidade Grau I
35.0 – 39.9 Obesidade Grau II (severa)
> 40.0 Obesidade Grau III (morbida)
		 * */

	}

}
