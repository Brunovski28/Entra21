import java.util.Scanner;

public class MassaRadioativa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual a massa inicial? em Kg");
		double massa = entrada.nextDouble();
		double massaR = massa * 1000;
		int contador = 0;
		
		while (massaR > 0.5) {
			massaR = massaR/2;
			contador++;
		}
		double tempo = (contador * 50)/60;
		System.out.println("Massa inicial: "+massa+". Massa final: "+massaR+". Tempo necessário: "+tempo);
		
	}

}
