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
			System.out.println("O Marquinhos � o filho mais velho, o Zezinho � o irm�o do meio e Luluzinha � a ca�ula");
		} else if (f1 > f3 && f3 > f2) {
			System.out.println("O Marquinhos � o filho mais velho, a Luluzinha � o irm� do meio e Zezinho � o ca�ula");
		} else if (f2 > f1 && f1 > f3) {
			System.out.println("O Zezinho � o filho mais velho, o Marquinhos � o irm�o do meio e Luluzinha � a ca�ula");
		} else if (f2 > f3 && f3 > f1) {
			System.out.println("O Zezinho � o filho mais velho, a Lulazinha � a irm� do meio e Marquinhos � o ca�ula");
		} else if (f3 > f1 && f1 > f2) {
			System.out.println("A Lulazinha � a filha mais velha, o Marquinhos � o irm�o do meio e Zezinho � o ca�ula");
		} else if (f3 > f2 && f2 > f1) {
			System.out.println("A Lulazinha � a filha mais velha, o Zezinho � o irm�o do meio e Marquinhos � o ca�ula");
		}
	}

}
