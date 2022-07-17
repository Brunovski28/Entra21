import java.util.ArrayList;
import java.util.Scanner;

public class MaiorMenorMediaArray {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Double> lista = new ArrayList<>();
		int c=0;
		double numero;
		char n;
		double somatoria = 0;
		while(true) {
			System.out.println("Deseja prosseguir?");
			n = entrada.next().charAt(0);
			if(n == 'n' || n == 'N') {
				break;
			}
			System.out.println("Qual o "+(c+1)+" número?");
			numero = entrada.nextDouble();
					lista.add(numero);
					c++;
		}
		lista.sort(null);
		System.out.println(lista);
		System.out.println("Maior valor é "+lista.get(c-1));
		System.out.println("Menor valor é "+lista.get(0));
		
		for (int i = 0; i < c; i++) {
			somatoria += lista.get(i);
		}
		System.out.println("A média é "+somatoria/c);
	}

}
