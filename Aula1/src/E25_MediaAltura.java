import java.util.Scanner;

public class E25_MediaAltura {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double altura, contador, sm;
		altura = 0;
		contador = -1;
		sm = 0;
		while (true) {
			System.out.println("Qual a altura?");
			altura = entrada.nextDouble();
				if (altura == 0 || altura < 0) {
				break;
			}
			sm = sm + altura;
			contador = contador + 1;

		}
		System.out.println("A média é "+sm/contador);
		

	}

}
