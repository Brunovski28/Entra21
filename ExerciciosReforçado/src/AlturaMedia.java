import java.util.Scanner;

/*Descreva um algoritmo que v� lendo a altura de pessoas at� o usu�rio entrar com o n�mero 0
Calcule a m�dia de altura das mesmas.*/
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
System.out.println("A m�dia das alturas � "+media/contador);

	}

}
