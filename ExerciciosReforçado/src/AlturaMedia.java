import java.util.Scanner;

/*Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar com o número 0
Calcule a média de altura das mesmas.*/
public class AlturaMedia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double altura, media;
		altura = 0;
		media = 0;
		double contador = 0;
		while (true) {
			System.out.println("Qual a altura?");
			altura = entrada.nextDouble();
			
			if (altura == 0) {
				break;
			} else {
				contador++;
				media = media + altura;
			}
			
		}
System.out.println("A média das alturas é "+media/contador);

	}

}
