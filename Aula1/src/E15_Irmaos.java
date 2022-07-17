import java.util.Scanner;

public class E15_Irmaos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int f1, f2, f3;
		
		System.out.println("Qual a idade do primeiro filho(Marquinhos)");
		f1 = entrada.nextInt();
		
		System.out.println("Qual a idade do segundo filho(Zezinho)");
		f2 = entrada.nextInt();
		
		System.out.println("Qual a idade do terceiro filho(Luluzinha)");
		f3 = entrada.nextInt();
		
		if (f1 > f2 && f2 > f3) {
			System.out.println("O Marquinhos é o filho mais velho, o Zezinho é o irmão do meio e Luluzinha é a caçula");
		} else if (f1 > f3 && f3 > f2) {
			System.out.println("O Marquinhos é o filho mais velho, a Luluzinha é o irmã do meio e Zezinho é o caçula");
		} else if (f2 > f1 && f1 > f3) {
			System.out.println("O Zezinho é o filho mais velho, o Marquinhos é o irmão do meio e Luluzinha é a caçula");
		} else if (f2 > f3 && f3 > f1) {
			System.out.println("O Zezinho é o filho mais velho, a Lulazinha é a irmã do meio e Marquinhos é o caçula");
		} else if (f3 > f1 && f1 > f2) {
			System.out.println("A Lulazinha é a filha mais velha, o Marquinhos é o irmão do meio e Zezinho é o caçula");
		} else if (f3 > f2 && f2 > f1) {
			System.out.println("A Lulazinha é a filha mais velha, o Zezinho é o irmão do meio e Marquinhos é o caçula");
		}
	}

}
