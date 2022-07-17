import java.util.HashMap;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		
		
		for(int i = 0; i < 3; i++) {
		System.out.println("Digite o "+(i+1)+"° número");
		int numero = entrada.nextInt();
		if (numero %2==0) {
			mapa.put(numero, "Par");
		} else {
			mapa.put(numero, "Impar");
		}
		}
		System.out.println(mapa);
	}

}
