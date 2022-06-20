import java.util.ArrayList;
import java.util.Scanner;

public class Indice {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<>();

		System.out.println("Quantos índices vai ter?");
		int indices = entrada.nextInt();
		for (int i = 0; i < indices; i++) {
			lista.add(i, null);
		}
		for (int i = 0; i < indices; i++) {
		System.out.println("Qual número?");
		int numero = entrada.nextInt();
		System.out.println("Em qual indice?");
		int indice = entrada.nextInt();
		lista.remove(indice);
// ou tu faz lista.set 
		lista.add(indice, numero);
		}
		System.out.println(lista);
	}

}
