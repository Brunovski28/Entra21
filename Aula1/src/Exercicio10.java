import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 double i1, i2, i3;
		
		System.out.println("Ano de nascimento do primeiro irmão");
		i1 = entrada.nextDouble();
		
		System.out.println("Ano de nascimento do segundo irmão");
		i2 = entrada.nextDouble();
		
		System.out.println("Ano de nascimento do terceiro irmão");
		i3 = entrada.nextDouble();
		
		
		if (i1 == i2 && i2 == i3) {
			System.out.println("São trigêmeos");
		} else if (i1 == i2 || i2 == i3 || i1 == i3) {
			System.out.println("São gêmeos e um filho perdido ai");
		} else {
			System.out.println("São todos perdidos");
		}
		
		
	}

}
