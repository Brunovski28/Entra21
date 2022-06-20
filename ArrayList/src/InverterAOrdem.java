import java.util.ArrayList;

public class InverterAOrdem {

	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		ArrayList invertidalista = new ArrayList();
		int c = 0;
		lista.add(3);
		lista.add(2);
		lista.add(1);
		lista.add(5);
		lista.add(4);
		System.out.println("Lista normal");
		System.out.println(lista);
		System.out.println("");
		System.out.println("Lista invertida");
		for (int i = 4; i >= 0; i--) {
			invertidalista.add(c, lista.get(i));
			c++;
		}
		System.out.println(invertidalista);
	}

}
