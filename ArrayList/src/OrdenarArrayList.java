import java.util.ArrayList;

public class OrdenarArrayList {

	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		
		lista.add(3);
		lista.add(2);
		lista.add(1);
		lista.add(5);
		lista.add(4);
		
		System.out.println("Lista do jeito que foi");
		System.out.println(lista);
		lista.sort(null);
		System.out.println("Lista ordenada");
		System.out.println(lista);
	}

}
