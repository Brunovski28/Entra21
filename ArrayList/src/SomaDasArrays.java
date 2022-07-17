import java.util.ArrayList;
import java.util.Scanner;

public class SomaDasArrays {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> lista1 = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();
		ArrayList<Integer> lista3 = new ArrayList<>();
		System.out.println("Primeira lista.");
		for (int i = 0; i < 3; i++) {
			System.out.println("Qual o "+(i+1)+" número?");
			int numero = entrada.nextInt();
					lista1.add(i, numero);
		}
		System.out.println("Segunda lista.");
		for (int i = 0; i < 3; i++) {
			System.out.println("Qual o "+(i+1)+" número?");
			int numero = entrada.nextInt();
					lista2.add(i, numero);
		}
		for(int i = 0; i < 3; i++) {
			int somatoria = 0;
			somatoria = lista1.get(i) + lista2.get(i);
			lista3.add(i, somatoria);
		}
		System.out.println("-------------------------------------------");
		for(int i = 0; i < 3; i++) {
			System.out.println("Lista 1 ["+lista1.get(i)+"] Lista 2 ["+lista2.get(i)+"] Resultado ["+lista3.get(i)+"]");
		}
		System.out.println("-------------------------------------------");
	}

}
