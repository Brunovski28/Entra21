import java.util.ArrayList;
import java.util.Scanner;

public class Impar5Par2 {

	public static void main(String[] args) {
		ArrayList<Double> lista = new ArrayList<>();
			Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Qual o "+(i+1)+"° número?");
			double numero = entrada.nextDouble();
			lista.add(i, numero);
		}
		for(int i = 0; i < 5; i++) {
			if (lista.get(i)%2 == 0) {
				System.out.println("Par "+lista.get(i)*1.02);
			} else {
				System.out.println("Impar "+lista.get(i)*1.05);
			}
		}
	}

}
