import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 double i1, i2, i3;
		
		System.out.println("Ano de nascimento do primeiro irm�o");
		i1 = entrada.nextDouble();
		
		System.out.println("Ano de nascimento do segundo irm�o");
		i2 = entrada.nextDouble();
		
		System.out.println("Ano de nascimento do terceiro irm�o");
		i3 = entrada.nextDouble();
		
		
		if (i1 == i2 && i2 == i3) {
			System.out.println("S�o trig�meos");
		} else if (i1 == i2 || i2 == i3 || i1 == i3) {
			System.out.println("S�o g�meos e um filho perdido ai");
		} else {
			System.out.println("S�o todos perdidos");
		}
		
		
	}

}
