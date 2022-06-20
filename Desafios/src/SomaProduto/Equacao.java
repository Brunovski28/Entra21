package SomaProduto;

import java.util.Scanner;

public class Equacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Coeficiente A");
		double a = entrada.nextDouble();
		System.out.println("Coeficiente B");
		double b = entrada.nextDouble();
		System.out.println("Coeficiente C");
		double c = entrada.nextDouble();

		double soma = -b / a;
		double produto = c / a;

		double x1 = 0;
		double x2 = 0;
		double o = 0;
		while (x1 + x2 != soma || x1 * x2 != produto) {
			x1 += 0.5;
			x2 += 0.5;
			if (x1 > 100) {
				x1 = -100;
			}
			if (x2 > 100) {
				x2 = -99;
			}
o++;
		}
		System.out.println(x1 + " " + x2);
		System.out.println(o);
	}

}
