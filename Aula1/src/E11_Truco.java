import java.util.Scanner;

public class E11_Truco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Qual a primeira carta? de 1 até 12");
		n1 = entrada.nextInt();
		
		System.out.println("Qual a segunda carta? de 1 até 12");
		n2 = entrada.nextInt();
		
		System.out.println("Qual a terceira carta? de 1 até 12");
		n3 = entrada.nextInt();
	             
		if (n1 > 0 && n1 < 4 && n2 > 0 && n2 < 4 && n3 > 0 && n3 < 4) {
			System.out.println("NOVEEEE!!!!");
		} else if (n1 == 1 && n2 == 1 || n1 == 1 && n2 == 2 || n1 == 1 && n2 == 3 || n1 == 2 && n2 == 1 || n1 == 2 && n2 == 2 
				|| n1 == 2 && n2 == 3 || n1 == 3 && n2 == 1 || n1 == 3 && n2 == 2 || n1 == 3 && n2 == 3 || n3 == 1 && n1 == 1 
				|| n3 == 1 && n1 == 2 || n3 == 1 && n1 == 3 || n3 == 2 && n1 == 1 || n3 == 2 && n1 == 2 || n3 == 2 && n1 == 3 
				|| n3 == 3 && n1 == 1 || n3 == 3 && n1 == 2 || n3 == 3 && n1 == 3 || n1 == 1 && n3 == 1 || n1 == 1 && n3 == 2
				|| n1 == 1 && n3 == 3 || n1 == 2 && n3 == 1 || n1 == 2 && n3 == 2 || n1 == 2 && n3 == 3 || n1 == 2 && n3 == 1
				|| n1 == 2 && n3 == 2 || n1 == 2 && n3 == 3 || n1 == 3 && n3 == 1 || n1 == 3 && n3 == 2 || n1 == 3 && n3 == 3) {
			System.out.println("SEIS!!!");
		} else if (n1 >= 1 && n1 <= 3 || n2 >= 1 && n2 <= 3 || n3 >= 1 && n3 <= 3 ) {
			System.out.println("TRUUCOOO!!!");
		} else if (n1 > 12 || n1 < 1 || n2 > 12 || n2 < 1 || n3 > 12 || n3 < 1 ){
			System.out.println("Tá doidão não existe esses números no truco");
		} else {
			System.out.println("Só carta ruim");
		}

	}

}

// Pode ser de outro jeito também com as duas cartas 
//else if (c1 > 0 && c1 < 4 && c2 > 0 && c2 < 4 || c1 > 0 && c1 < 4 && c3 > 0 && c3 < 4 || c2 > 0 && c2 < 4 && c3 > 0 && c3 < 4)
