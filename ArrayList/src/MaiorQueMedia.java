import java.util.ArrayList;
import java.util.Scanner;

public class MaiorQueMedia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<>();
		ArrayList<Integer> listateste = new ArrayList<>();
int somatoria = 0;
int c = 0;
		for (int i = 0; i < 6; i++) {
			System.out.println("Coloque o "+(i+1)+ "° número!");
			int numero = entrada.nextInt();
			lista.add(i, numero);
			somatoria += lista.get(i);
		}
		for(int i = 0; i < 6; i++) {
			if(lista.get(i)>somatoria/6) {
				listateste.add(c, lista.get(i));
				c++;
			}
		}
		System.out.println("números maior que a média "+listateste);
	}

}
